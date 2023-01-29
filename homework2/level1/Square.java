package homework.homework2.level1;

public class Square extends Shape {
    int width;

    public Square(int size, String color, int width) {
        super(size, color);
        this.width = width;
    }

    public Square() {
    }

    @Override
    public void draw() {
        System.out.println("Draw a square");
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void calculateArea() {
        System.out.println(width * width);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(4 * width);
    }
}
