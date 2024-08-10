// Demo.java
public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        
        shapes[0] = new Circle(5.0);
        shapes[1] = new Ellipse(6.0, 4.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle(5.0);

        System.out.println("Shapes before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // New: Scale the shapes using the scaleShapes method
        scaleShapes(shapes, 2.0);

        System.out.println("\nShapes after scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    // New: Method to scale an array of Scalable objects
    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}
