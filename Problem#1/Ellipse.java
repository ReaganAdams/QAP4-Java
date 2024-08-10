public class Ellipse extends Shape {
    private double a; // major axis
    private double b; // minor axis

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }

    @Override
    public double computePerimeter() {
        return Math.PI * 2 * (a + b - Math.sqrt((a - b) * (a - b) / 2));
    }
}
