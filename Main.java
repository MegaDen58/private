package com.company;

import java.io.*;
import java.util.Scanner;

class Function implements Serializable { // Создаём класса с переменными x, y и методом для нахождения y
    double x, y;

    double getY() { // Находим y по формуле
        y = this.x - Math.sin(this.x);
        return y;
    }
}

public class Main {
    public static void main(String[] args) {
        String txt;
        Scanner in = new Scanner(System.in);
        Function func = new Function(); // Создаём объект класса
        System.out.print("Enter value: ");
        int i = 1;
        while (true) {
            txt = in.nextLine(); // Вводим текст
            try { // Пробуем спарсить x в double и поместить это значение в x, который находится в классе. Просим ввести 1 из 4 команд
                double x = Double.parseDouble(txt);
                func.x = x; // Заносим значение введённого x в x, который находится в классе.
                func.getY(); // Находим y 
                if(i == 1){
                    System.out.println("You can enter one of the following commands: save, upload, check, stop");
                    i++;
                }
            } catch (Exception IOe) { // Если x не спарсился в double или другая ошибка
                if (txt.equalsIgnoreCase("save")) { // Если ввели слово save, записывает значения x и y в файл, как состояние объекта класса.
                    try (ObjectOutputStream wr = new ObjectOutputStream(new FileOutputStream("object.txt"))) {
                        wr.writeObject(func);
                        System.out.println("Data saved to file");
                    } catch (IOException ex) { // Если не получилось - выводим ошибку
                        ex.getMessage();
                    }
                } else if (txt.equalsIgnoreCase("upload")) { // Если ввели upload, загружаем состояние объекта класса из файл в код
                    try (ObjectInputStream rd = new ObjectInputStream(new FileInputStream("object.txt"))) {
                        func = (Function) rd.readObject();
                        System.out.println("Upload successful");
                    } catch (Exception ex) { // Если не получилось - выводим ошибку
                        ex.getMessage();
                    }
                } else if (txt.equalsIgnoreCase("check")) { // Если ввели check, выводим значения x и y
                    System.out.printf("x: %s\ny: %s\n",func.x, func.y);
                } else if (txt.equalsIgnoreCase("stop")){ // Если ввели stop, программа останавливается
                    break;
                }
                else { // Если ввели не ключевая слова - пишем, что такой команды нет
                    System.out.println("Such a command does not exist");
                }
                System.out.println("You can enter one of the following commands: save, upload, check, stop"); // Просим ввести 1 из команд
            }
        }
    }
}
