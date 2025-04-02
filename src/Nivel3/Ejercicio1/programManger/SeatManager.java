package Nivel3.Ejercicio1.programManger;

import Nivel3.Ejercicio1.model.Seat;

import java.util.ArrayList;
import java.util.Scanner;


public class SeatManager {
 private ArrayList<Seat> seats;

 public SeatManager() {

     seats = new ArrayList<>();
 }

 public ArrayList<Seat> getSeats(){
        return seats;
    }

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
        int result = -1;
        for (int i = 0; i < seats.size(); i++) {
            if (seats.get(i).getRowNumber() == rowNumber && seats.get(i).getSeatNumber() == seatNumber) {
                result = i;
                break;
            }
        }
        return result;
    }



}

