import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrapeziumTest {
    int initialSideSize;
    int initialSideSize1;
    int initialSideSize2;
    int initialSideSize3;
    String initialColor;
    Trapezium initialShape = null;

    @Before
    public void initialValues(){
        initialSideSize = 5;
        initialSideSize1 = 10;
        initialSideSize2 = 4;
        initialSideSize3 = 3;
        initialColor = "Black";
        initialShape = new Trapezium(initialColor, initialSideSize, initialSideSize1, initialSideSize2, initialSideSize3);
    }

    @Test
    public void square(){

        double expectedSquare = 18.0;
        Assert.assertEquals(expectedSquare, initialShape.getShapeSquare(), 1);
    }

    @Test
    public void diagonalSize(){
        double expectedHeight = 2.4;
        Assert.assertEquals(expectedHeight, initialShape.getHeight(), 1);
    }
}
