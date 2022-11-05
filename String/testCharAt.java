//import java.util.*;

public class testCharAt {
    public static void main(String[] args) {

        String a = "Nanthawat";
        System.out.println(a); // แสดงค่าที่อยู่ใน ตัวแปร a
        String b = a.toLowerCase(); // toLowerCase ทำให้ค่าใน a เป้นตัวพิมเล็กทั้งหมด และ เก็บค่าใน b

        System.out.print(" >> ");

        // แสดงค่า ที่เก้บไว้ใน ตัวแปร b
        for (int i = 0; i < a.length(); i++) {

            System.out.print(" " + b.charAt(i)); // charAt(); แสดงค่าจาก b

        }

    }
}
