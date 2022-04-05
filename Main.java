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
        System.out.print("Введите число x: ");
        double x = in.nextInt();
        System.out.print("Введите количество шагов (n >= 2): ");
        double n = in.nextInt();
        if(n < 2){
            System.out.println("Неверное значение n.");
        }
        else{
            double result = 0;
            for(int i = 2; i <= ((int)n) + 1; i++){
                    result += (Math.pow(x, 2 * i + 1) / factorial(2 * i));
            }
            System.out.printf("%.3f", result);
        }
    }
}
