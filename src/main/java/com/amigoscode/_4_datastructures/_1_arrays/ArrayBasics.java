package com.amigoscode._4_datastructures._1_arrays;

// Exercise: Array Basics
// Learn how to create, manipulate, and search through arrays in Java.

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        // TODO: 1 - Create an int array of size 5
        int[] arr = new int[5];


        // TODO: 2 - Fill the array with values 10, 20, 30, 40, 50 using a for loop
        //           (hint: use i * 10 + 10 or similar pattern)
        for(int i=arr.length - 1; i>=0; i--){
            arr[i] =  50 - 10*i;
        }


        // TODO: 3 - Print all elements of the array using Arrays.toString()
        System.out.println(Arrays.toString(arr));

        // TODO: 4 - Find the maximum value in the array
        //           Iterate through the array and track the largest value found
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum value is " + max);
        int min = arr[0];
        // TODO: 5 - Find the minimum value in the array
        //           Iterate through the array and track the smallest value found
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimum value is " + min);
        // TODO: 6 - Sort the array using Arrays.sort()
        //           Then print the sorted array

        Arrays.sort(arr);
        Arrays.toString(arr);

        // TODO: 7 - Use Arrays.binarySearch() to find the index of value 30
        //           Note: the array must be sorted before using binarySearch
        //           Print the index where the value was found
        System.out.println("Sorted array is " + Arrays.toString(arr));
        int indexOf30 = Arrays.binarySearch(arr, 30);
        System.out.println("Index of 30 is " + indexOf30);
    }
}
