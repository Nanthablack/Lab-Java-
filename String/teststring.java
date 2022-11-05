//import java.util.*;

public class teststring {
    public static void main(String[] args) {

        String str = "javakaraoke ja va ka ra";

        // ...........................output......................................//

        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("a", ""));
        System.out.println(str.replace("a", "").replace("k", ""));
        System.out.println(str.replace("a", "").replace("k", "").replace(" ", ""));

        System.out.println();

        String z = str.replace("a", "").replace("k", "").replace(" ", "");
        System.out.println(z.replace("j", ""));

    }

}
