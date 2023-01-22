import classes.Filing

fun main(args: Array<String>) {

    println("\n==========================\nhello!\n==========================\n")

    print("enter gross income:  ")
    val gross = readln().toDouble()
    println()

    val a = Filing(gross)

    println(a)


}