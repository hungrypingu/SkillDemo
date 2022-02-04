import static org.junit.Assert.*;
import org.junit.*;

public class demoTest {
    @Test
    public void determinant() {
        assertEquals(demo.determinant(2, 3, 4, 5), -1); //fails unless changed to -2
    }
}