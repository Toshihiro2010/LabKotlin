package labLearning

import com.google.gson.Gson
import tutorial.Bus
import tutorial.Car
import tutorial.Product
import java.io.File
import java.lang.Exception
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.util.*


fun main(args: Array<String>) {

    var a1: Int? = 20
    val a2: Int? = 20


    var s1:String = "Toshihiro"
    println("S1 => $s1")

    var product: Product = Product()


    var bus: Bus = Bus("Toyota", "red")

    bus.start()
    hello(s1)


}

fun hello(str: String) {
    println("Hello.. $str")

}