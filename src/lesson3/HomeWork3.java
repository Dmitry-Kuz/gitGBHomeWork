package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    private static final char HUMAN_DOT = 'X';
    private static final char PC_DOT = 'O';
    private static final char EMLTY_DOT = '_';


    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static int fieldSizeX;
    public static int fieldSizeY;
    public static char[][] field;

    public static void initMap() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeX; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = EMLTY_DOT;
            }
        }

    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты через ENTER:");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValideCell(y, x) || !isEmptyCell(y, x));

        field[y][x] = HUMAN_DOT;
    }

    public static void pcTurn() {
        int x;
        int y;

        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(y, x));
        field[y][x] = PC_DOT;

    }

    public static boolean isValideCell(int y, int x) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    public static boolean isEmptyCell(int y, int x) {
        return field[y][x] == EMLTY_DOT;
    }

    public static void printMap() {
        for (int y = 0; y < fieldSizeX; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static boolean checkWin(char c) {
        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
        return false;
    }

    public static boolean isFullMap() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == EMLTY_DOT) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(HUMAN_DOT)) {
                System.out.println("Человек выиграл!!!");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья.");
                break;
            }
            System.out.println();
            pcTurn();
            printMap();
            if (checkWin(PC_DOT)) {
                System.out.println("Компьютер выиграл!!!");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья.");
                break;
            }


            System.out.println();

        }
    }
}
