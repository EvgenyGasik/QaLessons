package ru.gb.evgenygasyuta;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    public static void main(String[] args) {
        String[][] map = initField(3);
        boolean isGameActive = true;
        System.out.println("Game is start !");
        printMap(map);
        while (isGameActive) {


            player(map);
            printMap(map);
            if (isWinner("X", map) || ifBothLose(map)){
                isGameActive = false;
                break;
            }
            compucter(map);
            printMap(map);
            if (isWinner("0", map) || ifBothLose(map)){
                isGameActive = false;
                break;
            }

        }


    }
    public static boolean isWinner(String mark, String[][] map){
        // продумать логику победы с циклом
        /*if(
                (map[0][0].equals(mark) && map[0][1].equals(mark) && map[0][2].equals(mark))
                        || (map[1][0].equals(mark) && map[1][1].equals(mark) && map[1][2].equals(mark))
                        || (map[2][0].equals(mark) && map[2][1].equals(mark) && map[2][2].equals(mark))

        ){
            System.out.println(mark + " Winner");
            return true;
        }
        else if (
                (map[0][0].equals(mark) && map[1][1].equals(mark) && map[2][2].equals(mark))
                        || (map[0][2].equals(mark) && map[1][1].equals(mark) && map[2][0].equals(mark))
        ){
            System.out.println(mark + "Winner");
            return true;
        } else if (
                (map[0][0].equals(mark) && map[1][1].equals(mark) && map[2][2].equals(mark))
                        || (map[0][1].equals(mark) && map[1][1].equals(mark) && map[2][1].equals(mark))
                        || (map[0][2].equals(mark) && map[1][2].equals(mark) && map[2][2].equals(mark))

        )
        {
            System.out.println(mark + "Winner");
            return true;
        }
        else {
            return false;
        }*/
    }
    public static boolean ifBothLose(String[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(map[i][j].equals("*")) {
                    return false;
                }

            }

        }
        System.out.println("Its DRAW!");
        return true;

    }

    public static void player(String[][] map) {
        System.out.println("Player turn");
        Scanner sc = new Scanner(System.in);



        boolean isActiveTurn = true;

        while (isActiveTurn) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((x > 0 && x <= map[0].length) || (y > 0 && y <= map.length)) {
                if (map[x - 1][y - 1].equals("*")) {
                    map[x -1][y - 1] = "X";
                    isActiveTurn = false;
                } else {
                    System.out.println("Occupied");
                }
            } else {
                System.out.println("Out of map");
            }
        }
    }
    public static void compucter(String[][] map) {
        System.out.println("Compucter turn");

        Random rand = new Random();

        boolean isActiveTurn = true;

        while (isActiveTurn) {
            int x = rand.nextInt(map[0].length);
            int y = rand.nextInt(map.length);
            if (map[x][y].equals("*")) {
                map[x][y] = "0";
                isActiveTurn = false;

            }

        }

        System.out.println("Compucter turns end ");
    }
    public static void printMap(String[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static String[][] initField(int size){
        String[][] map =new String[size][size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "*";

            }

        }
        return map;
    }
}
