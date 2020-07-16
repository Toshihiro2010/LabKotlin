package tutorial

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {

    var p1: Product = Product("apple", 20.0)
    var p2 = Product("banana", 40.0)

    println("product p1 name: ${p1.name} , price: ${p1.price}")


    var sedan = Sedan()
    println("cashRate : ${sedan.cashRate()}")
    println("eCashRate : ${sedan.eCashRate()}")

    var listProduct: MutableList<Product> = mutableListOf<Product>();


    listProduct.add(p1)
    listProduct.add(p2)
    listProduct.getOrNull(0)?.price




    println("listProduct : ${listProduct.size}")

}

fun test(){
    println("Hello World")

}