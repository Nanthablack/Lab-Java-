//import java.util.*;

public class ops {
    public static void main(String[] args) {

        String infix = "5 +(62- 2) /30 + (3+2+1)";
        String s = infix.replace(" ", "");
        char[] fix = s.toCharArray();

        System.out.println("/V " + s);
        System.out.println("/V " + fix.length);
        System.out.println();

        // int count = 0;
        for (int i = 0; i < fix.length; i++) {
            if (fix[i] == '(' || fix[i] == ')') {
                System.out.print(i + " ");

            }
        }

    }
}
