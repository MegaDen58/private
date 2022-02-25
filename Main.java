package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {14, 43, 4, 9, 3, 31, 2, 13, 3, 4, 11, 54, 3, 55, 7};
        minValue(array);
    }
    static void minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение = " + min);
    }
}