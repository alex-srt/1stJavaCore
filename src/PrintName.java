import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintName {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        String i = br.readLine();
        System.out.println(i + "s");
    }

}