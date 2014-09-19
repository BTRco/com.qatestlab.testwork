public class Square extends ShapeAbstrImpl {

    private double squareSideSize;

    public Square(String squareColor, int squareSideSize) {
        this.squareSideSize = squareSideSize;
        super.setShapeName("Square");
        super.setShapeColor(squareColor);
    }

    @Override
    public void drawTheShape() {
        System.out.println("Shape: " + super.getShapeName() + ", square: " + getShapeSquare() + ", diagonal: " + getDiagonalSize() + ", color: " + super.getShapeColor());
    }

    @Override
    public double getShapeSquare() {
        return squareSideSize*squareSideSize;
    }

    public double getDiagonalSize(){
        return Math.sqrt(2) * squareSideSize;
    }
}
