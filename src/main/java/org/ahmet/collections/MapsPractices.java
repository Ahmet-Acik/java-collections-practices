package org.ahmet.collections;

import java.util.*;

public class MapsPractices {

    public static void main(String[] args) {

        // **Map**: Interface for storing key-value pairs with unique keys
         /**
          * Key Characteristics:
          * 1. **HashMap**:
          *    - Unordered, allows one `null` key and multiple `null` values.
          *    - Key methods: `put`, `remove`, `keySet`, `values`, `entrySet`.
          * 2. **LinkedHashMap**:
          *    - Maintains insertion order, allows one `null` key and multiple `null` values.
          *    - Key methods: `put`, `remove`, `keySet`, `values`, `entrySet`.
          * 3. **TreeMap**:
          *    - Sorted by keys, does not allow null keys but allows null values.
          *    - Key methods: `put`, `remove`, `keySet`, `values`, `entrySet`, firstKey(), lastKey(), subMap(), headMap(), tailMap().
          * 4. **Hashtable**:
          *    - Thread-safe, does not allow null keys or null values.
          *    - Key methods: `put`, `remove`, `keySet`, `values`, `entrySet`.
          */

        // **HashMap**: Unordered, allows one null key and multiple null values
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");
        hashMap.put("A", "Apricot"); // Duplicate key, value will be replaced
        hashMap.put(null, "Date"); // Null key
        hashMap.put("D", null); // Null value
        hashMap.put("E", null); // Another null value
        System.out.println("HashMap: " + hashMap); // Unordered output
        System.out.println("HashMap keySet: " + hashMap.keySet()); // Keys
        System.out.println("HashMap values: " + hashMap.values()); // Values
        System.out.println("HashMap entrySet: " + hashMap.entrySet()); // Key-value pairs

        // **LinkedHashMap**: Maintains insertion order, allows one null key and multiple null values
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("X", "Xylophone");
        linkedHashMap.put("Y", "Yak");
        linkedHashMap.put("Z", "Zebra");
        linkedHashMap.put("X", "Xenon"); // Duplicate key, value will be replaced
        linkedHashMap.put(null, "Yellow"); // Null key
        linkedHashMap.put("W", null); // Null value
        System.out.println("\nLinkedHashMap: " + linkedHashMap); // Maintains insertion order
        System.out.println("LinkedHashMap keySet: " + linkedHashMap.keySet());
        System.out.println("LinkedHashMap values: " + linkedHashMap.values());
        System.out.println("LinkedHashMap entrySet: " + linkedHashMap.entrySet());

        // **TreeMap**: Sorted by keys, does not allow null keys but allows null values
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("K", "Kite");
        treeMap.put("J", "Jaguar");
        treeMap.put("L", "Lion");
        treeMap.put("K", "Koala"); // Duplicate key, value will be replaced
        treeMap.put("M", null); // Null value
        try {
            treeMap.put(null, "Monkey"); // Null key, will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("\nTreeMap does not allow null keys: " + e.getMessage());
        }
        System.out.println("\nTreeMap: " + treeMap); // Sorted by keys
        System.out.println("TreeMap keySet: " + treeMap.keySet());
        System.out.println("TreeMap values: " + treeMap.values());
        System.out.println("TreeMap entrySet: " + treeMap.entrySet());

        // **Hashtable**: Synchronized, does not allow null keys or null values
        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("P", "Pineapple");
        hashtable.put("Q", "Quail");
        hashtable.put("R", "Rabbit");
        hashtable.put("P", "Peach"); // Duplicate key, value will be replaced
        try {
            hashtable.put(null, "Raspberry"); // Null key, will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("\nHashtable does not allow null keys: " + e.getMessage());
        }
        try {
            hashtable.put("S", null); // Null value, will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Hashtable does not allow null values: " + e.getMessage());
        }
        System.out.println("\nHashtable: " + hashtable); // Unordered output
        System.out.println("Hashtable keySet: " + hashtable.keySet());
        System.out.println("Hashtable values: " + hashtable.values());
        System.out.println("Hashtable entrySet: " + hashtable.entrySet());
    }
}