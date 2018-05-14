import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

   @Test
   public void applesNameEqualsWithConstructorParameter() {
       Apples apples = new Apples("apple");
       String expectedName = "apple";
       String actualName = apples.getApple();
       assertEquals(expectedName, actualName);
   }

}