package Nivel1.Ejercicio1.exception;

public class EmptySaleException extends Exception{

    public EmptySaleException() {
        super("To make a sale you must first add a product");
    }
}
