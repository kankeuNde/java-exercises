package com.amigoscode._4_datastructures._5_linkedlists;

// Exercise: LinkedList vs ArrayList Performance Comparison
// Understand when to use LinkedList vs ArrayList by measuring operation times.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

    public static void main(String[] args) {

        // TODO: 1 - Create both an ArrayList<Integer> and a LinkedList<Integer>
        //           Fill each with 10000 elements (0 to 9999) using a for loop
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(i);
            linkedList.add(i);
        }


        // TODO: 2 - Measure time to add an element at the beginning (index 0) for both lists
        //           Use System.nanoTime() before and after the operation
        //           Perform the add(0, value) operation 1000 times for each list
        //           Print the time taken for each in milliseconds
        //           (divide nanoseconds by 1_000_000 to get milliseconds)
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(0,i);
        }
        long end = System.nanoTime();
        long res = (end - start)/1_000;

        long start2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0,i);
        }
        long end2 = System.nanoTime();
        long res2 = (end2 - start2)/1_000;
        System.out.println("List insertion time at the beginning: " + res);
        System.out.println("LinkedList insertion time at the beginning: " + res2);


        // TODO: 3 - Measure time to add an element at the end for both lists
        //           Perform the add(value) operation 1000 times for each list
        //           Print the time taken for each
        long start3 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        long end3 = System.nanoTime();
        long res3 = (end3 - start3)/1_000;

        long start4 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        long end4 = System.nanoTime();
        long res4 = (end4 - start4)/1_000;
        System.out.println("List insertion time at the end: " + res3);
        System.out.println("LinkedList insertion time at the end: " + res4);



        // TODO: 4 - Measure time to get an element at the middle index for both lists
        //           Perform get(list.size() / 2) operation 1000 times for each list
        //           Print the time taken for each
        long start5 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.get(list.size() / 2);
        }
        long end5 = System.nanoTime();
        long res5 = (end5 - start5)/1_000;
        System.out.println("List reading time in the middle: " + res5);

        long start6 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.get(list.size() / 2);
        }
        long end6 = System.nanoTime();
        long res6 = (end6 - start6)/1_000;
        System.out.println("Linkedlist reading time in the middle: " + res6);


        // TODO: 5 - Print a summary explaining the differences
        //           Use System.out.println() to explain:
        //           - Why LinkedList is faster for insertions at the beginning
        //           - Why ArrayList is faster for random access (get by index)
        //           - When you would choose one over the other
        System.out.println("""
    LinkedList is faster for insertions at the beginning because it is made of nodes \
    (each node has a pointer to the previous and the next node). To add an element at \
    the beginning, it just creates a new node and links it as the new head: O(1).
    ArrayList is slow for insertions at the beginning because it must shift all \
    existing elements one position to the right: O(n).

    ArrayList is faster for random access because the address of an element is \
    computed directly with the formula: start_address + i * element_size: O(1).
    LinkedList must go through the nodes one by one (starting from the closest end) \
    to reach the requested element: O(n).

    For insertions at the end, both are O(1), so performance is similar.

    The choice depends on the most frequent operations:
    - Many reads by index, few insertions at the beginning -> ArrayList
    - Many insertions/removals at the beginning, few reads by index -> LinkedList
      (or better, ArrayDeque)
    In most real programs, ArrayList is the default choice.
    """);
    }
}
