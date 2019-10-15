import java.util.Scanner;

public class Task_451 {
    public static void main(String[] args) {
        System.out.println("Enter an integer number: /n");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            String text = String.join(",", String.valueOf(number).split(""));
            System.out.println("Entered numbers: " + text );
            int num = Integer.parseInt(text[0]);
            for




        } else {
            System.out.println("Not integer number entered!");
        }
    }

}
