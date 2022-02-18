package ru.gb.evgenygasyuta;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        System.out.println(checkSum(6, 5));
        System.out.println("Задание 2 ");
        negativeOrNot(-22);
        System.out.println("Задание 3 ");
        System.out.println(negativeOrNotV2(6));
        System.out.println("Задание 4");
        printLine("Hello", 5);
        System.out.println("Задание 5 ");
        System.out.println(checkYear(2021));

    }
    private static boolean checkYear(int i) {

        if ((!(i % 4 == 0) || ((i % 100 == 0) && !(i % 400 == 0)))){
            return false;

        } else return true;
    }



    public static void printLine(String text, int a) {
        for (int i = 0; i == a ; i++) {
            System.out.println(i);
        }
        }


    public static boolean negativeOrNotV2(int a) {
      return a <= 0;

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
