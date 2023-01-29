package homework.homework2.level1;

public class Triangle extends Shape {
    int firstSize;
    int secondSize;
    int thirdSize;

    public Triangle(int size, String color, int firstSize, int secondSize, int thirdSize) {
        super(size, color);
        this.firstSize = firstSize;
        this.secondSize = secondSize;
        this.thirdSize = thirdSize;
    }

    public Triangle() {
    }

    @Override
    public void draw() {
        System.out.println("Draw a triangle");
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSize=" + firstSize +
                ", secondSize=" + secondSize +
                ", thirdSize=" + thirdSize +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void calculateArea() {
        int p = (firstSize + secondSize + thirdSize)/2;
        System.out.println(Math.sqrt(p*(p - firstSize) * (p - secondSize) * (p - thirdSize)));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(firstSize + secondSize + thirdSize);
    }
}