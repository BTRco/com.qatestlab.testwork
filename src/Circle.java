public class Circle  extends ShapeAbstrImpl{

    private double diameter;

    /**
     * Constructor that set circle color and diameter
     * @param shapeColor - color of circle.
     * @param diameter - diameter of circle.
     */

    public Circle(String shapeColor, int diameter) {
        this.diameter = diameter;
        super.setShapeName("Circle");
        super.setShapeColor(shapeColor);
    }

    /**
     * Print full info about circle to console
     */

    @Override
    public void drawTheShape() {
        System.out.println("Shape: " + super.getShapeName() + ", square: " + getShapeSquare() + ", radius: " + getRadius() + ", color: " + super.getShapeColor());
    }

    /**
     * Method for circle square calculate.
     * @return circle square as double.
     */

    @Override
    public double getShapeSquare() {
        return (getRadius() * getRadius()) * 3.14;
    }

    /**
     * Method for circle radius calculate.
     * @return circle radius as double.
     */

    public double getRadius(){
        return diameter/2;
    }
}
