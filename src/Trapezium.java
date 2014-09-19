public class Trapezium extends ShapeAbstrImpl{

    private double topSide;
    private double bottomSide;
    private double leftSide;
    private double rightSide;

    public Trapezium(String shapeColor, double topSide, double bottomSide, double leftSideSide, double rightSide) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.leftSide = leftSideSide;
        this.rightSide = rightSide;
        super.setShapeName("Trapezium");
        super.setShapeColor(shapeColor);
    }

    @Override
    public void drawTheShape() {
        System.out.println("Shape: " + super.getShapeName() + ", square: " + getShapeSquare() + ", height: " + getHeight() + ", color: " + super.getShapeColor());
    }

    @Override
    public double getShapeSquare() {
        double module = topSide - bottomSide;
        if(module < 0) module *= -1;
        double bigFormulaPart = (topSide + leftSide + rightSide - bottomSide) *
                                (topSide + rightSide - bottomSide - leftSide) *
                                (topSide + leftSide - bottomSide - rightSide) *
                                (bottomSide + leftSide + rightSide - topSide);
        if (bigFormulaPart < 0) bigFormulaPart *= -1;
        return ((topSide + bottomSide)/(4*(module)))*Math.sqrt(bigFormulaPart);
    }

    public double getHeight(){
        return getShapeSquare()/((topSide + bottomSide)/2);
    }
}
