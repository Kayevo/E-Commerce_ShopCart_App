interface Cart<T> {
    fun add(element: T)
    fun remove(element: T)
}

interface Item {
    var id: String
    var name: String
}

class ShopItem(override var id: String,
               override var name: String) : Item {
}


class ShopCart : Cart<Item> {
    private var totalPrice: Double = 0.0
    private var elements: MutableMap<Item, Int> = mutableMapOf()

    override fun add(element: Item) {
        if (elements.contains(element)){
            elements[element] = elements.getValue(element) + 1
        } else {
            elements.put(element, 1)
        }
    }

    override fun remove(element: Item) {
        /*if (elements.contains(element)) {
            elements.removeAt(elements.indexOf(element))
        } else {
            elements.add(element)
        }*/
    }

    fun printElements() {
        for ((itens, quantity) in elements) {
            print(itens.name+" ")
            print(quantity)
            println()
        }
    }
}
