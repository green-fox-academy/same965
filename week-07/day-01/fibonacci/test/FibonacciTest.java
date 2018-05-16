import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    private Fibonacci fibonacci;
    private int index;

    @Before
    public void before() {
        System.out.println("Testing Fibonacci class method");
        fibonacci = new Fibonacci();
    }

    @After
    public void after() {
        System.out.println("Method checked");
        System.out.println();
        fibonacci = null;
    }

    @Test
    public void shouldFibonacciMethodWork() {
        index = 10;
        long expectedValue = 34L;
        long actualValue = fibonacci.fibonacciMember(index);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldFibonacciMethodWorkWith() {
        index = -1;

        try {
            long actualValue = fibonacci.fibonacciMember(index);
        } catch (IndexOutOfBoundsException e) {
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
    }
}