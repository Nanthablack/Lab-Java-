import java.util.*;

public class Midterm {

    public static double process(String infix) {
        char[] fix = infix.toCharArray();

        Deque<Double> values = new LinkedList<Double>();

        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < fix.length; i++) {

            if (fix[i] == ' ')
                continue;

            if (fix[i] >= '0' && fix[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();

                while (i < fix.length && fix[i] >= '0' && fix[i] <= '9')
                    sbuf.append(fix[i++]);
                values.add(Double.parseDouble(sbuf.toString()));

                i--;
            }

            else if (fix[i] == '(')
                ops.push(fix[i]);

            else if (fix[i] == ')') {
                while (ops.peek() != '(')
                    values.add(applyOp(ops.pop(), values.removeLast(), values.removeLast()));
                ops.pop();
            }

            else if (fix[i] == '+' || fix[i] == '-' || fix[i] == '*' || fix[i] == '/') {
                while (!ops.empty() && precedence(fix[i], ops.peek()))
                    values.add(applyOp(ops.pop(), values.removeLast(), values.removeLast()));

                ops.push(fix[i]);
            }
        }

        while (!ops.empty())
            values.add(applyOp(ops.pop(), values.removeLast(), values.removeLast()));

        return values.remove();
    }

    public static boolean precedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static double applyOp(char op, double a, double b) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }

    // Input here!!!
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String Infix = myObj.nextLine();
        System.out.println(Midterm.process(Infix));
    }
}