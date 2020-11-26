package edu.epam.arraytask.service;

public class JaggedArraySorting {

    public int findSumArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int findMax(int[] array) {
        final int LAST_ELEMENT_INDEX = array.length - 1;
        int max = array[LAST_ELEMENT_INDEX];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        final int FIRST_ELEMENT_INDEX = 0;
        int min = array[FIRST_ELEMENT_INDEX];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public void swapArrays(int[][] jaggedArray, int firstIndex, int secondIndex) {
        int[] temp = jaggedArray[firstIndex];
        jaggedArray[firstIndex] = jaggedArray[secondIndex];
        jaggedArray[secondIndex] = temp;
    }

    public void sumSort(int[][] jaggedArray) {
        for (int i = jaggedArray.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                int firstSum = findSumArrayElements(jaggedArray[j]);
                int secondSum = findSumArrayElements(jaggedArray[j+1]);
                if (firstSum > secondSum) {
                    swapArrays(jaggedArray, j, j + 1);
                }
            }
        }
    }

    public void maxElementSort(int[][] jaggedArray){
        for (int i = jaggedArray.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                int firstMaxElement = findMax(jaggedArray[j]);
                int secondMaxElement = findMax(jaggedArray[j+1]);
                if (firstMaxElement > secondMaxElement) {
                    swapArrays(jaggedArray, j, j + 1);
                }
            }
        }
    }

    public void minElementSort(int[][] jaggedArray){
        for (int i = jaggedArray.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                int firstMinElement = findMin(jaggedArray[j]);
                int secondMinElement = findMin(jaggedArray[j+1]);
                if (firstMinElement < secondMinElement) {
                    swapArrays(jaggedArray, j, j + 1);
                }
            }
        }
    }



}
