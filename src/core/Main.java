package core;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to ATM");
        int atmnumber = 1337228;
        int atmpin = 1488;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ATM Number: ");
        int atmNumber = in.nextInt();
        System.out.print("Enter PIN: ");
        int PIN = in.nextInt();
        if ((atmnumber==atmNumber)&&(atmpin==PIN)){
            while (true) {
                System.out.print("1. View available balance\n2. Withdraw amount\n3. Deposit amount\n4. View ministatement\n5. Exit");
                System.out.println("Enter choice:");
                int ch = in.nextInt();
                if (ch == 1) {}
                    else if (ch == 2) {}
                    else if (ch == 3) {}
                    else if (ch == 4) {}
                    else if (ch == 5) {
                        System.out.println("Collect you ATM card\nThank you. You have chosen, or been chosen, to use to one of our finest remaining urban ATM");
                        System.exit(0);
                    }
                    else{
                         System.out.println("Please enter correct choose");
                }
            }
        }
        else {
            System.out.println("Access denied");
            System.exit(0);
        }
    }
}
