package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = in.nextInt();
        System.out.print("Введите количество шагов (x > 2): ");
        double n = in.nextInt();
        if(n < 2){
            System.out.println("Неверное значение n.");
        }
        else{
            double result = 0;
            for(int i = 2; i <= ((int)n) + 1; i++){
                if(i % 2 == 0) {
                    result += (Math.pow(x, i) / i);
                }
                else{
                    result -= (Math.pow(x, i) / i);
                }
            }
            System.out.printf("%.3f", result);
        }
    }
}