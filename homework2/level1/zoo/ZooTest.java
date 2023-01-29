package homework.homework2.level1.zoo;

public class ZooTest {
    public static void main(String[] args) {
        //Level 1
        //Task 2

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        Lamb lamb = new Lamb();
        cat.eat("meat");
        cat.eat("vegetables");
        dog.eat("meat");
        dog.eat("vegetables");
        cow.eat("meat");
        cow.eat("vegetables");
        lamb.eat("meat");
        lamb.eat("vegetables");

        //Task 3
        // class Mother {}
        // class Father extends Mother {}
        // class Child extends Father {}
        // не разрешено множественное наследование в Java

        //Task 4
        //class Person extends Object{}
        //Or
        //class Person{}

        //Task 5
        //убрать abstract в методе accelerate();

    }
}
