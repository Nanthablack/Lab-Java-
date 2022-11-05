
////////...StringBuffer and StringBuilder... ///

public class SBFstring {
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Nanthawat");
        System.out.println(sbf);

        sbf.append(" Mingjindakul");
        System.out.println(sbf);

        sbf.replace(0, 9, "Navapon");
        System.out.println(sbf);

        sbf.delete(7, 12);
        System.out.println(sbf);

    }
}
