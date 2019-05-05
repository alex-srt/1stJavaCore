/*
Task 43 - Compact discs
*/

import java.util.Scanner;

public class Task_43 {
    public static void main(String[] args) {
        System.out.print("Enter # of discs to buy  1 - 1000: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int amount = scan.nextInt();
            System.out.println("Amount of disks you want to buy is " + amount);
            if (amount >= 100) {
                int amount100 = amount / 100;
                int amountRemainder100 = amount % 100;
                if (amountRemainder100 >= 20) {
                    int amount20 = amountRemainder100 / 20;
                    int amountRemainder20 = amountRemainder100 % 20;
                    int sumCost = amount100 * 100 + amount20 * 30 + amountRemainder20 * 2;
                    System.out.println("Sum of needed money is " + sumCost + "UAH");
                } else {
                    int sumCost = amount100 * 100 + amountRemainder100 * 2;
                    System.out.println("Sum of needed money is " + sumCost + "UAH");
                }
            } else if (amount >= 20) {
                int amount20 = amount / 20;
                int amountRemainder20 = amount % 20;
                int sumCost = amount20 * 30 + amountRemainder20 * 2;
                System.out.println("Sum of needed money is " + sumCost + "UAH");
            } else {
                int sumCost = amount * 2;
                System.out.println("Sum of needed money is " + sumCost + "UAH");
            }
        } else {
            System.out.println("Sorry, couldn't understand you!");
        }
    }
}