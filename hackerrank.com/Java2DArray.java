import java.io.*;
import java.math.*;
import java.security.*;
//You are given a  2D array. An hourglass in an array is a portion shaped like this:
//The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

//In this problem you have to print the largest sum among all the hourglasses in the array.

import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        int sumMax = -9 * 7;

        for (int i = 0; i < 4; i++) {

            List<Integer> a1 = arr.get(i);
            List<Integer> a2 = arr.get(i + 1);
            List<Integer> a3 = arr.get(i + 2);

            for (int j = 0; j < 4; j++) {

                int a11 = a1.get(j);
                int a12 = a1.get(j + 1);
                int a13 = a1.get(j + 2);

                //int a11 = a2.get(j);
                int a14 = a2.get(j + 1);
                //int a13 = a2.get(j + 2);

                int a15 = a3.get(j);
                int a16 = a3.get(j + 1);
                int a17 = a3.get(j + 2);

                int sumA = a11 + a12 + a13 + a14 + a15 + a16 + a17;

                sumMax = Math.max(sumA, sumMax);

                //System.out.println("sumA = " + sumA);
                //System.out.println("sumMax = " + sumMax);

            }
        }

        System.out.println(sumMax);
    }
}
