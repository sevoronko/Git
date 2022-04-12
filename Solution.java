/*Two strings, A and B, are called anagrams if they contain all the same characters in the same frequencies. 
For this challenge, the test is not case-sensitive. 
For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.*/

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        boolean anagrams = true;
        int lenghtA = a.length();
        int lenghtB = b.length();

        if (lenghtA == lenghtB) {

            for (int i = lenghtA - 1; i >= 0; i--) {
                char someChar = a.charAt(i);

                int countA = 0;
                int countB = 0;

                for (int j = lenghtA - 1; j >= 0; j--) {
                    char someCharA = a.charAt(j);
                    if (someChar == someCharA) {
                        countA++;
                    }
                    char someCharB = b.charAt(j);
                    if (someChar == someCharB) {
                        countB++;
                    }
                }
                
                if (countA == countB) {
                    continue;
                } else {
                    anagrams = false;
                    break;
                }
            }
        } else anagrams = false;

        return anagrams;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
