import java.util.Scanner

fun main() {
    // Test each function
    checkOddOrEven()
    checkPalindrome()
    calculateArraySumAndAverage()
    searchInArray()
    subtractMatrices()
}

fun checkOddOrEven() {
    val scanner = Scanner(System.`in`)
    print("Enter a number to check if it's odd or even: ")
    val number = scanner.nextInt()

    if (number % 2 == 0) {
        println("$number is even.")
    } else {
        println("$number is odd.")
    }
}

fun checkPalindrome() {
    val scanner = Scanner(System.`in`)
    print("Enter a string to check if it's a palindrome: ")
    val inputString = scanner.nextLine().toLowerCase()

    val reversedString = inputString.reversed()

    if (inputString == reversedString) {
        println("$inputString is a palindrome.")
    } else {
        println("$inputString is not a palindrome.")
    }
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

fun subtractMatrices() {
    val scanner = Scanner(System.`in`)
    print("Enter the number of rows: ")
    val rows = scanner.nextInt()
    print("Enter the number of columns: ")
    val columns = scanner.nextInt()

    println("Enter the elements of the first matrix:")
    val matrix1 = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            matrix1[i][j] = scanner.nextInt()
        }
    }

    println("Enter the elements of the second matrix:")
    val matrix2 = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            matrix2[i][j] = scanner.nextInt()
        }
    }

    val resultMatrix = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j]
        }
    }

    println("Resultant Matrix (First Matrix - Second Matrix):")
    for (row in resultMatrix) {
        println(row.joinToString(" "))
    }
}
