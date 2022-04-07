package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String word = in.nextLine();
        int length = word.length();
        char[] c = word.toCharArray();
        int result = 0;
        int k = length - 1;
        if(length % 2 != 0){
            int a = (length / 2) + 1;
            for(int i = 0; i < a; i++, k--){
                    if(c[i] == c[k]){
                        result++;
                }
            }
            if(result == (length / 2) + 1){
                System.out.println("Число палиндром.");
            }
            else{
                System.out.println("Число не палиндром.");
            }
        }
        if(length % 2 == 0){
            int a = length / 2;
            for(int i = 0; k >= a; i++, k--){
                if(c[i] == c[k]){
                    result++;
                }
            }
            if(result == length / 2){
                System.out.println("Число палиндром.");
            }
            else{
                System.out.println("Число не палиндром.");
            }
        }
    }
}