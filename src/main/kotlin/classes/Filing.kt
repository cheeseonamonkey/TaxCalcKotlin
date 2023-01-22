package classes

/* a tax filing for an individual */
class Filing(
    val incomeGross :Double,
    val bracketGroup :TaxBracketGroup = TaxBracketGroup.new2022(),
) {
    init {
        bracketGroup.brackets.forEach {
            if(incomeGross >= it.minRange)
                it.taxableGross = incomeGross - (it.minRange + (incomeGross-it.maxRange))
        }
    }

    val totalTax :Double get() {
        var taxsum = 0.0;
        bracketGroup.brackets.forEach { taxsum += it.tax }
        return taxsum
    }
    override fun toString(): String =
        "\n-------------------------------\nFiling:\n\nGrossIncome: $incomeGross\nTotal tax due:$totalTax\nBracket breakdown: $bracketGroup\n\n-------------------------------"

}




//
//extensions:

fun Double.isBetween(min:Double, max:Double) :Boolean =
    (this in min..max)
fun Double.isBetween(min:Long, max:Long) =
    this.isBetween(min.toDouble(), max.toDouble())




