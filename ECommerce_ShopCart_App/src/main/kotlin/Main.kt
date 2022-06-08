fun  main(args: Array<String>){
    val cart: ShopCart = ShopCart()

    val item1 = ShopItem("1", "itemA")
    val item2 = ShopItem("2", "itemB")

    cart.add(item1)
    cart.add(item2)
    print(cart.getElements())
}