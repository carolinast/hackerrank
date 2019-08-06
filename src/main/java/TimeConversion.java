import java.io.*;

import java.util.*;


public class TimeConversion{

    static String timeConversion(String s) {

        StringBuilder convertedTime = new StringBuilder();
        char[] times = s.toCharArray();

        if (s.contains("PM") && !s.substring(0, 2).equals("12")) {
            times[0] += 1;
            times[1] += 2;
            s = String.valueOf(convertedTime.append(times).delete(8, 10));
        }
        if (s.contains("AM") && s.substring(0, 2).equals("12")) {
            times[0] = '0';
            times[1] = '0';
            s = String.valueOf(convertedTime.append(times).delete(8, 10));
        }
        else {
            s = s.substring(0, 8);
        }
        return s;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}


