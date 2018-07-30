package crack.tech.common.Sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    private MergeSort _mergeSort;

    @Before
    public void setUp() throws Exception {
        _mergeSort = new MergeSort();
    }

    @Test
    public void sort5() {
        int array[] = {12, 11, 13, 5, 6, 7};
        int expect[] = {5, 6, 7, 11, 12, 13};

        _mergeSort.sort(array);

        assertArrayEquals(expect, array);
    }
}