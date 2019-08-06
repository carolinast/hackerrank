import java.io.*;
import java.util.*;

public class BirthdayCakeCandles{

    static int birthdayCakeCandles(int[] ar) {

        int counter = 0;
        int maxCandleHight = ar[0];

        for (int temp : ar) {
            if (temp > maxCandleHight) {
                maxCandleHight = temp;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == maxCandleHight) {
                counter++;
            }
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

