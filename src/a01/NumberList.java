package a01;

import java.util.NoSuchElementException;

/**
 * NumberList is a singly-linked list of double values.
 * It is designed as a practice opportunity to
 * learn how to manipulate linked structures.
 * 
 * @author CS Starter Code + [Your Name]
 */
public class NumberList {
    private Node head; // first node of the list or null
    private Node tail; // last node of the list or null
    private int n;     // number of elements in the list

    /**
     * Node of LinkedList that stores the item and a
     * single reference to the next node.
     */
    private static class Node {
        private double item;
        private Node next;
    }
    
    /**
     * Returns the number of elements in the list.
     * 
     * @return the number of elements in the list.
     */   
    public int size() {
        return n;
    }
      
    /** 
     * Determines whether the list is empty or not.
     * 
     * @return true if there are no elements in the list, false otherwise.
     */
    public boolean isEmpty() {
        return n == 0;
    }
    
    /** 
     * Adds a node containing the new item at the end of the list.
     * 
     * @param item the item to be added to the list.
     */
    public void add(double item) {
        Node newNode = new Node();
        newNode.item = item;
        
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        n++;
    }
    
    /**
     * Returns the first element of the list.
     * 
     * Example: 
     * [1.1, 2.5, 3.0, 4.4, 5.5] -> returns 1.1
     * 
     * @return the first element.
     * @throws NoSuchElementException if the list is empty.
     */
    public double firstElement() {    
        return 0d; // TODO
    }
    
    /**
     * Determines if the last element is a negative number.
     * 
     * @return true if the last element is negative, false otherwise.
     * @throws IllegalStateException if the list is empty.
     */
    public boolean endsNegative() {
        return false; // TODO
    }
    
    /**
     * Calculates and returns the product of all elements in the linked list.
     *
     * Example: 
     * [1.5, 2.2, 3.0, 4.4] -> returns 43.56 // 1.5 * 2.2 * 3 * 4.4
     *
     * @return the product of the elements in the linked list.
     * @throws IllegalStateException if the list is empty.
     */
    public double product() {
        return 0d; // TODO
    }
    
    /**
     * Inserts a new item at the specified index in the linked list.
     * The index should be in the range [0, n], where n is the current size of the list.
     * If the index is equal to n, the item is added to the end of the list.
     *
     * Example: index = 2 and item = 0.5
     * [1.1, 2.5, 3.0, 4.4, 5.5] -> [1.1, 2.5, 0.5, 3.0, 4.4, 5.5]
     * 
     * @param index the index at which the new item will be inserted.
     * @param item the item to be inserted into the linked list.
     * @throws IndexOutOfBoundsException if the index is outside the valid range [0, n].
     */
    public void insert(int index, double item) {
        // TODO
    }
    
    /**
     * Rotates the linked list to the left by a specified number 
     * of positions in a cyclic manner.
     * If the list is empty or <code>positions</code> is a multiple of n, no rotation 
     * will be performed.
     *     
     * Example: positions = 2
     * [1.1, 2.2, 3.3, 4.4, 5.5] -> [3.3, 4.4, 5.5, 1.1, 2.2]
     *
     * Example: positions = 6
     * [1.1, 2.2, 3.3, 4.4, 5.5] -> [2.2, 3.3, 4.4, 5.5, 1.1]
     * 
     * @param positions the number of positions to rotate the linked list to the left.
     * @throws IllegalArgumentException if the number of positions is not positive.
     */
    public void rotateLeft(int positions) {
        // TODO
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        
        while (current != null) {
            sb.append(current.item).append(" ");
            current = current.next;
        }
        
        return sb.toString().trim();
    }
    
    /* * * * * * * * Test Client * * * * * * */
	
    public static void main(String[] args) {
        // Use this test method to verify that your code works as expected.
    	// 
    	// - Test each methods that required implementation.
    	// - Test for typical input, edge cases, and unusual inputs.
    	// - Ensure your code handles empty structures correctly.
    	// - Validate your implementation against the expected behavior described in the doc comments.
    	
    	// TODO
    }
}
