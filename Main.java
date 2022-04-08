package com.company;
import java.util.Scanner;
import java.util.regex.*;


public class Main {
    public static void main(String[] args) {
        String regexp1 = "(([1-255]{1,3}\\.){3})\\d[1-255]{1,3}";
        Pattern pattern = Pattern.compile(regexp1);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String word = in.nextLine();
        Matcher m = pattern.matcher(word);
        if(m.find()){
            System.out.printf("Корректный IP адрес: %s.", m.group());
        }
        else{
            System.out.printf("Не найдено корректных IP адресов.");
        }
    }
}