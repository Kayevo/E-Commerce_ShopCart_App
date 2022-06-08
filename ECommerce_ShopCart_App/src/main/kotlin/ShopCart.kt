interface Cart<T> {
    fun add(element: T)
    fun remove(element: T)
}

interface Item {
    var id: String
    var name: String
    var quantity: Int

    fun addQuantity()
}

class ShopItem(override var id: String, override var name: String) : Item {
    override var quantity: Int = 0
    override fun addQuantity() {
        quantity++
    }
}


class ShopCart : Cart<Item> {
    private var totalPrice: Double = 0.0
    private var elements: MutableList<Item> = mutableListOf()
    private var existElement: Boolean = false

    override fun add(element: Item) {
        if (elements.contains(element)) {
            element.addQuantity()
            elements[elements.indexOf(element)] = element
        } else {
            elements.add(element)
        }
    }

    override fun remove(element: Item) {
        if (elements.contains(element)) {
            elements.removeAt(elements.indexOf(element))
        } else {
            elements.add(element)
        }
    }

    fun printElements() {
        for (element in elements) {
            println(element.name)
        }
    }
}
