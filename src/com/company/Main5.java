package com.company;

public class Main5 {

    public static void main(String[] args) {
	// write your code here
        int temperature = 30;
        int numberOfStudents = 15;
        boolean isRainy = false;

        if (temperature >= 25) {
            System.out.println("На улице жарко");
        }
        if (temperature < 0) {
            System.out.println("Хей чувак");
            System.out.println("На улице холодно");
        }

        if (numberOfStudents < 8) {
            System.out.println("Go to the cinema");
        } else {
            System.out.println("Go to the picnic");
        }

        /*else {
            System.out.println("Go to the picnic");
        }*/
        temperature = -15;
        isRainy = true;
        if (temperature < -10) {
            System.out.println("Наденьте куртку");
        } else if (temperature > 35) {
            System.out.println("Наденьте кепку");
        } else if (isRainy) {
            System.out.println("Наденьте зонт");
        } else {
            System.out.println("Хорошей прогулки");
        }

        if (numberOfStudents > 20) {
            System.out.println("Закажем автобус");
        if (isRainy) {
            System.out.println("Поедим в кафе");
        } else {
            System.out.println("Поедим в горы");
        }
        }
    }
}
