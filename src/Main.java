public class Main {

    public static void main(String[] args) {

        /**
         * Creating an array of Shapes with random number of cells;
         */
        Shape[] shapes = new Shape[getRandomNumber(1, 100)];

        /**
         * Filling an array cells with random Shapes.
         */
        for (Shape shape : shapes){
            shape = getRandomShape();
            shape.drawTheShape();
        }

    }


    /**
     * Method to receive a random number with range from min to max.
     * @param min - minimum value of range.
     * @param max - maximum value of range.
     * @return random number from range as integer.
     */
    private static int getRandomNumber(int min, int max){
        return (min + (int)(Math.random() * ((max - min) + 1)));
    }

    /**
     * Method to receive a random shape by obtaining the random number from 1 to 4, and selecting the appropriate option:
     * 1: Square;
     * 2: Triangle;
     * 3: Circle;
     * 4: Trapezium;
     * @return created random shape as Shape.
     */
    private static Shape getRandomShape(){
        Shape randomShape = null;

        switch (getRandomNumber(1, 4)){
            case 1:
                randomShape = new Square(getRandomColor(), getRandomNumber(1, 100));
                break;
            case 2:
                randomShape = new Triangle(getRandomColor(), getRandomNumber(1, 100), getRandomNumber(1, 100));
                break;
            case 3:
                randomShape = new Circle(getRandomColor(), getRandomNumber(1, 100));
                break;
            case 4:
                randomShape = new Trapezium(getRandomColor(), getRandomNumber(1, 100), getRandomNumber(1, 100), getRandomNumber(1, 100), getRandomNumber(1, 100));
                break;
        }
        return randomShape;
    }

    /**
     * Method to receive a random color from 7 colors by obtaining random number from 1 to 7:
     * 1: Red;
     * 2: Orange;
     * 3: Yellow;
     * 4: Green;
     * 5: BLue;
     * 6: Dark blue;
     * 7: Violet;
     * @return obtained color as String.
     */
    private static String getRandomColor(){
        String randomColor = null;
        switch (getRandomNumber(1, 7)){
            case 1:
                randomColor = "Red";
                break;
            case 2:
                randomColor = "Orange";
                break;
            case 3:
                randomColor = "Yellow";
                break;
            case 4:
                randomColor = "Green";
                break;
            case 5:
                randomColor = "Blue";
                break;
            case 6:
                randomColor = "Dark blue";
                break;
            case 7:
                randomColor = "Violet";
                break;
        }
        return randomColor;
    }
}
