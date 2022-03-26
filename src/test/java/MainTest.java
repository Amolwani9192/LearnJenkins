import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void testAddNumbers() {
        Assert.assertEquals(3, Main.addNumbers(1, 2));
    }
}

//    @Test
//    public void testAddNumbersPass(){
//        Assert.assertEquals(4, Main.addNumbers(1, 2));
//    }