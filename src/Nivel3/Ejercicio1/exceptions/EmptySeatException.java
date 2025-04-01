package Nivel3.Ejercicio1.exceptions;

public class EmptySeatException extends Exception{
    public EmptySeatException() {
        super("The seat is empty");
    }
}
