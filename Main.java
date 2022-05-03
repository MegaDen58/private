package com.company;

import java.io.*;
import java.util.Scanner;

class Geometry implements Serializable{
    double x;
    double result;

    public void getSin(double x){
        result = x - Math.sin(Math.toRadians(x));
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean canNext = true;
        try{
            while(true) {
                if (canNext) {
                    System.out.print("Выберите действие (save, check, out): ");
                }
                String i = in.next();

                if (i.equalsIgnoreCase("save")) {
                    canNext = true;
                    FileOutputStream file = new FileOutputStream("input.txt");
                    ObjectOutputStream output = new ObjectOutputStream(file);
                    Geometry g = new Geometry();
                    System.out.print("Введите x: ");
                    g.x = in.nextDouble();
                    g.getSin(g.x);
                    output.writeObject(g);
                    System.out.println("Данные сохранены.");
                }

                else if (i.equalsIgnoreCase("check")) {
                    canNext = true;
                    FileInputStream file1 = new FileInputStream("input.txt");
                    ObjectInputStream input = new ObjectInputStream(file1);
                    Geometry gg = (Geometry) input.readObject();
                    System.out.printf("X = %s \t Result = %s\n", gg.x, gg.result);
                }
                else if(i.equalsIgnoreCase("out")){
                    break;
                }
                else if(canNext) {
                    System.out.println("Я не знаю такой команды.");
                    System.out.print("Выберите действие (save, check, out): ");
                    canNext = false;
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}