import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    LinkedList input1;

    @Before
    public void setUp() {
        input1 = new LinkedList();
        input1.append(0);
        input1.append(1);
        input1.append(2);
    }

    @Test
    public void testPrepend() {
        LinkedList expected = new LinkedList();
        expected.append(-1);
        expected.append(0);
        expected.append(1);
        expected.append(2);
        input1.prepend(-1);
        assertEquals(expected, input1);
    }

    @Test
    public void testAppend() {
        
    }

    @Test
    public void testFirst() {
        
    }

    @Test
    public void testLast() {
        
    }

    @Test
    public void testToString() {
        
    }

    @Test
    public void testLegnth() {
        
    }
}
