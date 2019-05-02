import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_41 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int grade = Integer.parseInt(br.readLine());
        if(grade >= 1 && grade <= 3 ) {
            System.out.println("The pupil's level is Initial");
        } else if (grade >= 4 && grade <= 6 ) {
            System.out.println("The pupil's level is Average");
        } else if (grade >= 7 && grade <= 9 ){
            System.out.println("The pupil's level is Sufficient");
        } else if (grade >= 10 && grade <= 12 ) {
            System.out.println("The pupil's level is High");
        }
        }
    }

