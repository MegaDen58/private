package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        int[] array = createArray();
        int length = array.length;
        Arrays.sort(array);
        length = removeDuplicateElements(array, length);
        for (int i = 0; i < length; i++){
            System.out.print(array[i] + " ");
        }

    }
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] tempA = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++){
            if (arr[i] != arr[i + 1]){
                tempA[j++] = arr[i];
            }
        }
        tempA[j++] = arr[n - 1];
        for (int i = 0; i < j; i++){
            arr[i] = tempA[i];
        }
        return j;
    }
    public static int[] createArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = in.nextInt();
        int[] array = new int[length];
        System.out.println("Заполните массив");
        for (int i = 0; i < length; i++){
            System.out.print("Введите " + i + " элемент: ");
            array[i] = in.nextInt();
        }
        System.out.println("Вы создали массив: ");
        System.out.println(Arrays.toString(array));
        return array;
    }
}