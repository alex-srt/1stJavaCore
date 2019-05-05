/*
Task 44 - Which quarter?
*/

import java.util.Scanner;

public class Task_44 {
    public static void main(String[] args) {
        System.out.print("Enter x and y coordinates (-100) - (100): ");
        Scanner scanX = new Scanner(System.in);
        Scanner scanY = new Scanner(System.in);
        if (scanX.hasNextInt() && scanY.hasNextInt()) {
            int x = scanX.nextInt();
            int y = scanY.nextInt();
            if (x > 0 && y > 0) {
                System.out.print("The point is in co-ordinate quarter: 1");
            } else if (x > 0 && y < 0) {
                System.out.print("The point is in co-ordinate quarter: 2");
            } else if (x < 0 && y < 0) {
                System.out.print("The point is in co-ordinate quarter: 3");
            } else if (x < 0 && y > 0) {
                System.out.print("The point is in co-ordinate quarter: 4");
            } else if (x == 0 || y == 0) {
                System.out.print("Not possible to define a quarter");
            }
        } else {
            System.out.println("Sorry, couldn't understand you!");
        }
    }

}
