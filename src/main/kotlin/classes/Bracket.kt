package classes

/* range of income */
class Bracket(
    percentTaxed :Long,  //whole pctg
    val minRange :Double,
    val maxRange :Double,
    var taxableGross :Double? = null
){
    val percentTaxed = percentTaxed.toDouble() / 100.0
    val tax :Double get()=
        (taxableGross ?: 0.0) * percentTaxed

    override fun toString(): String {
        return "-  Bracket:\n     \$$minRange - $$maxRange\n     taxRate:   \t$percentTaxed\n     taxableGross:\t$$taxableGross\n       (calculatedtax: $$tax)"
    }
}


