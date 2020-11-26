package edu.epam.arraytask.input;

import edu.epam.arraytask.entity.Array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayInput {

    Scanner in = new Scanner(System.in);

    public Array inputConsole() {
        System.out.println("How many numbers do u want to add?");
        int numbersCount = in.nextInt();
        Array array = new Array(numbersCount);
        for (int i = 0; i < numbersCount; i++) {
            System.out.println("Array[" + i + "]= ");
            int number = in.nextInt();
            array.setValue(number, i);
        }
        return array;
    }

    public Array inputFile() {
        final String fileName = "Input.txt";
        ArrayList<Integer> baseArray = new ArrayList<>();
        int size = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String firstLine = reader.readLine();
            size = Integer.parseInt(firstLine);
            String line = reader.readLine();
            while (line != null){
                baseArray.add(Integer.parseInt(line));
                line = reader.readLine();
            }
        }catch(FileNotFoundException filenotfoundexception){
            System.out.println("File not found.");
        }catch(IOException ioexception) {
            System.out.println("File input error occured!");
            ioexception.printStackTrace();
        }
        int[] resultArray = new int[baseArray.size()];
        for (int i = 0; i < baseArray.size(); i++){
            resultArray[i] = baseArray.get(i);
        }
        Array array = new Array(resultArray);
        return array;
    }

    public Array inputRandom() {
        final int MIN = 100;
        final int MAX = 200;
        Random random = new Random();
        int diff = MAX - MIN;
        int numbersCount = random.nextInt(diff + 1);
        numbersCount += MIN;
        Array array = new Array(numbersCount);
        for (int i = 0; i < numbersCount; i++) {
            int number = random.nextInt(diff + 1);
            number+= MIN;
            array.setValue(number, i);
        }
        return array;
    }

}
