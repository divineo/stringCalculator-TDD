import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {
    
    private StringCalculator calculator;
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();

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
        assertEquals(calculator.add("1,2"), 3);
    }
    
    @Test
    public void stringUnkownShouldReturnCorrect() {
        assertEquals(calculator.add("1,2,3,4,5,6"), 21);
    }
    
    @Test
    public void stringNewLineCommaReturnCorrect() {
        assertEquals(calculator.add("1\n2,3,4\n5,6"), 21);
    }
    
    @Test
    public void negativeInputReturnsException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Negative input!");
        calculator.add("-20");
        calculator.add("-3,66\n-23");
    }

    @Test
    public void numbersGreaterThan1000AreIgnored() {
        assertEquals(calculator.add("4,2,1001"), 6);
        assertEquals(calculator.add("26969,41\n39,8421"), 80);
    }
    
    @Test
    public void numbersWithDelimiterShouldAdd() {
        assertEquals(calculator.add("//;\n1;2"), 3);
    }
}
