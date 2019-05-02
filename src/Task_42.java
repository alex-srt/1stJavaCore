import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_42 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int monthNumber = Integer.parseInt(br.readLine());
        System.out.println(monthNumber);

        System.out.print("Введіть будь-яке ціле число від 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Ви ввели число " + number);



    }

}
