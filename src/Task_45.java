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

//import org.apache.commons.lang.ArrayUtils;


public class Task_45 {
    public static void main(String[] args) {
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Integer:" + num);*/
/*        final Scanner s = new Scanner(System.in);
        final String txt = s.nextLine().trim();
        final char[] array = txt.toCharArray();

        float[] numEl = new float[strEl.length];
        for (int i = 0; i < strEl.length; i++) {
            if (numEl[i] == (float) numEl[i] || numEl[i] == (int) numEl[i]) {
                numEl[i] = Math.abs(Float.parseFloat(strEl[i]));
            }
        }*/

        double[] array = {11,22,34.44, 0.55, 44.5555454, 23434.345, -12342342.234, 33.454 };


        System.out.println("array = " + (Arrays.toString(array)) );
        double max = array[0];
        for (double i  : array) {
            max = Math.max(max, i);
        }
/*        for (int i = 0; i < numEl.length; i++) {
            max = Math.max(max, numEl[i]);
        }*/
        System.out.println(max);
    }

//        int max = Arrays.stream(array).min().getAsInt();





/*
        int sum = 0;
        for (final char c : array)
            if (Character.isDigit(c))


                System.out.println("array element is " + c);
//                sum = sum + Character.getNumericValue(c);
        System.out.println("sum = " + sum);

*/



    }


