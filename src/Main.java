public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[getRandomNumber(1, 100)];

        for (Shape shape : shapes){
            shape = getRandomShape();
            shape.drawTheShape();
        }

    }

    private static int getRandomNumber(int min, int max){
        return (min + (int)(Math.random() * ((max - min) + 1)));
    }

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
