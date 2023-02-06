import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void calculatorCanAdd() {
        assertEquals(2, calculator.calcAdd(1, 1));
    }
    @Test
    public void calculatorCanSubtract() {
        assertEquals(3, calculator.calcSubtract(5, 2));
    }
    @Test
    public void calculatorCanMultiply() {
        assertEquals(12, calculator.calcMultiply(3, 4));
    }
    @Test
    public void calculatorCanDivide() {
        assertEquals(4.338983050847458, calculator.calcDivide(10.24, 2.36), 0.0);
    }



}
