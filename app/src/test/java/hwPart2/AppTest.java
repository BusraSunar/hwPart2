/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hwPart2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
   public void testMultiplied() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
      assertTrue(App.isItMultiplied(array,array2, 2));
    }

    @Test
    public void testNotMultiplied() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
      assertFalse(App.isItMultiplied(array,array2, 3));
    }

    @Test
    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      ArrayList<Integer> array2 = new ArrayList<>();
      assertFalse(App.isItMultiplied(array,array2, 1));
    }

    @Test
    public void testNull() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(App.isItMultiplied(null,null, 1));
      assertFalse(App.isItMultiplied(array,null, 1));
      assertFalse(App.isItMultiplied(null,array, 1));
    }

    @Test
    public void testDivideByZero() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      Assertions.assertThrows(ArithmeticException.class, () -> {
        App.isItMultiplied(array,array, 0);
      });
    }

}
