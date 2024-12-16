package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void test1() {
        Calculator calculator = new Calculator();
        double value = calculator.calculate("2+2*2");
        assertEquals(6D, value);
    }

    // @Test
    // public void test2() {
    // Calculator calculator = new Calculator();
    // double value = calculator.calculate("2+2*2");
    // assertEquals(12D, value);
    // }
}
