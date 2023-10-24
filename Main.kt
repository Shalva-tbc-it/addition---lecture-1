fun main() {

    var answer = "y"

    while (answer.uppercase() == "Y") {
        var x: Int? = null
        var y: Int? = null
        println("შეიყვანე მნიშვნელობა.")

        while (x == null || y == null) {
            print("შეიყვანე X: ")
            val inputX = readlnOrNull()
            print("შეიყვანე Y: ")
            val inputY = readlnOrNull()

            if (inputX != null && inputX.matches(Regex("-?\\d+")) &&
                inputY != null && inputY.matches(Regex("-?\\d+"))
            ) {
                x = inputX.toInt()
                y = inputY.toInt()
            } else {
                println("არასწორი მნიშვნელობაა! შეიყვანეთ მხოლოდ რიცხვები.")
            }
        }

        println("$x და $y ჯამი არის: ${x + y}")
        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")

        answer = readln()
    }
    println("დასასრული!")

}