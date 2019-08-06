import java.io.*;
import java.util.*;

public class CamelCase{

    static int camelcase(String s) {

        int counter = 1;
        char[] letters = s.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            String singleLetter = Character.toString(s.charAt(i));
            if (singleLetter.equals(singleLetter.toUpperCase())) {
                counter++;
            }
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

