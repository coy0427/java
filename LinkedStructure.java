package m01;

/**
 * A simple sequential linked structure that stores integer values.
 * 
 * <p>This structure maintains references to the first (head) and last (tail) elements 
 * but does not track the total number of elements. No field should be added or removed.</p>
 * 
 * @author CS starter code + [YourName] (TODO replace YourName with your name)
 */
public class LinkedStructure {
    private Node head;
    private Node tail;

    private static class Node {
        int data;
        Node next;
    }

    /**
     * Adds a new element at the end of the structure.
     * 
     * @param value the value to add
     */
    public void add(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null; // New node will be the last one
        
        if (head == null)
            head = newNode;
        else
            tail.next = newNode;
        tail = newNode;
    }

    /**
     * Checks whether the last element is a multiple of the first.
     * 
     * E.g., [ 5 10 20 ] .. true (20 is a multiple of 5)
     * E.g., [ 3 8 ] .. false (8 is not a multiple of 3)
     * E.g., [ 0 10 ] .. false (division by zero)
     * E.g., [ 0 0 ] .. false (undefined, students should check before dividing)
     * E.g., [ 7 ] .. true (the single element is the first and the last; 7 is a multiple of 7)
     * E.g., [ ] .. false (no element)
     * 
     * @return true if the last element is a multiple of the first, false otherwise
     */
    public boolean isLastMultipleOfFirst() {
        // CHALLENGE 2: Implement this method as described in the doc comment.
    	
        return false; // TODO 
    }
    
    /**
     * Counts the number of elements that have fewer than three digits.
     * E.g., [ 99 444 -7 12345 ] .. 2 small digits
     * E.g., [ -100 100 ] .. 0 small digits
     * E.g., [ ] .. 0 small digits
     * 
     * @return the count of elements with fewer than three digits
     */
    public int countSmallNumbers() {
        // CHALLENGE 3: Implement this method as described in the doc comment.
    	
        return 0; // TODO  
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString() + "]";
    }
    
    // = = = = Test Client = = = = =

    public static void main(String[] args) {
        // Use this test method to verify that your code works as expected, and
    	// to demonstrate your testing abilities. 
    	// I included a few lines of code to help you get started.
    	// 
    	// - Test each methods that required implementation.
    	// - Test for typical input, edge cases, and unusual inputs.
    	// - Ensure your code handles empty structures correctly.
    	// - Validate your implementation against the expected behavior described in the doc comments.

        LinkedStructure list = new LinkedStructure();
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(list);

    }
}
