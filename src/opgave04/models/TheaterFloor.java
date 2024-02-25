package opgave04.models;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class TheaterFloor {
    int[][] seats = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10}, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {20, 20, 30, 30, 40, 40, 30, 30, 20, 20}, {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
            {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};


    public TheaterFloor() {

    }

    /**
     * Hvis plads seat på række row er ledig reserveres pladsen og der returneres true
     * Der returneres false hvis pladsen er optaget.
     *
     * @param row
     * @param seat
     * @return
     */


    public boolean buySeat(int row, int seat) {
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[row].length) {
            if (seats[row][seat] != 0) {
                seats[row][seat] = 0;
                return true;
            }
        }
        return false;
    }

    /**
     * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
     * der returneres true. Der returneres false, hvis der ikke er nogen pladser ledige
     * til den pågældende pris.
     *
     * @param price
     * @return
     */
    public boolean buySeat(int price) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == price) {
                    seats[i][j] = 0;
                    return true;
                }
            }
        }
        return false;

    }

    public void printOptions() {
        System.out.println("Menu");
        System.out.println("1. Buy the ticket based on price");
        System.out.println("2. Buy the ticket based on row and seat");
    }

    public void printTheaterFloor() {
        System.out.println("De ledige pladser er angivet med deres pris");
        System.out.printf("%7s : ", "Sæde");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-3d ", i);
        }
        System.out.printf("\n %6s : %-40s \n", "", "-".repeat(38));
        for (int row = 0; row < seats.length; row++) {
            System.out.printf("Række %d : ", (row + 1));
            for (int col = 0; col < seats[row].length; col++) {
                String currentSeat = seats[row][col] == 0 ? "--" : seats[row][col] + "";
                System.out.printf("%2s", currentSeat);
                if (col < seats[row].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

