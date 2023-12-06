import java.util.Scanner

fun main() {
    // Test the functions
    checkOddOrEven()
    checkPalindrome()
    calculateArraySumAndAverage()
    searchInArray()
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

fun calculateArraySumAndAverage() {
    val scanner = Scanner(System.`in`)
    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val array = IntArray(size)

    println("Enter the elements of the array:")
    for (i in 0 until size) {
        array[i] = scanner.nextInt()
    }

    val sum = array.sum()
    val average = array.average()

    println("Sum of the elements: $sum")
    println("Average of the elements: $average")
}

fun searchInArray() {
    val scanner = Scanner(System.`in`)
    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val array = arrayOfNulls<String>(size)

    println("Enter the elements of the array:")
    for (i in 0 until size) {
        array[i] = scanner.next()
    }

    print("Enter the search string: ")
    val searchString = scanner.next()

    if (array.contains(searchString)) {
        println("$searchString is found in the array.")
    } else {
        println("$searchString is not found in the array.")
    }
}
