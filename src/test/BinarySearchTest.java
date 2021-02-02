package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void emptyTest(){
        assertEquals(true, true);
    }

    @Test
    public void returnsCorrectIndexInOneItemArray(){
        int[] arr = new int[]{1};
        assertEquals(0, BonusBinarySearch.binarySearch(arr, 1));
    }

    @Test
    public void returnsNegativeOneWhenNumberNotFoundOneItemArray(){
        int[] arr = new int[]{0};
        assertEquals(-1, BonusBinarySearch.binarySearch(arr, 2));
    }

    @Test
    public void returnsCorrectIndexInSortedArray(){
        int[] arr = new int[]{0,1,2,3,4};
        assertEquals(3, BonusBinarySearch.binarySearch(arr,3));
    }

    @Test
    public void returnsNegativeOneSortedArrayItemNotFound(){
        int[] arr = new int[]{0,1,2,3,4};
        assertEquals(-1, BonusBinarySearch.binarySearch(arr, -300));
    }
}
