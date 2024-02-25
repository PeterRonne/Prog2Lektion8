package opgave04.models;

public class Seat {
    private int price;
    private boolean reserved;

    public Seat(int price) {
        this.price = price;
        this.reserved = false;
    }

    public void reserveSeat() {
        reserved = true;
    }

    public int getPrice() {
        return price;
    }

    public boolean isReserved() {
        return reserved;
    }


}
