import java.util.*;

public class stack {
    public static void main(String[] args) {

        // หลักการของ stack คือ
        // เข้าก่อน-ออกหลัง หรือ เข้าหลัง-ออกก่อน
        Stack<Integer> stack = new Stack<>();

        // stack.push(); ใส่สมาชิก ลงไปใน stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println();

        System.out.println(" " + stack);
        System.out.println(" ค่าบนสุด = " + stack.peek()); // stack.peek() คือการดูตัวบนสุด
        System.out.println();

        System.out.println(" stack.pop(); 1 ครั้ง  เพื่อดูค่าตัวบน ");
        System.out.println(" แล้วใช้ function stack.peek() ");

        stack.pop(); // stack.pop(); เอาตัวบนสุดออก

        System.out.println(" ได้ค่าเป็น = " + stack.peek());
        System.out.println();
        System.out.println(" ค่าในstack ว่างเปล่า = " + stack.empty()); // เช็คจำนวนสมาชิกใน stack ว่ามีหรือไม่มี
        // แสดงค่าเป้น boolean < true/false >
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println();
        System.out.println(" stack.pop();  จำนวน 4 ครั้ง ");
        System.out.println(" ค่าในstack ว่างเปล่า = " + stack.empty());
        System.out.println();

    }
}
