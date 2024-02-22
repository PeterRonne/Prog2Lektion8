package opgave01.models;

import java.util.Arrays;

public class TwoDimensionalIntArray {

    private int[][] intArray;

    public TwoDimensionalIntArray(int[][] intArray) {
        this.intArray = intArray;
    }

    //    a) Implementer setValueAt metoden i klassen TwoDimensionalIntArray
    public void setValueAt(int row, int column, int value) {
        this.intArray[row][column] = value;
    }

    //    b) Implementer getValueAt metoden i klassen TwoDimensionalIntArray
    public int getValueAt(int row, int column) {
        return this.intArray[row][column];
    }

    //    c) Implementer sumRow metoden i klassen TwoDimensionalIntArray. Metoden skal
    //    summere alle tallene i den angivende række.
    public int sumRow(int row) {
        int sumRow = 0;
        for (int column = 0; column < intArray[row].length; column++) {
            sumRow += intArray[row][column];
        }
        return sumRow;
    }
    //    d) Implementer sumColumn metoden. Metoden skal summere alle tallene i den
    //    angivende kolonne.
    public int sumColumn(int column) {
        int sumColumn = 0;
        for (int row = 0; row < intArray.length; row++) {
            sumColumn += intArray[row][column];
        }
        return sumColumn;
    }
    //    e) Implementer sumAll metoden. Metoden skal summere alle tallene i intArray
    //    attributten.
    public int sumAll() {
        int total = 0;
        for (int[] ints : intArray) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        return total;
    }
    //    f) Implementer print metoden. Metoden skal udskrive indholdet af intArray attributten
    //    på en passende måde.
    public void print() {
        int maxWidth = 0;
        for (int[] row : intArray) {
            for (int num : row) {
                int width = String.valueOf(num).length();
                if (width > maxWidth) {
                    maxWidth = width;
                }
            }
        }

        for (int[] row : intArray) {
            for (int num : row) {
                int padding = maxWidth - String.valueOf(num).length() + 1;
                System.out.print(num + " ".repeat(padding));
            }
            System.out.println();
        }
    }

    //    g) Ekstra opgave: Implementer map metoden. Denne metode skal kalde apply metoden
    //    fra Interfaces IntFunction på alle tallene i intArray attributten og opdatere tallene med
    //    den nye værdi.

    //    Afprøv map metoden, det kunne være med en funktion der fordobler værdien.

    public void map(IntFunction function) {
        for (int row = 0; row < intArray.length; row++) {
            for (int col = 0; col < intArray[row].length; col++) {
                intArray[row][col] = function.apply(intArray[row][col]);
            }
        }
    }


}
