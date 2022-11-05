
public class testparseDouble {
    public static void main(String[] args) {

        String val1 = "1000";
        String val2 = "156";

        // here instead of adding it will concatenate two Strings
        // but will convert the String into Float

        Double d = Double.parseDouble(val1 + val2);
        System.out.println("1. Sum type1 =\t" + d);

        Double f1 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println("2. Sum type2 =\t" + f1);

        Double f2 = Double.parseDouble(val1) * Double.parseDouble(val2);
        System.out.println("3. Multiply =\t" + f2);
        // Multiplication

        Double f3 = Double.parseDouble(val1) / Double.parseDouble(val2);
        System.out.println("4. Division =\t" + f3);

        Double f4 = Double.parseDouble(val1) % Double.parseDouble(val2);
        System.out.println("5. Reminder =\t" + f4);

    }
}
