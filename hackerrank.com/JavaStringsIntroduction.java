/*This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.*/
  
import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a = A.length();
        int b = B.length();
        System.out.println(a + b);

        int compare = A.compareTo(B);

        if (compare < 0) {
            //A is smaller
            System.out.println("No");
        } else if (compare > 0) {
            //A is larger
            System.out.println("Yes");
        } else {
            //A is equal to B
            System.out.println("No");
        }
        
        A = (A.substring(0, 1).toUpperCase() + A.substring(1));
        B = (B.substring(0, 1).toUpperCase() + B.substring(1));

        System.out.println(A + " " + B);
    }
}
