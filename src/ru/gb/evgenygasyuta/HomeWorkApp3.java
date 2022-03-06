package ru.gb.evgenygasyuta;

import java.sql.SQLOutput;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        changeArr();
        System.out.println();
        System.out.println("Задание 2");
        createArr();
        System.out.println();
        System.out.println("Задание 3");
        arrX2();
        System.out.println();
        System.out.println("Задание 4");
        diagonalArr();
        System.out.println();
        System.out.println("Задание 5");
        makeArr();
        System.out.println();
        System.out.println("Задание 6");
        maxMinArr();




    }

    private static void maxMinArr() {
        int[] arr = {10, 2, 6, 8, 17, 5};
        int min = arr[0];
        int max = arr [0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    private static void makeArr() {
        int len = 7;
        int intValue = 77;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = intValue;
            System.out.print(arr[i] + " ");
        }
    }

    private static void diagonalArr() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
              if (i == j){
                  arr[i][j] = 1;
              } else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        }


    private static void arrX2() {
        int[] arr = {22, 6, 3, 2, 11, 4, 5, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i]=arr[i]*2;
            }else arr[i]=arr[i];
            System.out.print(arr[i] + " ");
        }
    }

    private static void createArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
            System.out.print(arr[i] + " ");

        }
    }

    private static void changeArr() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1,0,0,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            System.out.print(arr[i] + " " );
        }
    }
}
