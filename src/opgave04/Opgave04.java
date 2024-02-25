package opgave04;

import opgave04.models.TheaterFloor;

import java.util.Scanner;


public class Opgave04 {
    public static void main(String[] args) {
        TheaterFloor theaterFloor = new TheaterFloor();
        theaterFloor.printTheaterFloor();

        Scanner input = new Scanner(System.in);

        boolean saleFinalized = false;

        while (!saleFinalized) {
            theaterFloor.printOptions();

            switch (input.nextInt()) {
                case 1:
                   saleFinalized = buySeatBasedOnPrice(input, theaterFloor);
                    break;
                case 2:
                    saleFinalized = buySeatBasedOnRowAndSeat(input, theaterFloor);
                    break;
                default:
                    System.out.println("Not an option: ");
            }

        }
        theaterFloor.printTheaterFloor();
        input.close();
    }

    private static boolean buySeatBasedOnRowAndSeat(Scanner input, TheaterFloor theaterFloor) {
        System.out.println("Enter a row:");
        int row = input.nextInt();

        System.out.println("Enter a seat:");
        int seat = input.nextInt();

        return theaterFloor.buySeat(row - 1, seat - 1);
    }

    private static boolean buySeatBasedOnPrice(Scanner input, TheaterFloor theaterFloor) {
//        ArrayList<Integer> prices = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        System.out.println("Enter a valid price:");

        int answer = input.nextInt();

        return theaterFloor.buySeat(answer);
    }
}
