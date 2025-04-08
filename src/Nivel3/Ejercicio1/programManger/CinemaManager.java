package Nivel3.Ejercicio1.programManger;

import Nivel3.Ejercicio1.exceptions.IncorrectCostumerNameExeception;
import Nivel3.Ejercicio1.model.Cinema;
import Nivel3.Ejercicio1.model.Seat;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CinemaManager {
    private Cinema cinema;
    private Scanner scanner = new Scanner(System.in);

    public CinemaManager(Cinema cinema) {
        this.cinema = cinema;
    }

    public void menu() {
        System.out.println("Welcome to the cinema manager! Please select an option with the number:");
        System.out.println("\nMENÚ:");
        System.out.println("1.- Mostrar todas las butacas reservadas.");
        System.out.println("2.- Mostrar las butacas reservadas por una persona.");
        System.out.println("3.- Reservar un sillón.");
        System.out.println("4.- Anular la reserva de un sillón.");
        System.out.println("5.- Anular todas las reservas de una persona.");
        System.out.println("0.- Salir");
    }

    public void showOcupiedSeats() {
        SeatManager seatManager = cinema.getSeatManager();
        ArrayList<Seat> seats = seatManager.getSeats();
        if (seats.isEmpty()) {
            System.out.println("No seats are currently booked.");
        } else {
            for (Seat seat : seats) {
                System.out.println(seat.toString());
            }
        }
    }

    public void showBookedSeats() {
        String name = introduceCustomerName();
        SeatManager seatManager = cinema.getSeatManager();
        ArrayList<Seat> seats = seatManager.getSeats();
        boolean reservationFound = false;

        for (Seat seat : seats) {
            if (seat.getCustomerName().equalsIgnoreCase(name)) {
                System.out.println(seat.toString());
                reservationFound = true;
            }
        }

        if (!reservationFound) {
            System.out.println("No reservations found for: " + name);
        }
    }

    public void bookASeat() {
        int row = introduceRow();
        int seatNumber = introduceSeat();
        String customerName = introduceCustomerName();
        SeatManager seatManager = cinema.getSeatManager();
        ArrayList<Seat> seats = seatManager.getSeats();

        for (Seat seat : seats) {
            if (seat.getRowNumber() == row && seat.getSeatNumber() == seatNumber) {
                System.out.println("This seat is already taken.");
                return;
            }
        }

        Seat newSeat = new Seat(row, seatNumber, customerName);
        seatManager.addSeat(newSeat);
    }

    public void cancelSeatBooking() {
        int row = introduceRow();
        int seatNumber = introduceSeat();
        boolean seatRemoved = false;

        SeatManager seatManager = cinema.getSeatManager();
        ArrayList<Seat> seats = seatManager.getSeats();
        var iterator = seats.iterator();
        while (iterator.hasNext()) {
            Seat seat = iterator.next();
            if (seat.getRowNumber() == row && seat.getSeatNumber() == seatNumber) {
                iterator.remove();
                System.out.println("The seat has been removed successfully! " + seat.toString());
                seatRemoved = true;
            }
        }

        if (!seatRemoved) {
            System.out.println("The specified seat does not exist or is not reserved.");
        }
    }

    public void cancelAllBooking() {
        String name = introduceCustomerName();
        SeatManager seatManager = cinema.getSeatManager();
        ArrayList<Seat> seats = seatManager.getSeats();

        boolean found = false;
        var iterator = seats.iterator();
        while (iterator.hasNext()) {
            Seat seat = iterator.next();
            if (seat.getCustomerName().equals(name)) {
                iterator.remove();
                System.out.println("Removed seat: " + seat);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No reservations found for: " + name);
        }
    }

        public String introduceCustomerName() {
            while (true) {
                try {
                    System.out.println("Please introduce the name of the customer:");
                    String name = scanner.nextLine();
                    if (name.matches(".*\\d.*") || name.isEmpty()) {
                        throw new IncorrectCostumerNameExeception();
                    }
                    return name;
                } catch (IncorrectCostumerNameExeception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    public int introduceRow() {
        while (true) {
            try {
                System.out.println("Please introduce the row number:");
                int row = scanner.nextInt();
                if (row < 1 || row > cinema.getNumberOfRows()) {
                    System.out.println("The row number must be between 1 and " + cinema.getNumberOfRows() + ".");
                    continue;
                }
                    return row;
                } catch(InputMismatchException e){
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }

        }
    }

    public int introduceSeat() {
        while (true) {
            System.out.println("Please introduce your seat number: ");
            if (scanner.hasNextInt()) {
                int seatNumber = scanner.nextInt();
                if (seatNumber >= 1 && seatNumber <= cinema.getNumberOfSeatsPerRow()) {
                    return seatNumber;
                } else {
                    System.out.println("Invalid seat number. Please enter a value between 1 and " + cinema.getNumberOfSeatsPerRow() + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }
}