import java.util.*;

public class linklist {
    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();

        name.add("jojo");
        name.add("jeje");
        System.out.println(name);

        name.addFirst("Nanthawat");
        name.addLast("Mingjindakul");
        System.out.println(name);

        name.add(2, "Pikul");
        System.out.println(name);

        name.remove(3);
        System.out.println(name);

        name.removeFirst();
        name.removeLast();
        System.out.println(name);

        name.remove("jojo");
        System.out.println(name);

    }
}
