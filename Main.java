package com.company;

import java.io.*;
import java.util.Scanner;


class Function implements Serializable {
    double x, y;

    double getY() {
        y = this.x - Math.sin(this.x);
        return y;
    }
}


public class Main {

    public static void main(String[] args) {
        String text;
        Scanner in = new Scanner(System.in);
        Function func = new Function();
        System.out.print("Введите значения: ");
        int ss = 1;
        while (true) {
            text = in.nextLine();
            try {
                double x = Double.parseDouble(text);
                func.x = x;
                func.getY();
                if(ss == 1){
                    System.out.println("Вы можете ввести одну из следующих комманд: save, upload, check, stop ");
                    ss++;
                }
            } catch (Exception IOex) {
                if (text.equalsIgnoreCase("save")) {
                    try (ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("file.txt"))) {
                        write.writeObject(func);
                        System.out.println("Данные сохранены в файл.");
                    } catch (IOException ex) {
                        ex.getMessage();
                    }
                } else if (text.equalsIgnoreCase("upload")) {
                    try (ObjectInputStream read = new ObjectInputStream(new FileInputStream("file.txt"))) {
                        func = (Function) read.readObject();
                        System.out.println("Всё нормально.");
                    } catch (Exception ex) {
                        ex.getMessage();
                    }
                } else if (text.equalsIgnoreCase("check")) {
                    System.out.printf("x: %s\ny: %s\n",func.x, func.y);
                } else if (text.equalsIgnoreCase("stop")){
                    break;
                }
                else {
                    System.out.println("Такой команды не существует.");
                }
                System.out.println("Вы можете ввести одну из следующих комманд: save, upload, check, stop ");
            }
        }
    }
}