package homework.homework2.level1;

import homework.homework2.level2.ShapeGenerator;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color = "Green";
        circle.radius = 2;
        circle.setSize(3);

        Triangle triangle = new Triangle();
        triangle.color = "Red";
        triangle.firstSize = 4;
        triangle.secondSize = 3;
        triangle.thirdSize = 5;
        triangle.setSize(5);

        Square square = new Square();
        square.color = "Yellow";
        square.width = 10;
        square.setSize(7);

        Circle simpleCircle = new Circle("Green", 2, 3);
        Triangle simpleTriangle = new Triangle(5, "Red", 4, 3, 5 );
        Square simpleSquare = new Square(7, "Yellow", 4);

       System.out.println(circle);
       System.out.println(triangle);
       System.out.println(square);

       System.out.println(simpleCircle);
       System.out.println(simpleTriangle);
       System.out.println(simpleSquare);

        //Level 1
        //Task 1

        circle.calculateArea();
        circle.calculatePerimeter();
        triangle.calculateArea();
        triangle.calculatePerimeter();
        square.calculateArea();
        square.calculatePerimeter();




    }
}
