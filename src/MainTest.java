import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MainTest {
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void example() {
        int n = 5;
        int m = 2;
        int[] deadlines = {0, 3, 1, 1, 1, 2};
        Assertions.assertEquals(1, Main.solve(n, m, deadlines));
    }
}
