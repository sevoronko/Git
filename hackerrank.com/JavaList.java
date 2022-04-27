/*For this problem, we have  types of queries you can perform on a List:

Insert  at index :

Insert
x y
Delete the element at index :

Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .*/

import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        in.nextLine();

        String s = in.nextLine();

        String[] arrRowTempItems = s.split(" ");

        List<Integer> arrRow = new ArrayList<>();

        for (int j = 0; j < num; j++) {

            int arrItem = Integer.parseInt(arrRowTempItems[j]);

            arrRow.add(arrItem);
        }

        int queries = in.nextInt();

        in.nextLine();

        for (int i = 0; i < queries; i++) {

            String s1 = in.next();

            in.nextLine();

            if (s1.equals("Insert")) {
                int arrItem1 = 0;
                int arrItem2 = 0;

                String s2 = in.nextLine();
                String[] arrRowTempItems1 = s2.split(" ");

                for (int n = 0; n < 2; n++) {

                    arrItem1 = Integer.parseInt(arrRowTempItems1[0]);

                    arrItem2 = Integer.parseInt(arrRowTempItems1[1]);

                }
                arrRow.add(arrItem1, arrItem2);
            } else if (s1.equals("Delete")) {

                String s3 = in.nextLine();
                String[] arrRowTempItems2 = s3.split(" ");
                int arrItem3 = Integer.parseInt(arrRowTempItems2[0]);
                arrRow.remove(arrItem3);
            }

        }

        in.close();

        for (int t = 0; t < arrRow.size(); t++) {
            if (t == arrRow.size() - 1) System.out.print(arrRow.get(t) + " ");
            else System.out.print(arrRow.get(t) + " ");
        }
    }
}
