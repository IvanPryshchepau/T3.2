import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ivanpryshchepau on 6/22/16.
 */
public class _RunnerTest {

    @Test
    public void calculate() throws Exception {

    }

    @Test
    public void calculateException() throws Exception {
        assertEquals(_Runner.calculate("asd", "1", "1"), 0);
    }

}