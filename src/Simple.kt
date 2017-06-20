/**
 * Here we have a class with a primary constructor and a member function.
 * Note that there's no `new` keyword used to create an object.
 * See http://kotlinlang.org/docs/reference/classes.html#classes
 */
class Greeter(val name: String) {
    //return void
    fun greet() {
        println("Hello, $name")
    }

    //return object
    fun str(): String {
        return "1"
    }
}

fun main(args: Array<String>) {
    Greeter(args[0]).greet()
}