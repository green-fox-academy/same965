import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
    private Sum sumTest;

    @Before
    public void before() {
        System.out.println("Testing Sum class' method");
        sumTest = new Sum();
    }

    @After
    public void after() {
        System.out.println("Test executed");
        System.out.println();
        sumTest = null;
    }

    @Test
    public void isSumOfElementMethodExecutesProperly() {
        sumTest.setNumbers(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        int expectedValue = 15;
        int actualValue = sumTest.sumOfElements();

        System.out.println("sumOfElements method check");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void sumOfElementMethodTestWithEmptyArrayList(){
        int expectedValue = 0;
        int actualValue = sumTest.sumOfElements();

        System.out.println("sumOfElements method check with empty ArrayList");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void sumOfElementMehtodTestWithOneElement() {
        sumTest.setNumbers(new ArrayList<Integer>(Arrays.asList(1)));
        int expectedValue = 1;
        int actualValue = sumTest.sumOfElements();

        System.out.println("sumOfElements method check with one element");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void sumOfElementMethodTestWithNullArrayList() throws NullPointerException {
        sumTest = null;

        try {
            sumTest.sumOfElements();
        } catch (NullPointerException e) {
            assertTrue(e instanceof NullPointerException);
        }

        System.out.println("sumOfElements method check with null");
    }
}