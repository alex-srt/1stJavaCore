/*

Task 45 - First or last?
*/


import com.sun.deploy.util.ArrayUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import org.apache.commons.lang.ArrayUtils;


public class Task_45 {
    public static void main(String[] args) {
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Integer:" + num);*/
        final Scanner s = new Scanner(System.in);
        final String txt = s.nextLine().trim();
        final char[] array = txt.toCharArray();
        System.out.println("array = " + (Arrays.toString(array)) );

        int max = Arrays.stream(array).min().getAsInt();





        int sum = 0;
        for (final char c : array)
            if (Character.isDigit(c))


                System.out.println("array element is " + c);
//                sum = sum + Character.getNumericValue(c);
        System.out.println("sum = " + sum);




    }


}
