package org.ahmet.collections;

        import java.util.HashSet;
        import java.util.LinkedHashSet;
        import java.util.Set;
        import java.util.TreeSet;

        public class SetsPractices {

            public static void main(String[] args) {

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
                Set<Integer> treeSet = new TreeSet<>();
                treeSet.add(50);
                treeSet.add(20);
                treeSet.add(30);
                treeSet.add(10);
                treeSet.add(40);
                treeSet.add(20); // Duplicate, won't be added
                try {
                    treeSet.add(null); // Adding null will throw NullPointerException
                } catch (NullPointerException e) {
                    System.out.println("\nTreeSet does not allow null values: " + e.getMessage());
                }
                System.out.println("\nTreeSet contents: " + treeSet); // Sorted output
                System.out.println("First element: " + ((TreeSet<Integer>) treeSet).first()); // Access first element
                System.out.println("Last element: " + ((TreeSet<Integer>) treeSet).last()); // Access last element
                treeSet.remove(30); // Remove an element
                System.out.println("TreeSet after removal: " + treeSet);
                System.out.println("TreeSet size: " + treeSet.size()); // Check size
            }
        }