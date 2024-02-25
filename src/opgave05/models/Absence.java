package opgave05.models;

public class Absence {
    private int[][] absenceSchema;

    public Absence(int[][] absenceSchema) {
        this.absenceSchema = absenceSchema;
    }

    public void print() {
        printBreakLine(75);

        System.out.printf("|%-12s | ", "Elev/Måned");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%-2d %-2s", i, "| ");
        }
        printBreakLine(75);

        for (int row = 0; row < absenceSchema.length; row++) {
            System.out.printf("|%-12s | ", (row + 1) + "");
            for (int col = 0; col < absenceSchema[row].length; col++) {
                System.out.printf("%-2d %-2s", absenceSchema[row][col], "| ");
            }
            printBreakLine(75);
        }

    }

    private static void printBreakLine(int count) {
        System.out.println("\n" + "-".repeat(count));
    }

    public int totalAbsence(int studentNumber) {
        int totalAbsence = 0;
        for (int month = 0; month < absenceSchema[studentNumber - 1].length; month++) {
            totalAbsence += absenceSchema[studentNumber - 1][month];
        }

        return totalAbsence;
    }

    public double average(int studentNumber) {
        return (double) totalAbsence(studentNumber) / 12;
    }

    public int studentsWithoutAbsence() {
        int StudentsWithoutAbsence = 0;
        for (int studentNumber = 1; studentNumber < absenceSchema.length + 1; studentNumber++) {
            if (totalAbsence(studentNumber) == 0) {
                StudentsWithoutAbsence++;
            }
        }

        return StudentsWithoutAbsence;
    }

    public int mostAbsence() {
        int mostAbsence = Integer.MIN_VALUE;
        int studentWithMostAbsence = -1;
        for (int studentNumber = 1; studentNumber < absenceSchema.length + 1; studentNumber++) {
            int absence = totalAbsence(studentNumber);
            if (absence > mostAbsence) {
                mostAbsence = absence;
                studentWithMostAbsence = studentNumber;
            }
        }

        return studentWithMostAbsence;
    }

    public void reset(int studentNumber) {
        for (int month = 0; month < absenceSchema[studentNumber - 1].length; month++) {
            absenceSchema[studentNumber - 1][month] = 0;
        }
    }
}
