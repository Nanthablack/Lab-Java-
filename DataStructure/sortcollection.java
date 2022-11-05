import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class sortcollection {
    public static void main(String[] args) {
        ArrayList<Integer> Number = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int s = scan.nextInt();

            Number.add(s);
        }

        Collections.sort(Number); // Sort myNumbers

        for (int i : Number) {
            System.out.print(" " + i);
        }
    }
}
