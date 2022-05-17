package Data

class Pago(val cantidad:Int, val name: String) {
    fun getCantida() : Int{
        return this.cantidad;
    }
    fun getNam() : String{
        return this.name;
    }
}