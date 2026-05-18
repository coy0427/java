package a01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Queue;

class StackQueueChallenges_StudentTests {
	
	// = = = balancedBrackets = = =

    @Test
    public void balanceBrackets_properlyNested_withTextFrontAndBack() {
        Queue<Character> input = new Queue<>();
        for (char ch : "a{(B) {[]C}}d".toCharArray()) {
            input.enqueue(ch);
        }
        assertTrue(StackQueueChallenges.balanceBrackets(input));
    }

    @Test
    public void balanceBrackets_emptyQueue() {
        Queue<Character> input = new Queue<>();
        assertTrue(StackQueueChallenges.balanceBrackets(input));
    }

    @Test
    public void balanceBrackets_notProperlyNested() {
        Queue<Character> input = new Queue<>();
        for (char ch : "([{ ] })".toCharArray()) {
            input.enqueue(ch);
        }
        assertFalse(StackQueueChallenges.balanceBrackets(input));
    }
    
    @Test
    public void balanceBrackets_singleOpening() {
        Queue<Character> input = new Queue<>();
        for (char ch : "{".toCharArray()) {
            input.enqueue(ch);
        }
        assertFalse(StackQueueChallenges.balanceBrackets(input));
    }
    
    // = = = reverseWords = = =	    

    @Test
    public void reverseWords_multipleWords() {
        Queue<Character> input = new Queue<>();
        for (char ch : "To be or not to be".toCharArray()) {
            input.enqueue(ch);
        }
        Iterable<Character> reversed = StackQueueChallenges.reverseWords(input);
        StringBuilder result = new StringBuilder();
        for (char ch : reversed) {
            result.append(ch);
        }
        assertEquals("be to not or be To", result.toString());
    }
    
    @Test
    public void reverseWords_singleWord() {
        Queue<Character> input = new Queue<>();
        for (char ch : "Hello".toCharArray()) {
            input.enqueue(ch);
        }
        Iterable<Character> reversed = StackQueueChallenges.reverseWords(input);
        StringBuilder result = new StringBuilder();
        for (char ch : reversed) {
            result.append(ch);
        }
        assertEquals("Hello", result.toString());
    }
    
    @Test
    public void reverseWords_leadingAndTrailingSpaces() {
        Queue<Character> input = new Queue<>();
        for (char ch : "  Hello world  ".toCharArray()) {
            input.enqueue(ch);
        }
        Iterable<Character> reversed = StackQueueChallenges.reverseWords(input);
        StringBuilder result = new StringBuilder();
        for (char ch : reversed) {
            result.append(ch);
        }
        assertEquals("world Hello", result.toString());
    }

    @Test
    public void reverseWords_onlySpaces() {
        Queue<Character> input = new Queue<>();
        for (char ch : "     ".toCharArray()) {
            input.enqueue(ch);
        }
        Iterable<Character> reversed = StackQueueChallenges.reverseWords(input);
        StringBuilder result = new StringBuilder();
        for (char ch : reversed) {
            result.append(ch);
        }
        assertEquals("", result.toString());
    }

}
