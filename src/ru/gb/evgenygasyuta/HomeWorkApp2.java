package ru.gb.evgenygasyuta;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        System.out.println(checkSum(6, 5));
        System.out.println("Задание 2 ");
        negativeOrNot(-22);
        System.out.println("Задание 3 ");


    }

    public static void negativeOrNot(int a) {
        if (a >=0 ){
            System.out.println("Number "+ a +" is positive");
        } else System.out.println("Number " + a + " is negative ");
    }

    public static boolean checkSum(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }
}
