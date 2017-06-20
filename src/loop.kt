fun main(args: Array<String>) {
    println("while loop:")
    whileLoop("2","3","4")
    println()
    println("for loop:")
    forLoop("2","3","4")
}

/**
 * `while` and `do..while` work as usual.
 * See http://kotlinlang.org/docs/reference/control-flow.html#while-loops
 */
fun whileLoop(vararg args: String) {//vararg关键字：可变参数
    var i = 0
    while (i < args.size)
        println(args[i++])

    // or
    println()
    i = 0
    do {
        println(args[i++])
    }while (i < args.size)
}

/**
 * For loop iterates through anything that provides an iterator.
 * See http://kotlinlang.org/docs/reference/control-flow.html#for-loops
 */
fun forLoop(vararg args: String) {
    for (arg in args)
        println(arg)

    // or
    println()
    for (i in args.indices)
        println(args[i])
}