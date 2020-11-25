package edu.epam.arraytask.report;

import edu.epam.arraytask.entity.Array;

import java.util.ArrayList;

public class ArrayReport {

    public void sortReport(Array array){
        System.out.println("Sorted array:");
        System.out.println(array);
    }

    public void binarySearchReport(int index){
        System.out.println("Index of needed number found by Binary Search: " + index);;
    }

    public void findMaxReport(int number){
        System.out.println("Max number in array found: " + number);
    }

    public void findMinReport(int number){
        System.out.println("Min number in array found: " + number);
    }

    public void findPrimeReport(ArrayList<Integer> array){
        System.out.println("Found prime numbers: " + array);
    }

    public void findFibonacciReport(ArrayList<Integer> array){
        System.out.println("Found fibonacci numbers: " + array);
    }

    public void findDifferentDigitReport(ArrayList<Integer> array){
        System.out.println("Found numbers with different digits: " + array);
    }

}
