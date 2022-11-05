import java.util.*;

public class parseDouble {
    public static void main(String[] args) {

        String infix = "5 +(62- 2) /30 + (3+2+1)";
        String s = infix.replace(" ", "");
        char[] fix = s.toCharArray();

        System.out.println("/V " + s);

        System.out.println("/V " + fix.length);
        System.out.println();

        Deque<Double> values = new LinkedList<Double>();
        Stack<Character> token = new Stack<Character>();

        LinkedList name = new LinkedList<>();
        LinkedList bracket = new LinkedList<>();

        for (int i = 0; i < fix.length; i++) {

            if (fix[i] >= '0' && fix[i] <= '9') {

                StringBuffer sbuf = new StringBuffer();

                while (i < fix.length && fix[i] >= '0' && fix[i] <= '9')
                    sbuf.append(fix[i++]);
                name.add(Double.parseDouble(sbuf.toString()));
                values.add(Double.parseDouble(sbuf.toString()));
                i--;

            } else if (fix[i] == '(' || fix[i] == ')') {
                name.add(fix[i]);
                bracket.add(fix[i]);
            } else {
                name.add(fix[i]);
                token.push(fix[i]);

            }
        }
        System.out.println("/V " + bracket);
        System.out.println("/V " + token);
        System.out.println("/V " + values);
        System.out.println("/V " + name);

    }
}
