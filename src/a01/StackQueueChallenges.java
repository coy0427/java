package a01;

import edu.princeton.cs.algs4.Queue;

/**
 * Exercises to practice the use of stacks and queues.
 * 
 * @author CSIS 2420 Starter Code + [Your Name]
 */
public class StackQueueChallenges {

	
	/**
	 * Checks if the brackets in the input queue are balanced.
	 * A sequence is balanced if each opening bracket has a corresponding 
	 * closing bracket in the correct order.
	 * 
	 * Examples of balanced sequences:
	 * - Queue: [( { [ ] } )] => true
	 * - Queue: a{(B) {[]C}}d => true
	 * - Queue: empty queue => true
	 * 
	 * Examples of unbalanced sequences:
	 * - Queue: ([{ ] }) => false
	 * - Queue: [{ }]] () => false
	 * - Queue: { => false
	 * 
	 * @param q the input queue containing the characters of the expression
	 * @return true if the brackets are balanced, false otherwise
	 */
	public static boolean balanceBrackets(Queue<Character> q) {
	    // This method needs to be implemented using classes Stack and/or Queue from algs4.jar.
	    // No arrays, Java collections, nor StringBuilder may be used.
	    
	    return false; // TODO
	}


	/**
	 * Reverses the order of words in the input queue.
	 * Words are defined as any sequence of characters that does not include spaces.
	 * Words in the input queue can be separated by one or more spaces. However, 
	 * the Iterable returned separates the words in reverse order by single spaces.
	 * 
	 * Examples: 
	 * - Queue: [H e l l o   W o r l d] => [W o r l d   H e l l o]
	 * - Queue: [T o   b e   o r   n o t   t o   b e] => [b e   t o   n o t   o r   b e   T o]
	 * - Queue: [1   a b   2 . 2   C S 1 4 1 0] => [C S 1 4 1 0   2 . 2   a b   1]
	 * - Queue: [      ] => []
	 * - Queue: [] => []
	 * 
	 * @param q the input queue containing the characters of the sentence
	 * @return the queue with the order of words reversed
	 */
	public static Iterable<Character> reverseWords(Queue<Character> q) {
	    // This method needs to be implemented using classes Stack and/or Queue from algs4.jar.
	    // No arrays, Java collections, nor StringBuilder may be used.
		
		return null; // TODO
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
