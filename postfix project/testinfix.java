import java.util.*;

public class testinfix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String infix = s.replace(" ", "");
        System.out.println(infix);

        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        for (int i = 0; i < infix.length(); i++) {

            System.out.print(infix.charAt(i) + " ");
            stack1.push(infix.charAt(i));
            char a = infix.charAt(i);
            System.out.println(" " + stack1);

        }
    }
}
