import com.rsk.Person

fun main(args: Array<String>) {
    println("Hello World")

    // val says that `kevin` is immutable, you CANNOT reassing a new value to kevin
    val kevin = Person("Kevin")

    kevin.display()

    kevin.Name = "Steve"

    println("My name is ${kevin.Name}")


    kevin = Person()
}