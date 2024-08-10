// Shape.java
public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double computeArea();

    public abstract double computePerimeter();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
    
    // Implementing Scalable interface (New)
    // No need to implement scale method here since Shape is abstract
}
