package homework.homework2.level1;

public class Circle extends Shape {
    int radius;

    public Circle (String color, int radius, int size) {
        super(size, color);
        this.radius = radius;

    }



    public Circle (){
    }

    public void startDraw(){
        draw();
        printSize();
    }

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * radius * radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(Math.PI * radius * 2);
    }


}
