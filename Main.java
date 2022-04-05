package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
            if(n % 2 == 0){
                System.out.println("Число чётное.");
            }
            if(n % 2 != 0){
                System.out.println("Число нечётное.");
            }
    }
}
