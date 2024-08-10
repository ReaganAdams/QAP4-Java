// EquilateralTriangle.java
public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "EquilateralTriangle";
    }

    // No need to implement scale method here; it's inherited from Triangle
}
