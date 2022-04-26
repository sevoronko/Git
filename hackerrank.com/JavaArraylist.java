/*Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in*/

import java.io.*;
import java.util.*;

public class JavaArraylist {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        in.nextLine();

        List<List<Integer>> arrRow = new ArrayList<>();

        for (int i = 0; i < num; i++) {

            String s = in.nextLine();

            String[] arrRowTempItems = s.split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < arrRowTempItems.length; j++) {

                int arrItem = Integer.parseInt(arrRowTempItems[j]);

                arrRowItems.add(arrItem);
            }

            arrRow.add(arrRowItems);

        }

        int numQwery = in.nextInt();

        in.nextLine();

        List<List<Integer>> arrRowQwery = new ArrayList<>();

        for (int i = 0; i < numQwery; i++) {

            String s = in.nextLine();

            String[] arrRowTempItemsQwery = s.split(" ");

            List<Integer> arrRowItemsQwery = new ArrayList<>();

            for (int j = 0; j < arrRowTempItemsQwery.length; j++) {

                int arrItem = Integer.parseInt(arrRowTempItemsQwery[j]);

                arrRowItemsQwery.add(arrItem);
            }

            arrRowQwery.add(arrRowItemsQwery);

        }

        in.close();

        for (List<Integer> m : arrRowQwery) {
            int a = m.get(0) - 1;
            int b = m.get(1);

            try {
                System.out.println(arrRow.get(a).get(b));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }

    }
}
