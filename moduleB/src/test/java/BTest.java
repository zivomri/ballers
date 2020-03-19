import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class BTest {
    @Test
    public void testSomething() {
        String absolutePath = new File(".").getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);
        assertTrue(absolutePath.contains("moduleB"));
    }
}
