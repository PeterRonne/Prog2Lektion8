package opgave05;

import opgave05.models.Absence;

public class Opgave05 {
    public static void main(String[] args) {
        int[][] a = {
                {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
                {1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0},
                {5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0}
        };
        Absence absence = new Absence(a);

        absence.print();
        System.out.println();
        System.out.println("absence.totalAbsence(1) = " + absence.totalAbsence(1));
        System.out.println("absence.totalAbsence(2) = " + absence.totalAbsence(2));
        System.out.println("absence.totalAbsence(3) = " + absence.totalAbsence(3));
        System.out.println("absence.totalAbsence(4) = " + absence.totalAbsence(4));
        System.out.println("absence.totalAbsence(5) = " + absence.totalAbsence(5));

        System.out.println();

        System.out.println("absence.average(5) = " + absence.average(5));
        System.out.println("absence.studentsWithoutAbsence() = " + absence.studentsWithoutAbsence());
        System.out.println("absence.mostAbsence() = " + absence.mostAbsence());


        absence.reset(4);

        absence.print();


    }

}
