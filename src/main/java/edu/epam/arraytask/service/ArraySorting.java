package edu.epam.arraytask.service;

import edu.epam.arraytask.entity.Array;

public class ArraySorting {

    public void bubbleSort(Array array) {
        for (int i = array.size() - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array.getValue(j) > array.getValue(j + 1)) {
                    array.swapElements(j, j + 1);
                }
            }
        }
    }

    public void quickSort(Array array, int low, int high) {
        if (array.size() == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int middleElement = array.getValue(middle);

        int i = low, j = high;
        while (i <= j) {
            while (array.getValue(i) < middleElement) {
                i++;
            }

            while (array.getValue(j) > middleElement) {
                j--;
            }

            if (i <= j) {
                int temp = array.getValue(i);
                array.setValue(array.getValue(j), i);
                array.setValue(temp, j);
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);

    }

    public void selectionSort(Array array) {
        for (int left = 0; left < array.size(); left++) {
            int minInd = left;
            for (int i = left; i < array.size(); i++) {
                if (array.getValue(i) < array.getValue(minInd)) {
                    minInd = i;
                }
            }
            array.swapElements(left, minInd);
        }
    }


}
