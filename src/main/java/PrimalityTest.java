import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

public class PrimalityTest{


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String n = scanner.nextLine();
        scanner.close();

        BigInteger A = new BigInteger(n);

        if (A.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
