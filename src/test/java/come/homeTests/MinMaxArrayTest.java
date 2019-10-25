package come.homeTests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MinMaxArrayTest {
    private MinMaxArray MinMaxArrayInstance;

    @Before
    public void before() {
        System.out.println("Before running...");
        MinMaxArrayInstance = new MinMaxArray();
    }

    @Test
    public void MinMaxTest() {
        int[] array = {3, 2, 3, 84, 0, -15, 0};
        int MinMax = array[0];
        int result_1 = MinMaxArrayInstance.Min(MinMax, array);
        assertEquals(-15, result_1);
        int result_2 = MinMaxArrayInstance.Max(MinMax, array);
        assertEquals(84, result_2);
        boolean result_3 = result_1 < result_2;
        assertTrue(result_3);
    }
}
