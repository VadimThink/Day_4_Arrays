package edu.epam.arraytask.service;

import edu.epam.arraytask.entity.Array;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class SearchTest {

    Search search = new Search();
    Array array = new Array(new int[]{1,2,3,5,7,8,9});

    @Test
    public void testBinarySearch() {
        int expected = 6;
        int actual = search.binarySearch(array, 9, 0, 6);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMax() {
        int expected = 9;
        int actual = search.findMax(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMin() {
        int expected = 1;
        int actual = search.findMin(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindPrimeNumbers() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        ArrayList<Integer> actual = search.findPrimeNumbers(array);
        assertEquals(actual, expected);
    }


    @Test
    public void testFindFibonacciNumbers() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(8);
        ArrayList<Integer> actual = search.findFibonacciNumbers(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindNumbersWithDifferentDigits() {
        Array array = new Array(new int[]{123,167,155,132,887});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(123);
        expected.add(167);
        expected.add(132);
        ArrayList<Integer> actual = search.findNumbersWithDifferentDigits(array);
        assertEquals(actual, expected);
    }
}