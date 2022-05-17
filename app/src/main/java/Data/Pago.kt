package Data

class Pago(val cantidad:Int, val name: String, Mes:Int, Ano:Int) {
    fun getCantida() : Int{
        return this.cantidad;
    }
    fun getNam() : String{
        return this.name;
    }
}