import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUtil {

    @Test
    public void testCompute_OneArgument_ReturnsFalse() {
        Util util = new Util();
        boolean result = util.compute(5);
        assertEquals(false, result);
    }

    @Test
    public void testCompute_EvenNumberOfArguments_ReturnsTrue() {
        Util util = new Util();
        boolean result = util.compute(2, 4, 6);
        assertEquals(true, result);
    }

    @Test
    public void testCompute_EvenNumberOfArguments_ReturnsFalse() {
        Util util = new Util();
        boolean result = util.compute(2, 4);
        assertEquals(false, result);
    }

    @Test
    public void testCompute_SumDivisibleByArgument_ReturnsTrue() {
        Util util = new Util();
        boolean result = util.compute(1, 2, 3);
        assertEquals(true, result);
    }

    @Test
    public void testCompute_SumNotDivisibleByAnyArgument_ReturnsTrue() {
        Util util = new Util();
        boolean result = util.compute(1, 2, 4);
        assertEquals(true, result);
    }
    @Test
    public void testCompute_SumNotDivisibleByAnyArgument_ReturnsFalse() {
        Util util = new Util();
        boolean result = util.compute(1, 2, 4, 6);
        assertEquals(false, result);
    }

    @Test(expected = RuntimeException.class)
    public void testCompute_ZeroArgument_ThrowsRuntimeException() {
        Util util = new Util();
        util.compute(1, 2, 0);
    }

   


}
