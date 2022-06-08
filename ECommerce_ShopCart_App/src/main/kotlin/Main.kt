fun  main(args: Array<String>){
    val cart: ShopCart = ShopCart()

    val item1 = ShopItem("1", "itemA", 10.0)
    val item2 = ShopItem("2", "itemB", 20.0)

    cart.add(item1)
    cart.add(item2)
    cart.add(item1)
    cart.remove(item1)
    println(cart.getItens())
    println(cart.getTotal())
}