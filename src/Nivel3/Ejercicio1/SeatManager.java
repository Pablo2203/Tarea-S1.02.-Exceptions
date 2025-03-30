package Nivel3.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

import static Nivel2.Ejercicio1.Entrance.scanner;


public class SeatManager {
 private ArrayList<Seat> seats;

 public SeatManager() {
     seats = new ArrayList<>();
 }
    Scanner scanner = new Scanner(System.in);

 public ArrayList<Seat> getSeats(){
        return seats;
    }
    //"añadirButaca": será el encargado de añadir una butaca al ArrayList de butacas. Recibirá como parámetro un objeto de la
// clase "Butaca" y lo añadirá a ArrayList. Si la fila y el asiento de la butaca recibida como parámetro coinciden con el
// de una butaca que ya se encuentre en ArrayList (se utilizará el método "buscarButaca"), se lanzará la excepción personalizada
//  "ExcepcioButacaOcupada".
    public void addSeat(Seat seat) {
        if (searchSeat(seat.getRowNumber(), seat.getSeatNumber()) != -1) {
            System.out.println("The seat is already booked.");
            return;
        }
        seats.add(seat);
        System.out.println("The seat has been reserved successfully!");
    }

    public void removeSeat(int rowNumber, int seatNumber) {
        int index = searchSeat(rowNumber, seatNumber);
        if (index == -1) {
            System.out.println("The seat is already free.");
        } else {
            seats.remove(index);
            System.out.println("The seat has been removed successfully!");
        }
    }


    public int searchSeat(int rowNumber, int seatNumber) {
        for (int i = 0; i < seats.size(); i++) {
            if (seats.get(i).getRowNumber() == rowNumber && seats.get(i).getSeatNumber() == seatNumber) {
                return i;
            }
        }
        return -1;
    }


}

