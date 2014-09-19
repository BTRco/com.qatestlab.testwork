import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
    int initialSideSize;
    String initialColor;
    Triangle initialShape = null;

    @Before
    public void initialValues(){
        initialSideSize = 5;
        initialColor = "Black";
        initialShape = new Triangle(initialColor, initialSideSize, initialSideSize);
    }

    @Test
    public void square(){

        double expectedSquare = 12.5;
        Assert.assertEquals(expectedSquare, initialShape.getShapeSquare(), 1);
    }

    @Test
    public void diagonalSize(){
        double expectedHypotenuse = 7.07106781187;
        Assert.assertEquals(expectedHypotenuse, initialShape.getHypotenuse(), 5);
    }
}
