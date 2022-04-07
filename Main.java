package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String word = in.nextLine();
        String[] words = word.split(" ");
        System.out.printf("В строчке %d слов(а).", words.length);
    }
}