package solid;

public class Square implements Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
    public void testShape(Shape shape) {
        System.out.println("Area: " + shape.getArea());

    }

}


