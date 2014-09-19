public class Circle  extends ShapeAbstrImpl{

    private double diameter;

    public Circle(String shapeColor, int diameter) {
        this.diameter = diameter;
        super.setShapeName("Circle");
        super.setShapeColor(shapeColor);
    }

    @Override
    public void drawTheShape() {
        System.out.println("Shape: " + super.getShapeName() + ", square: " + getShapeSquare() + ", radius: " + getRadius() + ", color: " + super.getShapeColor());
    }

    @Override
    public double getShapeSquare() {
        return (getRadius() * getRadius()) * 3.14;
    }

    public double getRadius(){
        return diameter/2;
    }
}
