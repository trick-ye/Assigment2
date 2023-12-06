import java.util.Scanner

fun main() {
    // Test the functions
    checkOddOrEven()
    checkPalindrome()
}

fun checkOddOrEven() {
    val scanner = Scanner(System.`in`)
    print("Enter a number to check if it's odd or even: ")
    val number = scanner.nextInt()

    if (isEven(number)) {
        println("$number is even.")
    } else {
        println("$number is odd.")
    }
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun checkPalindrome() {
    val scanner = Scanner(System.`in`)
    print("Enter a string to check if it's a palindrome: ")
    val inputString = scanner.nextLine().toLowerCase()

    if (isPalindrome(inputString)) {
        println("$inputString is a palindrome.")
    } else {
        println("$inputString is not a palindrome.")
    }
}

fun isPalindrome(str: String): Boolean {
    val cleanStr = str.replace("\\s+".toRegex(), "")
    return cleanStr == cleanStr.reversed()
}
