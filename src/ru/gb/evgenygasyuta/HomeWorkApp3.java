package ru.gb.evgenygasyuta;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        changeArr();
        System.out.println();
        System.out.println("Задание 2");

    }

    private static void changeArr() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1,0,0,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            System.out.print(arr[i]);
        }
    }
}
