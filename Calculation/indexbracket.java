//import java.util.*;

public class indexbracket {
    public static void main(String[] args) {

        String s = "5 +(62- 2) /30 + (3+2+1)";
        String z = s.replace(" ", "");
        test(z);
        System.out.println(z);
    }

    public static void test(String s) {

        int i = 0;
        int count1 = 0;

        while (s.indexOf("(", i) >= 0) {

            System.out.println(s.indexOf("(", i));
            i = s.indexOf("(", i) + 1;
            count1++;

        }

        System.out.println("index of '(' =  " + count1);
        ////////////////////////////////////////////////
        System.out.println();
        ////////////////////////////////////////////////
        int j = 0;
        int count2 = 0;

        while (s.indexOf(")", j) >= 0) {

            System.out.println(s.indexOf(")", j));
            j = s.indexOf(")", j) + 1;
            count2++;

        }

        System.out.println("index of ')' =  " + count2);

    }

}
