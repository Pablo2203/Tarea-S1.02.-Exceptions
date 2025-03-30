package Nivel3.Ejercicio1.Exceptions;

public class OccupiedSeatException extends Exception{
    public OccupiedSeatException() {
        super("The seat is occupied");
    }
}
