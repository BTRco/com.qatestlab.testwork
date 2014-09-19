public class Triangle extends ShapeAbstrImpl {

    private double cathetusOne;
    private double cathetusTwo;


    /**
     * Constructor that set triangle color and catethus sizes.
     * @param shapeColor - color of triangle
     * @param cathetusOne - size of first catethus
     * @param cathetusTwo - size of second catethus
     */
    public Triangle(String shapeColor, int cathetusOne, int cathetusTwo) {
        this.cathetusOne = cathetusOne;
        this.cathetusTwo = cathetusTwo;
        super.setShapeName("Triangle");
        super.setShapeColor(shapeColor);
    }

    /**
     * Print full info about triangle to console
     */
    @Override
    public void drawTheShape() {
        System.out.println("Shape: " + super.getShapeName() + ", square: " + getShapeSquare() + ", hypotenuse: " + getHypotenuse() + ", color: " + super.getShapeColor());
    }

    /**
     * Method for triangle square calculate.
     * @return triangle square as double.
     */
    @Override
    public double getShapeSquare() {
        double halfOfPerimeter = (cathetusOne + cathetusTwo + getHypotenuse())/2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - cathetusOne) * (halfOfPerimeter - cathetusTwo) * (halfOfPerimeter - getHypotenuse()));
    }

    /**
     * Method for triangle hypotenuse calculate.
     * @return triangle hypotenuse as double.
     */
    public double getHypotenuse(){
        return Math.sqrt(cathetusOne * cathetusOne + cathetusTwo * cathetusTwo);
    }
}
