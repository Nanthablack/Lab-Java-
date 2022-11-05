//////////////////////////////////////////////////รอ
import java.util.*;

public class testpostfix {
    public static void main(String[] args) {

        String s = "5 +(62- 2) /30 + (3+2+1)";

        String infix = s.replace(" ", "");
        System.out.println(infix);

        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        for (int i = 0; i < infix.length(); i++) {

            System.out.println(infix.charAt(i));
            char a = infix.charAt(i);
            if (a == '(' || a == ')' || a == '+' || a == '-' || a == '*' || a == '/') {
                stack1.push(infix.charAt(i));
                // System.out.println(" " + stack1);
            } else {
                stack2.push(infix.charAt(i));
                // System.out.println(" " + stack2);
            }

        }
        System.out.println("ops " + stack1);
        System.out.println("int " + stack2);
    }
}
