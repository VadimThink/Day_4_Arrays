package edu.epam.arraytask.service;

import edu.epam.arraytask.entity.Array;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySortingTest {

    ArraySorting sorting = new ArraySorting();

    @Test
    public void testBubbleSort() {
        Array actual = new Array(new int[]{1,7,9,2,5,3,8});
        Array expected = new Array(new int[] {1,2,3,5,7,8,9});
        sorting.bubbleSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testQuickSort() {
        Array actual = new Array(new int[]{1,7,9,2,5,3,8});
        Array expected = new Array(new int[] {1,2,3,5,7,8,9});
        sorting.quickSort(actual, 0, 6);
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() {
        Array actual = new Array(new int[]{1,7,9,2,5,3,8});
        Array expected = new Array(new int[] {1,2,3,5,7,8,9});
        sorting.selectionSort(actual);
        assertEquals(actual, expected);
    }
}