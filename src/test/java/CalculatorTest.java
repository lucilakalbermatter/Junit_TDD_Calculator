import main.java.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

  private static Calculator calculator;

  @BeforeAll
  public static void setUp() {
    calculator = new Calculator();
  }

  @Test
  @DisplayName("Verify addition function")
  public void verifyAddition() {
    //Result 1
    int result1 = calculator.addition(25,20);
    assertEquals(45,result1);

    //Result 2
    int result2 = calculator.addition(5,10);
    assertEquals(15,result2);
  }


  @Test
  @DisplayName("Verify subtraction function")
  public void verifySubtraction() {
    //Result 1
    int result1 = calculator.subtract(25,20);
    assertEquals(5,result1);

    //Result 2
    int result2 = calculator.subtract(40,10);
    assertEquals(30,result2);
  }


  @Test
  @DisplayName("Verify multiplication function")
  public void verifyMultiplication() {
    //Result 1
    int result1 = calculator.multiply(25,20);
    assertEquals(500,result1);

    //Result 2
    int result2 = calculator.multiply(40,10);
    assertEquals(400,result2);
  }


  @Test
  @DisplayName("Verify division function")
  public void verifyDivision() {
    //Result 1
    int result1 = calculator.division(25,20);
    assertEquals(1,result1);

    //Result 2
    int result2 = calculator.division(40,10);
    assertEquals(4,result2);
  }


  @Test
  @DisplayName("Verify division by zero function")
  public void verifyDivisionByZero() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      calculator.division(5, 0);
    });
  }
}


