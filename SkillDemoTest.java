import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplication() {
        assertEquals(2, SkillDemo.multiply(5, 5));
    }
}