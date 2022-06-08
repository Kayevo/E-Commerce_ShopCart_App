interface Cart<T> {
    fun add(item: T)
    fun remove(item: T)
}

interface Item {
    var id: String
    var name: String
    var price: Double
}

class ShopItem(override var id: String,
               override var name: String,
               override var price: Double) : Item {
}


class ShopCart : Cart<Item> {
    private var totalPrice: Double = 0.0
    private var itens: MutableMap<Item, Int> = mutableMapOf()

    override fun add(item: Item) {
        if (itens.contains(item)){
            itens[item] = itens.getValue(item) + 1
        } else {
            itens.put(item, 1)
        }
    }

    override fun remove(item: Item) {
        if(itens.contains(item)){
            if(itens[item] == 1){
                itens.remove(item)
            }else{
                itens[item] = itens.getValue(item) - 1
            }
        }
    }

    fun getItens(): String {
        var itensList: String = ""
        for ((item, quantity) in itens) {
            itensList += "Name: ${item.name} Quantity: ${quantity} \n"
        }

        return itensList
    }

    fun getTotal(): Double{
        var totalPrice: Double = 0.0
        for ((item, quantity) in itens) {
            totalPrice += item.price * quantity
        }

        return totalPrice
    }
}
