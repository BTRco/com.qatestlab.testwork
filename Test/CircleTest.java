import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleTest {
    int initialSideSize;
    String initialColor;
    Circle initialShape = null;

    @Before
    public void initialValues(){
        initialSideSize = 10;
        initialColor = "Black";
        initialShape = new Circle(initialColor, initialSideSize);
    }

    @Test
    public void square(){

        double expectedSquare = 78.5;
        Assert.assertEquals(expectedSquare, initialShape.getShapeSquare(), 1);
    }

    @Test
    public void diagonalSize(){
        double expectedRadius = 5;
        Assert.assertEquals(expectedRadius, initialShape.getRadius(), 1);
    }
}
