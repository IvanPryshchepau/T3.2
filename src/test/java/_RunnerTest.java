import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by ivanpryshchepau on 6/22/16.
 */
public class _RunnerTest {

    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 3, 1, -6.10811, 0.00001},
                {1, 2, 3, 0.25, 0.00001},
                {3, 1, 2, -52, 0.00001},
        };

    }

    @Test(dataProvider = "data")
    public void calculate(Object aS, Object bS, Object cS, double result, double delta) throws Exception {
        assertEquals(_Runner.calculate(String.valueOf(aS), String.valueOf(bS), String.valueOf(cS)), result, delta);
    }

    @Test
    public void calculateException() throws Exception {
        assertEquals(_Runner.calculate("asd", "1", "1"), 0, 0.0);
    }

}