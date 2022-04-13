/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        int length = A.length();

        for (int i = length - 1; i >= 0; i--) {
            char a = A.charAt(i);
            B = B + a;
        }

        if (B.compareTo(A) == 0) {
            System.out.println("Yes");
        } else System.out.println("No");
        
    }
}
