package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(false, 22));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(area(34, 5));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzunluğu giriniz: ");
        double width = scanner.nextDouble();

        System.out.print("Genişliği giriniz: ");
        double heigth = scanner.nextDouble();

        double result = area(width, heigth);
        if (result != -1) {
            System.out.println("Dikdörtgenin alanı: " + result);
        }

        System.out.print("Radius giriniz: ");
        double radius = scanner.nextDouble();

        double result2 = area(radius);
        if (result != -1) {
            System.out.println("Dairenin alanı: " + result2);
        }
    }

    public static boolean shouldWakeUp(boolean isBarking , int clock) {
        if (clock < 0 || clock > 24) {
            return false;
        } else if ((isBarking ) && (clock > 8 && clock < 20)) {
            return false;
        } else if(isBarking  && (clock < 8 || clock > 20)){
            return true;
        }else if(!isBarking){
            return false;
        }else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if((firstAge > 12 && firstAge < 20) || (secondAge > 12 && secondAge < 20) || (thirdAge > 12 && thirdAge < 20)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer && (temp >= 25 && temp <= 45)){
            return true;
        }else if (!isSummer && (temp >= 25 && temp <= 35)){
            return true;
        }else {
            return false;
        }
    }

    public static double area(double width, double height) {
       if (width < 0 || height < 0){
           return -1;
       }else {
           return width * height;
       }
    }


    public static double area(double radius) {
        if (radius < 0){
            return -1;
        }else {
            return radius * radius * Math.PI;
        }
    }


}
