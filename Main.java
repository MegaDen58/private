package com.company;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String wor = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] letters = wor.toCharArray();

        String[] code = new String[]
                { "AA", "AD", "AF", "AG", "AV", "AX",
                        "DA", "DD", "DF", "DG", "DV", "DX",
                        "FA", "FD", "FF", "FG", "FV", "FX",
                        "GA", "GD", "GF", "GG", "GV", "GX",
                        "VA", "VD", "VF", "VG", "VV", "VX",
                        "XA", "XD", "XF", "XG", "XV", "XX"
                };

        System.out.print("Введите слово: ");
        String word = in.nextLine();
        String down = word.toLowerCase();
        String result = "";
        for(int i = 0; i < down.length(); i++){
            char let = down.charAt(i);
            int idx = wor.indexOf(let);
            String one = code[idx];
            result += one;
        }
        System.out.println(result);
    }
}