import java.util.Scanner

fun main() {
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

fun subtractMatrices() {
    val scanner = Scanner(System.`in`)
    print("Enter the number of rows and columns for the matrices: ")
    val rowsColumns = scanner.nextInt()

    println("Enter the elements of the first matrix:")
    val matrix1 = createMatrix(rowsColumns, scanner)

    println("Enter the elements of the second matrix:")
    val matrix2 = createMatrix(rowsColumns, scanner)

    val resultMatrix = subtractMatrices(matrix1, matrix2)

    println("Resultant Matrix (First Matrix - Second Matrix):")
    printMatrix(resultMatrix)
}

fun createMatrix(rowsColumns: Int, scanner: Scanner): Array<IntArray> {
    val matrix = Array(rowsColumns) { IntArray(rowsColumns) }

    for (i in 0 until rowsColumns) {
        for (j in 0 until rowsColumns) {
            matrix[i][j] = scanner.nextInt()
        }
    }

    return matrix
}

fun subtractMatrices(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray> {
    val resultMatrix = Array(matrix1.size) { IntArray(matrix1[0].size) }

    for (i in matrix1.indices) {
        for (j in matrix1[i].indices) {
            resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j]
        }
    }

    return resultMatrix
}

fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        println(row.joinToString(" "))
    }
}
