package com.company;
import java.util.Scanner;


public class Main {

    public static int factorial(int x){
        int result = 1;
        for(int i = 1; i <= x; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x (x > 2): ");
        double x = in.nextInt();
        if(x < 2){
            System.out.println("Неверное значение x.");
        }
        else{
            double result = 0;
            for(int i = 2; i <= x; i++){
                result = result + (Math.pow(x, i) / factorial(i));
            }
            System.out.printf("%.3f", result);
        }
    }
}