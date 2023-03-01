package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Reading numbers...");
        int[] numbers = MaxInteger.readNumbers("/Users/bilaldrndo/Desktop/IBU/2nd_Year_2nd_Semester/DataStructs_Algos/Lab_Code/firstlab/src/data_for_lab/100nums.txt");
        int maxNumber = MaxInteger.findMax(numbers);
        System.out.println("Maximum number is:" + maxNumber);
        System.out.println("Writing to file...");
        MaxInteger.writeTofile("/Users/bilaldrndo/Desktop/IBU/2nd_Year_2nd_Semester/DataStructs_Algos/Lab_Code/firstlab/src/data_for_lab/maxnum.txt", maxNumber);
    }
}

