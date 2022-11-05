//import java.util.*;

class SubString {
    public static void main(String[] args) {

        String string1 = "Learning Java";
        String n = "ning";

        // ........................ทดลอง substring();.................//
        String str1 = string1.substring(0); // the whole string
        String str2 = string1.substring(9); // string: “Java”
        String str3 = string1.substring(0, 8); // string: “Learning”
        String str4 = string1.substring(4, 8);

        // .........................ทดลอง indexOf() ..................//
        int str5 = string1.indexOf(n);
        int str6 = string1.indexOf("a", 0);
        int str7 = string1.indexOf("a", string1.indexOf("a", 0) + 1);
        int str8 = string1.indexOf("a", string1.indexOf("a", string1.indexOf("a", 0) + 1) + 1);
        int str9 = string1.indexOf("a", string1.indexOf("a", string1.indexOf("a", str6 + 1) + 1) + 1);

        // ............................ output substring(); ........................//
        System.out.println("str1 > " + str1);
        System.out.println("str2 > " + str2);
        System.out.println("str3 > " + str3);
        System.out.println("str4 > " + str4);

        // ............................. output indexOf(); ........................//
        System.out.println("index > " + str5);
        System.out.println("index > " + str6);
        System.out.println("index > " + str7);
        System.out.println("index > " + str8);
        System.out.println("index > " + str9);

    }
}