package m01;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

/**
/**
 * Stack/Queue Challenge.
 * 
 * @author CS starter code + ....... (TODO replace dots with your name)
 */
public class StackQueueChallenge {

    /**
     * Processes an input queue by reversing its order, filtering out odd numbers,
     * and returning an Iterable<Integer> with only the even numbers in reversed order.
     * The input queue must not be modified.
     * 
     * Implementation Requirements:
     * - Use only Stack and Queue from algs4.jar
     * - Do not use arrays or classes from java.util
     * 
     * Corner Cases:
     * - If the queue is empty, return an empty Iterable<Integer>.
     * - If the queue is null, return null.
     * 
     * Examples:
     * - Input: [ 4, 7, 10, 15, 20 ] → Output: [ 20, 10, 4 ] (odd numbers removed, even numbers reversed)
     * - Input: [ 3, 1, 5, 7 ] → Output: [ ] (no even numbers)
     * - Input: [ 8, 2, 6, 4 ] → Output: [ 4, 6, 2, 8 ] (all even numbers reversed)
     * - Input: [ ] → Output: [ ] (empty input returns empty output)
     * - Input: null → Output: null
     * 
     * @param queue the input queue of integers
     * @return an Iterable<Integer> with the even numbers in reversed order
     */
    public static Iterable<Integer> processQueue(Queue<Integer> queue) {
        // CHALLENGE 1: Implement this method as described in the doc comment.

        return null; // TODO
    }

    public static void main(String[] args) {
        // Use this test method to verify that your code works as expected, and
    	// to demonstrate your testing abilities. 
    	// I included a few lines of code to help you get started.
    	// 
    	// - Test each methods that required implementation.
    	// - Test for typical input, edge cases, and unusual inputs.
    	// - Ensure your code handles empty structures correctly.
    	// - Validate your implementation against the expected behavior described in the doc comments.

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(4);
        queue.enqueue(7);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        printTestResult(queue);
    }

    /**
     * Displays the test results in a clear and concise way.
     * 
     * @param queue input data
     */
    private static void printTestResult(Queue<Integer> queue) {
        StdOut.printf("queue: %-20s  processQueue: ", queue);
        Iterable<Integer> result = processQueue(queue);
        for (int num : result) {
            StdOut.print(num + " ");
        }
        StdOut.println();
    }
}