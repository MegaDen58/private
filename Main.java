package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество шагов");
        int n = in.nextInt();
        System.out.println("Введите значение для x");
        int x = in.nextInt();
        int minus = -1;
        double down = 1;
        double result = 0;

        if (n < 0) {
            System.out.print("n не может быть отрицательным числом.");
        }

        else
        {
            for (int a = 0; a <= n; a++)
            {
                double up = Math.pow((-1),a) * Math.pow(x,a);

                down = getFactorial(a);
                result = up / down;

                String resultAll = String.format("%.2f", result);
                System.out.println("x = " + x + ". " + "n = " + a);
                System.out.println(resultAll);
            }
        }

    }


    public static int getFactorial(int a)
    {
        if (a == 0) {
            return 1;
        } else
        {
            int result = 1;
            for (int c = 1; c <= a; c++)
            {
                result = result * c;
            }
            return result;
        }
    }
}
