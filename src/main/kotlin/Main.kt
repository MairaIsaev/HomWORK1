import java.lang.IllegalArgumentException
import java.util.Scanner

fun main(args: Array<String>) {

    val defeultUser = User("User","user123@gmail.com",15,987654321)
    val scanner = Scanner(System.`in`)
    print("Введите имя пользователя: ")
    val userName = scanner.nextLine()
    print("Введите email: ")
    val email = scanner.nextLine()
    print("Введите возраст: ")
    val age = scanner.nextInt()
    print("Введите пороль: ")
    val password = scanner.nextInt()

    val userInputUser = User(userName, email, age, password)
    try {
        userInputUser.verify(defeultUser)
    } catch (e: IllegalArgumentException){
        println(e.message)

    }    }
