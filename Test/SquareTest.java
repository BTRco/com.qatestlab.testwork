import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {
    int initialSideSize;
    String initialColor;
    Square initialShape = null;

    @Before
    public void initialValues(){
        initialSideSize = 5;
        initialColor = "Black";
        initialShape = new Square(initialColor, initialSideSize);
    }

    @Test
    public void square(){

        double expectedSquare = 25;
        Assert.assertEquals(expectedSquare, initialShape.getShapeSquare(), 5);
    }

    @Test
    public void diagonalSize(){
        double expectedDiagonal = 7.07106781187;
        Assert.assertEquals(expectedDiagonal, initialShape.getDiagonalSize(), 5);
    }
}
