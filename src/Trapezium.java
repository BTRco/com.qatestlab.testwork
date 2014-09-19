public class Trapezium extends ShapeAbstrImpl{

    private double topSide;
    private double bottomSide;
    private double leftSide;
    private double rightSide;

    /**
     * Constructor that set trapezium color and side sizes.
     * @param shapeColor - color of square.
     * @param topSide - top side size of trapezium.
     * @param bottomSide - bottom side size of trapezium.
     * @param leftSide - left side size of trapezium.
     * @param rightSide - right side size of trapezium.
     */
    public Trapezium(String shapeColor, double topSide, double bottomSide, double leftSide, double rightSide) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        super.setShapeName("Trapezium");
        super.setShapeColor(shapeColor);
    }

    /**
     * Print full info about trapezium to console
     */
    @Override
    public void drawTheShape() {
        System.out.println("Shape: " + super.getShapeName() + ", square: " + getShapeSquare() + ", height: " + getHeight() + ", color: " + super.getShapeColor());
    }

    /**
     * Method for trapezium square calculate.
     * @return trapezium square as double.
     */
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

    /**
     * Method for trapezium height calculate.
     * @return trapezium height as double.
     */
    public double getHeight(){
        return getShapeSquare()/((topSide + bottomSide)/2);
    }
}
