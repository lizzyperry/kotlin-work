// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("PIZZA MENU") //menu setups stuff
    println()
    println("(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood")
    println("(d) Hawaiian")
    println()
    print("Choose your pizza (a-d): ")
    val choice = readln().lowercase() //read input in lowercase duh
    val message = if (choice.length == 1 && choice[0] in 'a'..'d') {
        "Order accepted"
    } else {
        "Invalid choice!"
    }
    println(message)
}
