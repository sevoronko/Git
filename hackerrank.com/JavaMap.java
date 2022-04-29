/*You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.*/
import java.io.*;
import java.util.*;

public class JavaMap {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        HashMap<String, Integer> namesAndPhone = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();

            namesAndPhone.put(name, phone);

            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();

            try {
                int phone = namesAndPhone.get(s);
                System.out.println(s + "=" + phone);
            } catch (NullPointerException e) {
                System.out.println("Not found");
            }

        }
    }
}
