package edu.epam.arraytask.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JaggedArraySortingTest {

    @Test
    public void testSumSort() {
        int[][] actual = {{2,3,4,5},{1,2,3},{2,3}};
        JaggedArraySorting sorting = new JaggedArraySorting();
        sorting.sumSort(actual);
        int[][] expected = {{2,3},{1,2,3},{2,3,4,5}};
        assertEquals(actual,expected);
    }

    @Test
    public void testMaxElementSort() {
        int[][] actual = {{2,3,4,5},{1,2,3},{1,2}};
        JaggedArraySorting sorting = new JaggedArraySorting();
        sorting.maxElementSort(actual);
        int[][] expected = {{1,2},{1,2,3},{2,3,4,5}};
        assertEquals(actual,expected);
    }

    @Test
    public void testMinElementSort() {
        int[][] actual = {{1,2},{2,3},{3,4,5}};
        JaggedArraySorting sorting = new JaggedArraySorting();
        sorting.minElementSort(actual);
        int[][] expected = {{3,4,5},{2,3},{1,2}};
        assertEquals(actual,expected);
    }

}