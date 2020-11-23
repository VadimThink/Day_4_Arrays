package edu.epam.arraytask.service;

import edu.epam.arraytask.entity.Array;

import java.util.ArrayList;

public class Search {

    final int FIRST_ELEMENT = 0;

    public int binarySearch(Array array, int key, int low, int high) {

        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.getValue(mid) < key) {
                low = mid + 1;
            } else if (array.getValue(mid) > key) {
                high = mid - 1;
            } else if (array.getValue(mid) == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public int findMax(Array array) {
        int max = array.getValue(array.getValue(array.size() - 1));
        for (int i = array.size() - 1; i >= 0; i--) {
            if (array.getValue(i) > max) {
                max = array.getValue(i);
            }
        }
        return max;
    }

    public int findMin(Array array) {
        int min = array.getValue(FIRST_ELEMENT);
        for (int i = FIRST_ELEMENT; i < array.size(); i++) {
            if (array.getValue(i) < min) {
                min = array.getValue(i);
            }
        }
        return min;
    }

    public ArrayList<Integer> findPrimeNumbers(Array array) {
        final int MAX_COUNTER_NUMBER = 2;
        ArrayList<Integer> primeArray = new ArrayList<>();
        for (int i = FIRST_ELEMENT; i < array.size(); i++) {
            if (array.getValue(i) > 1) {
                int counter = 0;
                for (int j = 2; j <= array.getValue(i); j++) {
                    if (array.getValue(i) % j == 0 && counter < MAX_COUNTER_NUMBER) {
                        counter++;
                    }
                }
                if (counter < MAX_COUNTER_NUMBER) {
                    primeArray.add(array.getValue(i));
                }
            }
        }
        return primeArray;
    }

    public ArrayList<Integer> findFibonacciNumbers(Array array) {
        ArrayList<Integer> fibonacciArray = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            if (array.getValue(i) == 1) {
                fibonacciArray.add(array.getValue(i));
            }
            int a = 1;
            int b = 1;
            int c = 0;
            while (c < array.getValue(i)) {
                c = a + b;
                a = b;
                b = c;
            }
            if (c == array.getValue(i)){
                fibonacciArray.add(array.getValue(i));
            }
        }
        return fibonacciArray;
    }

    public ArrayList<Integer> findNumbersWithDifferentDigits(Array array){
        ArrayList<Integer> differentDigitArray = new ArrayList<>();

        for (int i = FIRST_ELEMENT; i < array.size(); i++){
            int number = array.getValue(i);
            String numberString = Integer.toString(number);
            if (numberString.length() == 3){
                char a = numberString.charAt(0);
                char b = numberString.charAt(1);
                char c = numberString.charAt(2);
                if((a != b) && (a != c) && (b != c)){
                    differentDigitArray.add(array.getValue(i));
                }
            }
        }
        return differentDigitArray;
    }
}
