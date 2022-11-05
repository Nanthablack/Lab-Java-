import java.util.Stack;

public class stacktwo {
    public static void main(String[] args) {

        System.out.println("...................< peek >................");
        demo();

    }

    public static void demo() {

        Stack<String> fruit = new Stack<>();

        fruit.push("mango");
        fruit.push("coconut");
        fruit.push("banana");
        fruit.push("apple");
        fruit.push("kiwi");
        fruit.push("orange");

        System.out.println(fruit);
        System.out.println("peek >>  " + fruit.peek());

        System.out.println("...................< pop >..................");

        System.out.println(fruit);
        System.out.println("pop >>  " + fruit.pop());

        System.out.println();
        System.out.println(fruit);
        System.out.println();

        System.out.println(" kiwi   > " + fruit.search("kiwi"));
        System.out.println(" banana > " + fruit.search("banana"));
        System.out.println(" apple  > " + fruit.search("apple"));

        System.out.println();

        // method >> contain จะเช็คว่ามีข้อมูลอยู่ใน stack หรือป่าว
        // ถ้ามี จะแสดง true ถ้าไม่มีจะแสดงว่า false
        // V
        System.out.println(" " + fruit.contains("coconut"));
        System.out.println(" " + fruit.contains("watermelon"));

        // System.out.println();

        System.out.println("..................< popping >.................");

        int i = 1;
        while (!fruit.empty()) {

            System.out.println(" "+i+"  " + fruit.pop());
            i++;

        }
        System.out.println();
    }
}
