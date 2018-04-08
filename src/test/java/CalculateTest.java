import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void divideTest() {
        assertEquals("2", new CalculateDivide().calculateIt((float) 4, "/", (float) 2));
    }

    @Test
    public void minusTest() {
        assertEquals("3", new CalculateMinus().calculateIt((float) 5, "-", (float) 2));

    }

    @Test
    public void multiplyTest() {
        assertEquals("10", new CalculateMultiply().calculateIt((float) 5, "*", (float) 2));

    }

    @Test
    public void plusTest() {
        assertEquals("8", new CalculatePlus().calculateIt((float) 5, "+", (float) 3));

    }
}
