import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int word = A.length();
        int word2 = B.length();
        System.out.println(word + word2);

        Character temp = A.charAt(0);
        Character temp1 = B.charAt(0);
        if (temp.compareTo(temp1) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1, A.length()) + " "
                + B.substring(0, 1).toUpperCase() + B.substring(1, B.length()));
    }
}