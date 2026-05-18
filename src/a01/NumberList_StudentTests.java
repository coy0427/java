package a01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

public class NumberList_StudentTests {
    private NumberList list;
    private NumberList list3;
    private NumberList list5;
    private final double DELTA = 0.000001;

    @BeforeEach
    public void setUp() {
        list = new NumberList();
        
        list3 = new NumberList();
        list3.add(1.1);
        list3.add(2.2);
        list3.add(3.3);
        
        list5 = new NumberList();
        list5.add(1.1);
        list5.add(2.2);
        list5.add(3.3);
        list5.add(4.4);
        list5.add(5.5);
    }

    // = = = firstElement = = =
    
    @Test
    public void firstElement_emptyList() {
        assertThrows(NoSuchElementException.class, () -> {
            list.firstElement();
        });    
    }

    @Test
    public void firstElement_multipleElements() {
        assertEquals(1.1, list3.firstElement(), DELTA);
    }

    // = = = endsNegative = = =

    @Test
    public void endsNegative_lastElementNegative() {
        list.add(1.1);
        list.add(-2.2);
        assertTrue(list.endsNegative());
    }

    @Test
    public void endsNegative_lastElementPositive() {
        list.add(1.1);
        list.add(2.2);
        assertFalse(list.endsNegative());
    }  

    // = = = product  = = = 
    
    @Test
    public void product_emptyList() {
        assertThrows(IllegalStateException.class, () -> {
            list.product();
        });
    }

    @Test
    public void product_multipleElements() {
        assertEquals(7.986, list3.product(), DELTA);
    }

    // = = = insert = = = 
    
    @Test
    public void insert_atStart() {
        list3.insert(0, 0.5);
        assertEquals("0.5 1.1 2.2 3.3", list3.toString());
    }

    @Test
    public void insert_atMiddle() {
    	list3.insert(2, 2.5);
        assertEquals("1.1 2.2 2.5 3.3", list3.toString());
    }

    @Test
    public void insert_atEnd() {
    	list3.insert(3, 4.4);
        assertEquals("1.1 2.2 3.3 4.4", list3.toString());
    }
    
    @Test
    public void insert_negativeIndex_throwsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list3.insert(-1, 1.1);
        });
    }

    // = = = rotateLeft = = = 

    @Test
    public void rotateLeft_empty() {
        list.rotateLeft(3);
        assertEquals("", list.toString());
    }

    @Test
    public void rotateLeft_multipleOfSize_listUnchanged() {
        list5.rotateLeft(5);
        assertEquals("1.1 2.2 3.3 4.4 5.5", list5.toString());
    }

    @Test
    public void rotateLeft_rotateOneElement() {
        list5.rotateLeft(1);
        assertEquals("2.2 3.3 4.4 5.5 1.1", list5.toString());
    }

    @Test
    public void rotateLeft_positionGreaterListSize() {
        list5.rotateLeft(7); // Equivalent to rotating left by 2 positions (7 % 5 == 2)
        assertEquals("3.3 4.4 5.5 1.1 2.2", list5.toString());
    }
}

