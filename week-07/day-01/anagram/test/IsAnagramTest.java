import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsAnagramTest {
    private IsAnagram testWords;

    @Before
    public void before() {
        System.out.println("Testing isAnagram methods");
    }

    @After
    public void after() {
        System.out.println("Test executed");
        System.out.println();
        testWords = null;
    }

    @Test
    public void anagramMethodTestTrue() {
        testWords = new IsAnagram("palacsinta", "latinapacs");
        System.out.println("anagram method checked");
        assertTrue(testWords.anagram());
    }

    @Test
    public void anagramMethodTestFalse() {
        testWords = new IsAnagram("alma", "körte");
        System.out.println("anagram method checked");
        assertFalse(testWords.anagram());
    }

}