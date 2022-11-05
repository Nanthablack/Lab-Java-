import java.util.*;

public class testSplit {
    public static void main(String[] args) {

        String s = "nan0tha0wat0ming0jin0da0kul";
        String[] word = s.split("0");

        System.out.println(Arrays.toString(word));
        System.out.println(word.length);
        System.out.println(word[1]);
        System.out.println(word[3]);
        System.out.println(word[5]);

        for (int i = 0; i < word.length; i++) {

            System.out.print(word[i]);

        }

        System.out.println();

        for (int i = word.length - 1; i >= 0; i--) {

            System.out.print(word[i]);

        }
    }

}