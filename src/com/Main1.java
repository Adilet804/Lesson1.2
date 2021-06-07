package com;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String helloWorld;
        final int NUM = 20;
        String word = " Adilet";
        helloWorld = NUM + word;
        System.out.println(helloWorld);
        if (NUM > 0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String string = s.nextLine();
        System.out.println("Привет "+ string);
    }
}

