package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result = "";;
        System.out.print("Введите предложение: ");
        String word = in.nextLine();
        int max = word.length();
        String[] words = word.split(" ");
        for(String t : words){
            int c = t.length();
            if(c < max){
                max = c;
            }
        }
        System.out.printf("Длина минимально слова равна %d символа(ов)\nЭти слова: \n", max);
        for(String t : words){
            if(t.length() == max){
                result = t;
                System.out.println(result);
            }
        }
    }
}
