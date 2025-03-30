package Nivel3.Ejercicio1;

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

//Clase Butaca
//
//Tendrá los datos de un sillón:
//
//Atributos:
//
//Número de fila.
//
//Número de asiento.
//
//Persona que reserva el sillón.
//
//Métodos:
//
//Constructor con todos sus parámetros.
//
//Getters por todos los atributos.
//
//Equals: devolverá que dos butacas son iguales si la fila y el asiento son iguales.
//
//toString: devolverá un String con el siguiente formato: “Fila: 5, Asiento: 20, Persona: Maria Febrer”