import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void emptyStringShouldReturn0() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(calculator.add(""), 0);
    }
    
    @Test
    public void string1ShouldReturn1() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(calculator.add("1"), 1);
    }
    @Test
    public void string12ShouldReturn3() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(calculator.add("1 2"), 3);
    }
}
