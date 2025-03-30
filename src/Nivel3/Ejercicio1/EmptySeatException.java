package Nivel3.Ejercicio1;

public class EmptySeatException extends Exception{
    public EmptySeatException() {
        super("The seat is empty");
    }
}
