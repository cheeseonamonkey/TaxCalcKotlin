package classes

/* collection of tax rates for a year */
class TaxBracketGroup {
    val brackets: List<Bracket>
    constructor(b: List<Bracket>){
        brackets = b
    }

    companion object {
        //hard-coded default (each year's brackets vary irl)
        fun new2022() = TaxBracketGroup(
            mutableListOf<Bracket>(
                Bracket(10, 0.0, 10275.0),
                Bracket(12, 10276.0, 41775.0),
                Bracket(22, 41776.0, 89075.0),
                Bracket(24, 89076.0, 170_050.0),
                Bracket(32, 170_051.0, 215_950.0),
                Bracket(35, 215_951.0, 539_900.0),
                Bracket(37, 539901.0, Double.MAX_VALUE)  //sloppy
        ))
    }

    override fun toString(): String {
        var a = ""
        brackets.forEach {
            if(it.tax != null  &&  it.tax > 0.0)
                a += "\n$it"
        }
        return a
    }
}

