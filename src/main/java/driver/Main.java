package driver;

import ships.CargoShip;
import ships.CruiseShip;
import ships.Ship;

import java.util.Scanner;

public class Main {
    private static String getString(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static int getInt(String prompt, Scanner scanner) {
        System.out.print(prompt);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    private static void printShips(Ship[] ships) {
        for (Ship shipInstance : ships) {
            shipInstance.print();
        }
    }

    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        Scanner scanner = new Scanner(System.in);
        String namePrompt = "Name: ";
        String yearBuiltPrompt = "Year built: ";

        System.out.println("Creating ship...");
        ships[0] = new Ship(
            getString(namePrompt, scanner),
            getString(yearBuiltPrompt, scanner)
        );
        System.out.println("Creating cruise ship...");
        ships[1] = new CruiseShip(
            getString(namePrompt, scanner),
            getString(yearBuiltPrompt, scanner),
            getInt("Max passengers: ", scanner)
        );
        System.out.println("Creating cargo ship...");
        ships[2] = new CargoShip(
            getString(namePrompt, scanner),
            getString(yearBuiltPrompt, scanner),
            getInt("Tonnage capacity: ", scanner)
        );

        printShips(ships);
    }
}
