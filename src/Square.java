public class Square extends ShapeAbstrImpl {

    private double squareSideSize;

    /**
     * Constructor that set square color and side size.
     * @param squareColor - color of square.
     * @param squareSideSize - side size of square.
     */
    public Square(String squareColor, int squareSideSize) {
        this.squareSideSize = squareSideSize;
        super.setShapeName("Square");
        super.setShapeColor(squareColor);
    }

    /**
     * Print full info about square to console
     */
    @Override
    public void drawTheShape() {
        System.out.println("Shape: " + super.getShapeName() + ", square: " + getShapeSquare() + ", diagonal: " + getDiagonalSize() + ", color: " + super.getShapeColor());
    }

    /**
     * Method for square square calculate.
     * @return square square as double.
     */
    @Override
    public double getShapeSquare() {
        return squareSideSize*squareSideSize;
    }

    /**
     * Method for square diagonal calculate.
     * @return square diagonal as double.
     */
    public double getDiagonalSize(){
        return Math.sqrt(2) * squareSideSize;
    }
}
