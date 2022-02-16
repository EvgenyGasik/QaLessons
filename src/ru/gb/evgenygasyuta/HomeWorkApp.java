package ru.gb.evgenygasyuta;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");
        System.out.println();
        checkSumSign(-12,6);
        System.out.println();
        printColor(101);
        System.out.println();
        compareNumbers(7,3);

    }

    private static void compareNumbers(int a, int b) {
        if (a >=b ){
            System.out.println("a >= b");
        } else System.out.println(" a < b");
    }

    private static void printColor(int value) {
        if (value <=0 ){
            System.out.println("Red");
        }
        if (value > 0 && value <= 100){
            System.out.println("Yellow");
        } if (value > 100){
            System.out.println("Green");
        }


    }

    private static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Summ is positive");
        }else System.out.println("Sum is negative");

    }

    private static void printThreeWords(String wordOne, String wordTwo, String wordThree) {
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);


    }
}
