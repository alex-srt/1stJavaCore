import java.util.Scanner;

public class Task_42 {
    public static void main(String[] args)  {
        System.out.print("Enter month number 1 - 12: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int myMonth = scan.nextInt();
            System.out.println("Month # is " + myMonth);

            if(myMonth >= 3 && myMonth <= 5 ) {
                System.out.println("The season is Spring");
            } else if (myMonth  >= 6 && myMonth <= 8 ) {
                System.out.println("The season is Summer");
            } else if (myMonth >= 9 && myMonth <= 11 ){
                System.out.println("The season is Autumn");
            } else if (myMonth == 12 || myMonth == 1 || myMonth == 2) {
                System.out.println("The season is Winter");
            } else if (myMonth < 1 || myMonth > 12 ){
                System.out.println("Entered number is out of range");
            }
            scan.close();
        } else {
            System.out.println("Sorry, couldn't understand you!");
        }
    }
}
