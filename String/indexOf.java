//import java.util.*;
//...............................หาตัวแหน่ง อักษร a โดย indexOf();..............................//
public class indexOf {
    public static void main(String[] args) {

        test("anaanthawat minajina da kula"); // a มีอยู่ 8 ตัว

    }

    public static void test(String s) {

        int i = 0;
        int count = 0;

        while (s.indexOf("a", i) >= 0) {

            System.out.println(s.indexOf("a", i));
            i = s.indexOf("a", i) + 1;
            count++;

        }

        System.out.println("index of 'a' =  " + count);

    }

}
