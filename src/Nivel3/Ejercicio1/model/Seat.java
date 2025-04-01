package Nivel3.Ejercicio1.model;

public class Seat {
    private int rowNumber;
    private int seatNumber;
    private String customerName;

    public Seat(int rowNumber, int seatNumber, String customerName) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
    }
    public int getRowNumber() {
        return rowNumber;
    }
    public int getSeatNumber() {
        return seatNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public boolean equals(Seat seat){
        if (this.rowNumber == seat.getRowNumber() && this.seatNumber == seat.getSeatNumber()) {
            System.out.println("The seat is already booked");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return
                "Row: " + rowNumber +
                ", Seat: " + seatNumber +
                ", Customer´s name: '" + customerName + '\'';
    }
}
