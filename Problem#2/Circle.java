// Circle.java
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    // New method to scale the radius by the given factor
    @Override
    public void scale(double factor) {
        this.radius *= factor;
    }
}
