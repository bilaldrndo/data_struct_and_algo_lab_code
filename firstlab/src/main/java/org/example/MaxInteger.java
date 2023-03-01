package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MaxInteger {
    public static void main(String[] args) throws IOException {
        System.out.println("Reading numbers...");
        int[] numbers = readNumbers("/Users/bilaldrndo/Desktop/IBU/2nd_Year_2nd_Semester/DataStructs_Algos/Lab_Code/firstlab/src/data_for_lab/100nums.txt");
        int maxNumber = findMax(numbers);
        System.out.println("Maximum number is:" + maxNumber);
        System.out.println("Writing to file...");
        writeTofile("/Users/bilaldrndo/Desktop/IBU/2nd_Year_2nd_Semester/DataStructs_Algos/Lab_Code/firstlab/src/data_for_lab/maxnum.txt", maxNumber);
    }

    public static int[] readNumbers (String path) throws FileNotFoundException {
        int[] numbers = new int[100];
        Scanner scanner = new Scanner(new File(path));
        int i = 0; // counter
        while (scanner.hasNextLine()) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        scanner.close();
        return numbers;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void writeTofile(String path, int maxNumber) throws IOException {
        File file = new File(path);
        FileWriter fw = new FileWriter(file);
        fw.write(Integer.toString(maxNumber));
        fw.close();
    }
}

