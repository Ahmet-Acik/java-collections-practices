package org.ahmet.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractices {

    public static void main(String[] args) {

        // **PriorityQueue**: Elements are ordered based on their natural ordering or a comparator
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the queue
        priorityQueue.add(30); // Adds element to the queue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(40);

        System.out.println("PriorityQueue: " + priorityQueue); // Elements are ordered

        // Accessing the head of the queue without removing it
        System.out.println("Head of the queue (peek): " + priorityQueue.peek());

        // Removing elements from the queue
        System.out.println("Removed element (poll): " + priorityQueue.poll()); // Removes the head
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        // Adding a null value (not allowed in PriorityQueue)
        try {
            priorityQueue.add(null); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("PriorityQueue does not allow null values: " + e.getMessage());
        }

        // Checking if the queue contains a specific element
        System.out.println("Contains 20? " + priorityQueue.contains(20));

        // Clearing the queue
        priorityQueue.clear();
        System.out.println("Is PriorityQueue empty after clear? " + priorityQueue.isEmpty());

        // Using a PriorityQueue with custom comparator (reverse order)
        Queue<String> customQueue = new PriorityQueue<>((a, b) -> b.compareTo(a));
        customQueue.add("Banana");
        customQueue.add("Apple");
        customQueue.add("Cherry");

        System.out.println("\nCustom PriorityQueue (reverse order): " + customQueue);
        System.out.println("Removed element (poll): " + customQueue.poll());
        System.out.println("Custom PriorityQueue after poll: " + customQueue);
    }
}