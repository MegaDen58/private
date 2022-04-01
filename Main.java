package com.company;
import java.util.Scanner;
import java.util.Random;

interface Product{
    void displayPhoneModel(String model);
    void displayPrice(double price);
    void displayRating(String rating);
}

interface User{
    void displayEmail(String login);
    void displayNickname(String nick);
    void displayPassword(String password);
}

class Review implements User{
    public void displayEmail(String email){
        System.out.printf("Email: %s", email);
    }
    public void displayPassword(String password){
        int length = password.length();
        String s = "";
        for(int i = 0; i < length; i++){
            s += "*";
        }
        System.out.printf("Пароль: %s", s);
    }
    public void displayNickname(String nick){
        System.out.printf("Никнейм: %s", nick);
    }
    public void makeReview(String login, String review, String nameOfProduct){
        System.out.printf("Отзыв пользователя %s о товаре %s.\n %s.", login, nameOfProduct, review);
    }
}

class Deposit implements User{
    public void displayEmail(String email){
        System.out.printf("Логин: %s", email);
    }
    public void displayPassword(String password){
        int length = password.length();
        String s = "";
        for(int i = 0; i < length; i++){
            s += "*";
        }
        System.out.printf("Пароль: %s", s);
    }
    public void displayNickname(String nick){
        System.out.printf("Никнейм: %s", nick);
    }
    public void depositDollar(int dollar){
        System.out.printf("Вы пополнили баланс на %d.\n Ваш баланс: %d$.", dollar);
    }
}

class History implements User{
    public void displayEmail(String email){
        System.out.printf("Email: %s", email);
    }
    public void displayPassword(String password){
        int length = password.length();
        String s = "";
        for(int i = 0; i < length; i++){
            s += "*";
        }
        System.out.printf("Пароль: %s", s);
    }
    public void displayNickname(String nick) {
        System.out.printf("Никнейм: %s", nick);
    }
    public void displayHistory(String email, String nick, String model, String price){
        System.out.printf("\t История покупок \n Email: %s\t Никнейм: %s\t Модель телефона: %s\t Стоимость товара: %s",
                email, nick, model, price);
    }
}

class IPhone implements Product{
    String model = "IPhone XS";
    double price = 750;
    String rating = "8/10";
    public void displayPhoneModel(String model){
        System.out.printf("Название товара: %s.", model);
    }
    public void displayPrice(double price){
        System.out.printf("Цена смартфона: %f.$", price);
    }
    public void displayRating(String rating){
        System.out.printf("Рейтинг данного товара: %s.", rating);
    }
}

class Xiaomi implements Product{
    String model = "Xiaomi Mi6";
    double price = 299.99;
    String rating = "10/10";
    public void displayPhoneModel(String model){
        System.out.printf("Название товара: %s.", model);
    }
    public void displayPrice(double price){
        System.out.printf("Цена смартфона: %f.$", price);
    }
    public void displayRating(String rating){
        System.out.printf("Рейтинг данного товара: %s.", rating);
    }
}

class Tesla implements Product{
    String model = "Tesla Phone";
    double price = 500;
    String rating = "7/10";
    public void displayPhoneModel(String model){
        System.out.printf("Название товара: %s.", model);
    }
    public void displayPrice(double price){
        System.out.printf("Цена смартфона: %f.$", price);
    }
    public void displayRating(String rating){
        System.out.printf("Рейтинг данного товара: %s.", rating);
    }
}

class Cheque implements User, Product{

    public void displayEmail(String email){
        System.out.printf("Email: %s\n", email);
    }
    public void displayNickname(String name){
        System.out.printf("Никнейм: %s\n", name);
    }
    public void displayPassword(String password){
        int length = password.length();
        String s = "";
        for(int i = 0; i < length; i++){
            s += "*";
        }
        System.out.printf("Пароль: %s\n", s);
    }
    public void displayPhoneModel(String model){
        System.out.printf("Наименование товара: %s\n", model);
    }
    public void displayPrice(double price){
        System.out.printf("Стоимость товара: %.2f$\n", price);
    }
    public void displayRating(String rating){
        System.out.printf("Рейтинг товара: %s\n", rating);
    }
}



public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название товара (IPhone, Xiaomi, Tesla Phone): ");
        String name = in.nextLine();
        System.out.print("Введите электронную почту: ");
        String email = in.nextLine();
        System.out.print("Введите никнейм от аккаунта: ");
        String nick = in.nextLine();
        System.out.print("Введите пароль от аккаунта: ");
        String password = in.nextLine();

        IPhone iphone = new IPhone();
        Xiaomi xiaomi = new Xiaomi();
        Tesla tesla = new Tesla();
        Review review = new Review();
        History history = new History();
        Deposit address = new Deposit();
        Cheque cheque = new Cheque();

        if("IPhone".equals(name)){
            System.out.println("\tЧЕК");
            cheque.displayEmail(email);
            cheque.displayNickname(nick);
            cheque.displayPassword(password);
            cheque.displayPhoneModel(iphone.model);
            cheque.displayPrice(iphone.price);
            cheque.displayRating(iphone.rating);
        }
        else if("Xiaomi".equals(name)){
            System.out.println("\tЧЕК");
            cheque.displayEmail(email);
            cheque.displayNickname(nick);
            cheque.displayPassword(password);
            cheque.displayPhoneModel(xiaomi.model);
            cheque.displayPrice(xiaomi.price);
            cheque.displayRating(xiaomi.rating);

        }
        else if("Tesla Phone".equals(name)){
            System.out.println("\tЧЕК");
            cheque.displayEmail(email);
            cheque.displayNickname(nick);
            cheque.displayPassword(password);
            cheque.displayPhoneModel(tesla.model);
            cheque.displayPrice(tesla.price);
            cheque.displayRating(tesla.rating);
        }
        else{
            System.out.println("Error");
        }
    }
}
