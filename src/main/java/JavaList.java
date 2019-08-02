import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert number of elements in the list.");
        int N = scanner.nextInt();
        List<Integer> L = new ArrayList<Integer>();
//        System.out.println("Type " + N + " numbers.");
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            L.add(temp);
        }
//        System.out.println("Insert number of queries.");
        int Q = scanner.nextInt();

        for (int i = 0; i < Q; i++) {
//            System.out.println("Insert query type.");
            scanner.nextLine();
            String queryType = scanner.nextLine();
            if (queryType.equals("Insert")) {
//                System.out.println("Insert index number.");
                int x = scanner.nextInt();
//                System.out.println("Insert number that should be added to the list.");
                int y = scanner.nextInt();
                L.add(x, y);
            } else if (queryType.equals("Delete")) {
//                System.out.println("Insert index of the number that should be deleted.");
                int x = scanner.nextInt();
                L.remove(x);
            }
        }
        scanner.close();

        for (int temp : L) {
            System.out.print(temp + " ");
        }
    }
}
