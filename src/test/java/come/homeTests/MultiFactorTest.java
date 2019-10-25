package come.homeTests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiFactorTest {
    private MultiFactor MultiFactorInstance;

    @Before
    public void before() {
        MultiFactorInstance = new MultiFactor();
    }

    @Test
    public void MultiFactorTest() {
        int[] array = {15, 23, -25, 0, 5, 1, 95};
        int[] arrayCheck = {15, -25, 0, 5, 95};
        int multiFactor = 5;
        int sum = 0;
        int[] multiFactorArray = MultiFactorInstance.multiFactor(array, multiFactor);
        for (int i = 0; i < multiFactorArray.length; i++) {
            sum += multiFactorArray[i];
        }
        int result = sum % multiFactor;
        assertArrayEquals(arrayCheck, multiFactorArray);
        assertEquals(0, result);
    }

}