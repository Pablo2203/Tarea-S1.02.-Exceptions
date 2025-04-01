package Nivel2.Ejercicio1.model;

import Nivel2.Ejercicio1.exception.PersonalizedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrance {
    private static Scanner scanner = new Scanner(System.in);

    public Entrance() {
    }

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                byte birthday = scanner.nextByte();
                if (birthday < 1 || birthday > 31) {
                    throw new InputMismatchException();
                }
                return birthday;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format. Please enter a number without decimals between 1 and 31.");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                int age = scanner.nextInt();
                if (age < 0) {
                    throw new InputMismatchException();
                }
                return age;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format. Please introduce a positive number.");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                float weight = scanner.nextFloat();
                if (weight < 0) {
                    throw new InputMismatchException();
                }
                return weight;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format. Please introduce a positive number. For decimal numbers, use a comma.");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                double height = scanner.nextDouble();
                if (height < 0) {
                    throw new InputMismatchException();
                }
                return height;
            } catch (InputMismatchException e) {
                System.out.println("Wrong format. Please introduce a positive number. For decimal numbers, use a comma.");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.next();
                char inputChar = input.charAt(0);
                if (input.length() != 1 || Character.isDigit(inputChar)) {
                    throw new PersonalizedException();
                }
                return inputChar;
            } catch (PersonalizedException e) {
                System.out.println("Wrong format. Please introduce a single alphabetic character.");
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.next();
                if (input.length() < 1 || !input.matches("[a-zA-Z]+")) {
                    throw new PersonalizedException();
                }
                return input;
            } catch (PersonalizedException e) {
                System.out.println("Wrong format. Please introduce alphabetic characters only.");
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.next().toLowerCase();
                if (input.equals("y")) {
                    return true;
                } else if (input.equals("n")) {
                    return false;
                } else {
                    throw new PersonalizedException();
                }
            } catch (PersonalizedException e) {
                System.out.println("Wrong format. Please introduce 'Y' or 'N'.");
            }
        }
    }
}