package org.ahmet.collections;

import java.util.*;

public class ListsPractices {

    public static void main(String[] args) {

        /**
         * Key Updates:
         * 1. **ArrayList**: Demonstrates fast random access, iteration, and modification methods.
         *    - Covers `add`, `remove`, `get`, `size`, and `sort` methods.
         * 2. **LinkedList**: Highlights efficient insertions and deletions.
         *    - Covers `addFirst`, `addLast`, `removeFirst`, `removeLast`, and `getFirst` methods.
         * 3. **Vector**: Illustrates thread-safe operations and capacity management.
         *    - Covers `add`, `remove`, `capacity`, and `get` methods.
         * 4. **Stack**: Demonstrates LIFO operations.
         *    - Covers `push`, `pop`, `peek`, and `isEmpty` methods.
        **/

        // **ArrayList**: Best for frequent access and iteration
        List<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("First element: " + arrayList.get(0)); // Fast random access
        System.out.println("Last element: " + arrayList.get(arrayList.size() - 1));
        arrayList.add("Fig"); // Adding an element
        arrayList.remove("Banana"); // Removing an element
        System.out.println("Modified ArrayList: " + arrayList);
        arrayList.sort(String::compareTo); // Sorting
        System.out.println("Sorted ArrayList: " + arrayList);

        // **LinkedList**: Best for frequent insertions and deletions
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Lion", "Tiger", "Elephant", "Giraffe", "Zebra"));
        System.out.println("\nLinkedList: " + linkedList);
        linkedList.addFirst("Panda"); // Adding at the beginning
        linkedList.addLast("Kangaroo"); // Adding at the end
        System.out.println("Modified LinkedList: " + linkedList);
        System.out.println("First element: " + linkedList.getFirst()); // Accessing first element
        System.out.println("Last element: " + linkedList.getLast()); // Accessing last element
        linkedList.removeFirst(); // Removing first element
        linkedList.removeLast(); // Removing last element
        System.out.println("After removals: " + linkedList);

        // **Vector**: Synchronized, thread-safe list
        Vector<Integer> vector = new Vector<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("\nVector: " + vector);
        vector.add(60); // Adding an element
        vector.remove(2); // Removing an element by index
        System.out.println("Modified Vector: " + vector);
        System.out.println("Capacity of Vector: " + vector.capacity()); // Checking capacity
        System.out.println("Element at index 1: " + vector.get(1)); // Accessing an element

        // **Stack**: LIFO (Last In, First Out) operations
        Stack<String> stack = new Stack<>();
        stack.push("Red"); // Push elements onto the stack
        stack.push("Blue");
        stack.push("Green");
        System.out.println("\nStack: " + stack);
        System.out.println("Top element: " + stack.peek()); // Peek at the top element
        System.out.println("Popped element: " + stack.pop()); // Pop the top element
        System.out.println("Stack after pop: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty()); // Check if stack is empty
    }
}