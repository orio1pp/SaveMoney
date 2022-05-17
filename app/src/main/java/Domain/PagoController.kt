package Domain

import Data.CjtPago

class PagoController {
    private val cjtPago = CjtPago();
    public fun setPago(cantidad:Int, tipo:String, mes:Int, Ano:Int){
        cjtPago.setPago(cantidad, tipo, mes, Ano);
    }
}