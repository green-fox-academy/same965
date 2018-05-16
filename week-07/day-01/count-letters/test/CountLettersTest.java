import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
    private CountLetters input;
    private HashMap<Character, Integer> expectedDictionary;
    private String string;

    @Before
    public void before() {
        System.out.println("Testing CountLetters");
        input = new CountLetters();
        expectedDictionary = new HashMap<>();
    }

    @After
    public void after() {
        System.out.println("Test executed");
        System.out.println();
        input = null;
        string = null;
        expectedDictionary = null;
    }

    @Test
    public void doesCountLetterMethodExecutesWithOneWord() {
        string = "alma";
        HashMap<Character, Integer> actualDictionary = input.countLetter(string);
        expectedDictionary.put('a', 2);
        expectedDictionary.put('l', 1);
        expectedDictionary.put('m', 1);
        assertEquals(expectedDictionary, actualDictionary);
    }

    @Test
    public void doesCountLetterMethodExecutesWithSeveralWordsInCamelCase() {
        string = "Rettenetes Fekete Sereg";
        HashMap<Character, Integer> actualDictionary = input.countLetter(string);
        expectedDictionary.put('r', 2);
        expectedDictionary.put('e', 9);
        expectedDictionary.put('t', 4);
        expectedDictionary.put('n', 1);
        expectedDictionary.put('s', 2);
        expectedDictionary.put('f', 1);
        expectedDictionary.put('k', 1);
        expectedDictionary.put('g', 1);
        expectedDictionary.put(' ', 2);
        assertEquals(expectedDictionary, actualDictionary);
    }

    @Test
    public void doesCountLetterMethodExecuteWithEmptyString() {
        string = "";
        HashMap<Character, Integer> actualDictionary = input.countLetter(string);
        assertEquals(expectedDictionary, actualDictionary);
    }
}