package Nivel2.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrance {
    public static Scanner scanner = new Scanner(System.in);

    public Entrance() {
    }


    public static byte readByte(String message) {
        boolean validFormat = false;
        byte birthday = 0;
        while (!validFormat) {
            try {
                System.out.println(message);
                birthday = scanner.nextByte();
                validFormat = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format. Please introduce a byte.");
                scanner.nextLine();
            }
        }
        return birthday;
    }

    public static int readInt(String message) {
        boolean validFormat = false;
        int birthday = 0;
        while (!validFormat) {
            try {
                System.out.println(message);
                birthday = scanner.nextInt();
                validFormat = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format. Please introduce an Integer.");
                scanner.nextLine();
            }
        }
        return birthday;
    }

    public static float readFloat(String message) {
        boolean validFormat = false;
        float birthday = 0;
        while (!validFormat) {
            try {
                System.out.println(message);
                birthday = scanner.nextFloat();
                validFormat = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format. Please introduce a float.");
                scanner.nextLine();
            }
        }
        return birthday;
    }

    public static double readDouble(String message) {
        boolean validFormat = false;
        double result = 0;
        while (!validFormat) {
            try {
                System.out.println(message);
                result = scanner.nextDouble();
                validFormat = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format. Please introduce a double.");
                scanner.nextLine();
            }
        }
        return result;
    }

    public static char readChar(String message) {
        boolean validFormat = false;
        char result = ' ';
        while (!validFormat) {
            try {
                System.out.println(message);
                String input = scanner.next();
                char inputChar = input.charAt(0);
                if (input.length() != 1 && !Character.isDigit(inputChar)) {
                    throw new PersonalizedException();
                }
                result = input.charAt(0);
                validFormat = true;
            } catch (PersonalizedException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public static String readString(String message) {
        boolean validFormat = false;
        String result = "";
        while (!validFormat) {
            try {
                System.out.println(message);
                String input = scanner.next();
                if (input.length() < 1 && !input.matches("[a-zA-Z]+")) {
                    throw new PersonalizedException();
                }
                result = input;
                validFormat = true;
            } catch (PersonalizedException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }


    public static boolean readYesNo(String message) {
        boolean validFormat = false;
        boolean result = false;
        while (!validFormat) {
            try {
                System.out.println(message);
                String input = scanner.next().toLowerCase();
                if (input.equals("y")) {
                    result = true;
                    validFormat = true;
                } else if (input.equals("n")) {
                    result = false;
                    validFormat = true;
                } else {
                    throw new PersonalizedException();
                }
            } catch (PersonalizedException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;

    }
}



