import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int l = s.length();
        for (int i = 0; i <= (l - k); i++) {

            String sub = s.substring(i, i + k);

            int compareSmallest = sub.compareTo(smallest);

            if (compareSmallest < 0) {
                //sub is smaller
                smallest = sub;
            }

            int n = smallest.length();
            if (n == 0) {
                smallest = sub;
            }

            int compareLarges = sub.compareTo(largest);

            if (compareLarges > 0) {
                //sub is smaller
                largest = sub;
            }

        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
