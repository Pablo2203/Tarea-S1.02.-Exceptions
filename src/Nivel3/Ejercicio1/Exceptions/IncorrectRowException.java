package Nivel3.Ejercicio1.Exceptions;

public class IncorrectRowException extends Exception{
    public IncorrectRowException() {
        super("The row is incorrect");
    }
}
