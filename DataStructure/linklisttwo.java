import java.util.LinkedList;

public class linklisttwo {
    public static void main(String[] args) {

        LinkedList student = new LinkedList<>();

        student.offer(1);
        student.add(true);
        student.add(10.5);
        student.add("Nanthawat");

        System.out.println(student);

        student.remove(2);
        System.out.println(student);

    }
}
