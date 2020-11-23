package edu.epam.arraytask.entity;

import java.util.Arrays;

public class Array {

    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public Array(int size){
        array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int... array) {
        this.array = array;
    }


    public void setValue(int value, int index){
        if (index >= 0 && index <= array.length){
            array[index] = value;
        }
        else{
            System.out.println("Wrong index!");
        }
    }

    public int getValue(int index){
        if (index >= 0 && index < array.length){
            return array[index];
        }
        else{
            System.out.println("Wrong index! 0 returned");
            return 0;
        }
    }

    public void swapElements(int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public int size(){
        return array.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Array{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }

}
