import java.util.*;

public class queue {
    // ................หลักการใช้ queue > มาก่อนออกก่อน......
    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        Queue<String> q = new LinkedList<>();

        q.add("Nan");
        q.offer("mango");
        q.offer("apple");
        q.add("coffee");
        q.offer("greentea");

        System.out.println(q);
        System.out.println(q.peek());
        q.poll();

        System.out.println(q);
        q.poll();
        System.out.println(q);
    }
}
