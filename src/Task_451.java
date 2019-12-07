/*
 * 5.	https://www.e-olymp.com/en/problems/903
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Task_451 {
    public static void main(String[] args) {
        System.out.println("Enter Three digit number:");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            System.out.println(number);
//            String text = String.join(",", String.valueOf(number).split(""));
//            System.out.println("Entered numbers: " + text );

            String temp = Integer.toString(number);
            System.out.println(temp.length());

            int[] numArr = new int[temp.length()];
            String[] strArr;
            strArr = temp.split("(?!^)");
//          System.out.println(Arrays.toString(strArr));
            for (int i = 0; i < temp.length(); i++) {
                /*numArr[i] = temp.charAt(i) - '0';
                 * terrible code. It's slightly arcane, only works with ASCII and is much harder to parse mentally.
                 * Much better to use Integer.parseInt()*/
                numArr[i] = Integer.parseInt(strArr[i]);
            }
            System.out.println("Array: ");
            System.out.println(Arrays.toString(numArr));
            if (numArr[0] > numArr[2]) {
                System.out.println(numArr[0] + " 1st biggest");
            } else if (numArr[0] < numArr[2]) {
                System.out.println(numArr[2] + " last biggest");
            } else if (numArr[0] == numArr[2]) {
                System.out.println("Both equality =");
            }

        } else {
            System.out.println("Not integer number entered!");
        }
    }

}
