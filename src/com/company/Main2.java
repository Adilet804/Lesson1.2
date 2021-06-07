package com.company;

public class Main2 {
    public static void main(String[] args) {
        int number = 5;
        switch (number) {
            case 1:
                System.out.println("Число равно одному");
                break;
            case 2:
                System.out.println("Число равно двум");
                break;
            case 3:
                System.out.println("Число равно трём");
                break;
            default:
                System.out.println("Число неизвестно");
                break;
        }
        if (number == 2) {
            System.out.println("Конструкция IF");
        }
        String name = "Adilet";
        switch (name) {
            case "Usman":
                System.out.println("Привет Усман");
                break;
            case "Adilet":
                System.out.println("Привет Адилет");
                break;
            case "Malik":
                System.out.println("Привет Малик");
                break;
            default:
                System.out.println("Привет незнакомец");
                break;
        }
    }
}
