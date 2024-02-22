package opgave02;

import java.util.Scanner;

public class AverageMajorDiagonal {

    public static void main(String[] args) {

        double[][] matrix = new double[4][4];

        Scanner scanner = new Scanner(System.in);

        // Read input for the matrix from the user, one row at a time
        System.out.println("Enter the elements of the 4x4 matrix, one row at a time:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter elements for row %d: ", i);
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double average = averageMajorDiagonal(matrix);
        System.out.println("Average of the major diagonal: " + average);

        scanner.close();
    }

    public static double averageMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum / matrix.length;
    }
}
