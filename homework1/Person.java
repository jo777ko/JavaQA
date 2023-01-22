package homework.homework1;

public class Person {
    private String fullName;
    private int age;

    public void move(){
        System.out.println("It's moving " + fullName);
    }

    public void talk(){
        System.out.println("It's talking " + fullName);
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
