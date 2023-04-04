package core;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int atmnumber = 1337228;
        int atmpin = 1488;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ATM Number: ");
        int atmNumber = in.nextInt();
        System.out.print("Enter PIN: ");
        int PIN = in.nextInt();
        if ((atmnumber==atmNumber)&&(atmpin==PIN))
            System.out.println("Validation done");
        else {
            System.out.println("Access denied");
            System.exit(0);
        }
    }
}
