package opgave03;

public class LocateSmallest {
    public static void main(String[] args) {

    }

    public static int[] locateSmallest(double[][] matrix) {
        int[] location = new int[2];
        double smallestValue = Double.MAX_VALUE;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                double currentValue = matrix[row][col];
                if (currentValue < smallestValue) {
                    smallestValue = currentValue;
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }
}
