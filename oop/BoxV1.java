public class BoxV1 {
    public double w, h, d; // access modifier
    // data + method

    public double volume() {
        return w * h * d;
    }

    public double surfaceArea() {
        return 2.0 * ((w * h) + (w * d) + (h * d));
    }
}