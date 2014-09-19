public abstract class ShapeAbstrImpl implements Shape {

    private String shapeName;
    private String shapeColor;

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double getShapeSquare(){
        return 0;
    }
}
