import java.util.*;

public class reverseString {
    public static void main(String[] args) {

        String s = "Nanthawat mingjindakul";
        System.out.println(reverse(s));

    }

    public static String reverse(String s) {

        System.out.println(s);
        Stack<Character> Ad = new Stack<>(); // ประการค่าชนิดตัวแปร Ad เป็น Stack<Character>

        for (int i = 0; i < s.length(); i++) {

            Ad.push(s.charAt(i)); // Ad.push(); เก็บข้อมูลใน Ad (รูปแบบ stack)
                                  // s.charAt(i) นำ string s แปลงเป็น char ตามลำดับ เพื่อไปเป็นข้อมูล
                                  // ที่จะถูกเก่งใน Ad (stack)

            System.out.println(Ad); // แสดงค่าการ push ในแต่ละรอบ
                                    // [N, a, n, t, h, a, w, a, t]

        }

        StringBuilder Da = new StringBuilder(); // ประการค่าชนิดตัวแปร Da เป็น StringBuilder

        while (!Ad.empty()) { // Ad.empty() แสดงค่าแบบ boolean
                              // ถ้ามีสมาชิก จะแสดงค่า false
                              // แต่ถ้าไม่มีสมาชิกจะแสดงค่า true

            System.out.println(Ad.peek() + "   " + !Ad.empty()); // แสดงตัวบนสุด และ แสดงค่าของ { !Ad.empty() }

            Da.append(Ad.pop()); // Ad.pop() นำตัวที่อยู่บนสุดออก แล้วเก็บค่าไว้ในตัวแปร Da ด้วย append {
                                 // Da.append(Ad.pop()); }

        }
        return Da.toString(); // return ค่า Da ในรูป String
    }
}