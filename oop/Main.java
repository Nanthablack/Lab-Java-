public class Main {
    public static void main(String[] args) {

        BoxV1 Abox = new BoxV1();

        Abox.d = 10.0;
        Abox.w = 5.0;
        Abox.h = 7.0;

        System.out.println(Abox.volume());
        System.out.println(Abox.surfaceArea());

        // ...................................................//
        System.out.println();

        BoxV2 Bbox = new BoxV2();

        Bbox.setD(11.0);
        Bbox.setW(6.0);
        Bbox.setH(8.0);

        System.out.println(Bbox.volume());
        System.out.println(Bbox.surfaceArea());
        // ....................................................//
        System.out.println();

        BoxV3 cBox = new BoxV3(10, 10, 6); //constructor method

        System.out.println(cBox.volume());
        System.out.println(cBox.surfaceArea());

        // ....................................................//

        BoxV3 dBox = new BoxV3();

    }
}