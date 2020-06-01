import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
    
    private StringCalculator calculator;

    @Before
    public void initialize() {
        calculator = new StringCalculator();
    }

    @Test
    public void emptyStringShouldReturn0() {
        assertEquals(calculator.add(""), 0);
    }
    
    @Test
    public void string1ShouldReturn1() {
        assertEquals(calculator.add("1"), 1);
    }
    @Test
    public void string12ShouldReturn3() {
        assertEquals(calculator.add("1 2"), 3);
    }
    @Test
    public void stringUnkownShouldReturnCorrect() {
        assertEquals(calculator.add("1 2 3 4 5 6"), 21);
    }
    @Test
    public void stringNewLineCommaReturnCorrect() {
        assertEquals(calculator.add("1\n2,3,4\n5,6"), 21);
}
