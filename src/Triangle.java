public class Triangle extends ShapeAbstrImpl {

    private double cathetusOne;
    private double cathetusTwo;


    public Triangle(String shapeColor, int cathetusOne, int cathetusTwo) {
        this.cathetusOne = cathetusOne;
        this.cathetusTwo = cathetusTwo;
        super.setShapeName("Triangle");
        super.setShapeColor(shapeColor);
    }

    @Override
    public void drawTheShape() {
        System.out.println("Shape: " + super.getShapeName() + ", square: " + getShapeSquare() + ", hypotenuse: " + getHypotenuse() + ", color: " + super.getShapeColor());
    }

    @Override
    public double getShapeSquare() {
        double halfOfPerimeter = (cathetusOne + cathetusTwo + getHypotenuse())/2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - cathetusOne) * (halfOfPerimeter - cathetusTwo) * (halfOfPerimeter - getHypotenuse()));
    }

    public double getHypotenuse(){
        return Math.sqrt(cathetusOne * cathetusOne + cathetusTwo * cathetusTwo);
    }
}
