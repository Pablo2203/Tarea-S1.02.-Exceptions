package Nivel3.Ejercicio1.model;

import Nivel3.Ejercicio1.programManger.CinemaManager;
import Nivel3.Ejercicio1.programManger.SeatManager;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Cinema {
    private int numberOfRows;
    private int numberOfSeatsPerRow;
    private CinemaManager cinemaManager;
    private SeatManager seatManager;

    public Cinema() {
        this.seatManager = new SeatManager();
        this.cinemaManager = new CinemaManager(this);
        askInitialData();

    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public int getNumberOfSeatsPerRow() {
        return numberOfSeatsPerRow;
    }

    public int getNumberOfSeats() {
        return numberOfRows * numberOfSeatsPerRow;
    }

    public SeatManager getSeatManager() {
        return seatManager;
    }
    Scanner scanner = new Scanner(System.in);
    public void start() {
        int option = -1;
        do {
            try {

                cinemaManager.menu();
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> this.cinemaManager.showOcupiedSeats();
                    case 2 -> this.cinemaManager.showBookedSeats();
                    case 3 -> this.cinemaManager.bookASeat();
                    case 4 -> this.cinemaManager.cancelSeatBooking();
                    case 5 -> this.cinemaManager.cancelAllBooking();
                    case 0 -> System.out.println("Leaving the menu...");
                    default -> System.out.println("Invalid option. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, introduzca un número.");
                scanner.next(); // Limpiar el scanner
            }

        }  while (option != 0) ;
    }

            public void askInitialData() {
                Scanner scanner = new Scanner(System.in);
                boolean validFormat = false;
                while (!validFormat) {
                    try {
                        System.out.println("Welcome to the cinema manager! Disclaimer, this options are not for the customers");
                        System.out.println("Introduce the number of rows: ");
                        this.numberOfRows = scanner.nextInt();
                        System.out.println("Introduce the number of seats per row: ");
                        this.numberOfSeatsPerRow = scanner.nextInt();
                        if (numberOfRows <= 0 || numberOfSeatsPerRow <= 0) {
                            throw new InputMismatchException();
                        }
                        validFormat = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please introduce valid numbers.");
                        scanner.nextLine();
                    }
                }
            }

        }

