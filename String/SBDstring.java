
////////...StringBuffer and StringBuilder... ///
public class SBDstring {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("java");
        System.out.println(str);

        str.append(" tutorial"); // append = เพิ่มคำเข้าไป
        System.out.println(str);

        str.reverse(); // reverse = กลับด้าน
        System.out.println(" */reverse >>  " + str);

        System.out.println();

        str.reverse();
        System.out.println(str);

        str.delete(1, 4); // delete = ลบบางส่วนในคำออกไป
        System.out.println(str);

        str.delete(0, 2);
        System.out.println(str);

        System.out.println();

        str.insert(0, "c++ "); // insert = เติมคำเข้าไป
        System.out.println(str);

        str.replace(0, 3, "AugularJS"); // replace = แทนที่คำในประโยค
        System.out.println(str);

        System.out.println();

        str.insert(10, "java ");
        System.out.println(str);

    }
}
