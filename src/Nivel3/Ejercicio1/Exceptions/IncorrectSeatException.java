package Nivel3.Ejercicio1.Exceptions;

public class IncorrectSeatException extends Exception{
    public IncorrectSeatException() {
        super("The seat is incorrect");
    }
}
