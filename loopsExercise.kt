package com.example.aprendiendokotlin

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`) // Create a Scanner object to read user input
    var size = 0 // Initialize the size of the array to zero
    while (size <= 0) { // Loop until a valid size is entered
        print("Enter the size of the array: ")
        try { // Try to read an integer from the user
            size = scanner.nextInt()
            if (size <= 0) { // If the size is not positive, print an error message
                println("Error: Array size must be greater than 0.")
            }
        } catch (e: InputMismatchException) { // If the user did not enter an integer, print an error message
            println("Error: You must enter a valid integer.")
            scanner.next() // Clear the scanner's buffer
        }
    }
    val array = IntArray(size) // Create an array of integers with the specified size
    for (i in 0 until size) { // Loop through each element of the array
        var element = 0 // Initialize the current element to zero
        while (element == 0) { // Loop until a valid integer is entered
            print("Enter element $i of the array: ")
            try { // Try to read an integer from the user
                element = scanner.nextInt()
            } catch (e: InputMismatchException) { // If the user did not enter an integer, print an error message
                println("Error: You must enter a valid integer.")
                scanner.next() // Clear the scanner's buffer
            }
        }
        array[i] = element // Set the current element of the array to the entered value
    }
    println()
    println("The array you entered is:")
    printArray(array) // Print the array in normal order
    println()
    println("The array in reverse order is:")
    printArrayInReverse(array) // Print the array in reverse order
    println()
    println("The sum of the array elements is: ${sumArrayElements(array)}") // Print the sum of the array elements
}

fun printArray(array: IntArray) { // Function to print the array in normal order
    for (element in array) { // Loop through each element of the array
        print("$element ") // Print the current element followed by a space
    }
    println() // Print a newline character
}

fun printArrayInReverse(array: IntArray) { // Function to print the array in reverse order
    for (i in array.indices.reversed()) { // Loop through each index of the array in reverse order
        print("${array[i]} ") // Print the element at the current index followed by a space
    }
    println() // Print a newline character
}

fun sumArrayElements(array: IntArray): Int { // Function to sum the elements of the array
    var sum = 0 // Initialize the sum to zero
    for (element in array) { // Loop through each element of the array
        sum += element // Add the current element to the sum
    }
    return sum // Return the sum
}