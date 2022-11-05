import java.util.Scanner;

public class arraytwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] a = { 1, 2, 2, 3, 3, 4, 5 };

        System.out.print("1 มิติ = ");
        System.out.println(a[4]);

        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.print("2 มิติ = ");
        System.out.println(b[1][1]);
        System.out.print(b[2][1]);

    }
}