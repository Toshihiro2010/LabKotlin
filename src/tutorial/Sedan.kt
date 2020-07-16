package tutorial

class Sedan : Vehicle {

    init {
        println("init Sedan")
    }

    override fun cashRate(): Int {

        Thread.sleep(2000)
        return 40
    }

    override fun eCashRate(): Int {


        return 100
    }
}