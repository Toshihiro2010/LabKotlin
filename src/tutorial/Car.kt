package tutorial

open class Car {

    var isOpen: Boolean? = false;
    private var sit: Int? = 4


    var model: String? = null
    var color: String? = null

    constructor(model: String, color: String) {
        this.model = model
        this.color = color
    }

    constructor(color: String){
        this.color = color
    }


    open fun start(){
        this.isOpen = true
    }


    open fun stop() {

        this.isOpen = false
    }

    companion object{
        open fun burn(){
            println("Burn...............")
        }
    }
}