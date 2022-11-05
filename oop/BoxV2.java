public class BoxV2 {
    private double w, h, d; // access modifier
    // data + method

    // getter, setter
    // ........................................
    public void setW(double w) {
        if (w > 0) {
            this.w = w;
        } else {
            throw new IllegalArgumentException(" ต้องมีค่ามาก 0 ");
        }
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setD(double d) {
        this.d = d;
    }
    // ........................................

    public double volume() {
        return w * h * d;
    }

    public double surfaceArea() {
        return 2.0 * ((w * h) + (w * d) + (h * d));
    }

}