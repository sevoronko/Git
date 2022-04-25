/*We define the following:

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing each respective element, , in array .*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaSubarray {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        in.nextLine();

        String s = in.nextLine();

        in.close();

        String[] arrRowTempItems = s.split(" ");

        List<Integer> arrRowItems = new ArrayList<>();

        for (int i = 0; i < num; i++) {

            int arrItem = Integer.parseInt(arrRowTempItems[i]);

            arrRowItems.add(arrItem);

        }

        int ammount = 0;

        for (int i = 0; i < num; i++) {

            int sum = 0;

            sum = sum + arrRowItems.get(i);

            if (sum < 0) {
                ammount++;
            }

            for (int j = i + 1; j < num; j++) {
                sum = sum + arrRowItems.get(j);

                if (sum < 0) {
                    ammount++;
                }
            }
        }

        System.out.println(ammount);
    }
}
