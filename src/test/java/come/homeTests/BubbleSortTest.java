package come.homeTests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    private BubbleSort BubbleSortInstance;

    @Before
    public void before() {
        BubbleSortInstance = new BubbleSort();
    }

    @Test
    public void BubbleSortTest() {

        int[] arrayTest = {5, -12, 0, 0, 74, 7, -14};
        int[] arrayCheck = {-14, -12, 0, 0, 5, 7, 74};
        BubbleSortInstance.bubbleSort(arrayTest);
        assertEquals(74, arrayTest[6]);
        assertArrayEquals(arrayCheck, arrayTest);

    }
}