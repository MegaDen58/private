package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String str = in.nextLine();
        System.out.print("Введите подстроку: ");
        String underStr = in.nextLine();
        int i = str.length() - underStr.length();
        if(str.substring(i).equals(underStr)){
            System.out.print("Введённая строка заканчиватся на введённую подстроку.");
        }
        else{
            System.out.print("Введённая строка не заканчиватся на введённую подстроку.");
        }
    }
}