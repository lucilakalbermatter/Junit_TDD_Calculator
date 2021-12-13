

import main.java.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

  private static Calculator calculator;

  @BeforeAll
  //TODO

  @Test
  public void verifyAddition() {
    //TODO
  }


  @Test
  public void verifySubtraction() {
    //TODO
  }


  @Test
  public void verifyMultiplication() {
    //TODO
  }

  @Test
  public void verifyDivision() {
    //TODO
  }


  @Test
  public void verifyDivisionByZero() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      calculator.division(5, 0);
    });
    //TODO
  }
}


