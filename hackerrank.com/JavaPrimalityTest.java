/*A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .

Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.*/

import java.io.*;
import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        try {
            BigInteger bigInteger = new BigInteger(n);
            boolean isProbablePrime = bigInteger.isProbablePrime(0);
            if (isProbablePrime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }catch (NumberFormatException e){
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
