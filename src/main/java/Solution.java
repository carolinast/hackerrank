import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();
        String word;

        for (int i = 0; i < number; i++) {
            word = scan.next();
            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}