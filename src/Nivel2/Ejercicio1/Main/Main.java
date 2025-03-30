package Nivel2.Ejercicio1.Main;

import Nivel2.Ejercicio1.Entrance;
import Nivel2.Ejercicio1.PersonalizedException;

public class Main {
    public static void main(String[] args) throws PersonalizedException {
    Entrance entrance = new Entrance();

            byte valueInByte = entrance.readByte("Introduce your birthday (Only the DD)");
        System.out.println(valueInByte);

        int valueInInt = entrance.readInt("Introduce your age");
        System.out.println(valueInInt);

        float valueInFloat = entrance.readFloat("Introduce your weight");
        System.out.println(valueInFloat);

        double valueInDouble = entrance.readDouble("Introduce your height in centimeters");

        char valueInChar = entrance.readChar("Introduce your name's initial");
        System.out.println(valueInChar);

        String valueInString = entrance.readString("Introduce your name");
        System.out.println(valueInString);

        boolean valueInBoolean = entrance.readYesNo("Are you married? Y/N");
        System.out.println(valueInBoolean);


    }
}
