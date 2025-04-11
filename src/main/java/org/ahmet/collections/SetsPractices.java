package org.ahmet.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsPractices {

    public static void main(String[] args) {

        /**
         * Key Updates:
         * 1. **HashSet**: Demonstrates unordered behavior, no duplicates, and allows one `null` value, Backed by a HashMap internally.
         *    - Covers `add`, `remove`, `contains`, `size`, and `clear` methods.
         * 2. **LinkedHashSet**: Highlights insertion order preservation and allows one `null` value, Backed by a HashMap internally.
         *    - Covers `add`, `remove`, and `clear` methods.
         * 3. **TreeSet**: Illustrates sorted order (natural ordering or custom comparator), no duplicates, and disallows `null` values.
         *    - Covers `add`, `remove`, `first`, `last`, and `size`, `headSet`, `tailSet`, `subSet` methods.
         */

        // **HashSet**: Unordered, no duplicates, allows one null value
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Bird");
        hashSet.add("Dog"); // Duplicate, won't be added
        hashSet.add("Fish");
        hashSet.add(null); // Adding null
        hashSet.add(null); // Adding null again, won't be added one null value is allowed
        System.out.println("HashSet contents: " + hashSet); // Unordered output
        System.out.println("Contains 'Cat': " + hashSet.contains("Cat")); // Check existence
        hashSet.remove("Bird"); // Remove an element
        System.out.println("HashSet after removal: " + hashSet);
        System.out.println("HashSet size: " + hashSet.size()); // Check size
        hashSet.clear(); // Clear all elements
        System.out.println("Is HashSet empty? " + hashSet.isEmpty()); // Check if empty

        // **LinkedHashSet**: Maintains insertion order,  no duplicates, allows one null value
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple"); // Duplicate, won't be added
        linkedHashSet.add("Date");
        linkedHashSet.add(null); // Adding null
        linkedHashSet.add(null); // Adding null again, won't be added one null value is allowed
        System.out.println("\nLinkedHashSet contents: " + linkedHashSet); // Maintains insertion order
        linkedHashSet.remove("Banana"); // Remove an element
        System.out.println("LinkedHashSet after removal: " + linkedHashSet);


        // **TreeSet**: Sorted order, no duplicates, does not allow null values
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(40);

        System.out.println("TreeSet contents: " + treeSet); // Sorted output

        // Access first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Additional methods
        // headSet: Get elements less than 40
        System.out.println("HeadSet (less than 40): " + treeSet.headSet(40));

        // tailSet: Get elements greater than or equal to 30
        System.out.println("TailSet (greater than or equal to 30): " + treeSet.tailSet(30));

        // subSet: Get elements between 20 (inclusive) and 50 (exclusive)
        System.out.println("SubSet (20 to 50): " + treeSet.subSet(20, 50));

        // Remove an element
        treeSet.remove(30);
        System.out.println("TreeSet after removal: " + treeSet);

        // Check size
        System.out.println("TreeSet size: " + treeSet.size());
    }
}