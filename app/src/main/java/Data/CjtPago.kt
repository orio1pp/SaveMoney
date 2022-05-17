package Data

class CjtPago {
    private val cjtpagos = ArrayList<Pago>()
    public fun setPago(cantidad:Int, tipo:String, Mes:Int, Ano:Int){
        val pago = Pago(cantidad,tipo, Mes, Ano);
        cjtpagos.add(pago)

    }

}