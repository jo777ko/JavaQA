package telran.hw1;

public class HomeWork1 {

    public static void main(String[] args) {
        System.out.println("Level 1");
        Person person = new Person();
        person.setName("Queen");
        person.setFullName("Kathy");
        person.setAge(20);

        person.talk();
        person.move();

        Person person1 = new Person("Cage", "Johny", 23);
        person1.move();
        person1.talk();

        System.out.println("Level 2");
        Phone phone1 = new Phone(123, "Xiaomi", 162);
        Phone phone2 = new Phone(456, "OnePlus", 191);
        Phone phone3 = new Phone(789, "Asus", 146);

        System.out.println("Model = " + phone1.getModel());
        System.out.println("Number = " + phone1.getNumber());
        System.out.println("Wight = " + phone1.getWeight());
        phone1.receiveCall("Bro");

        System.out.println("Model = " + phone2.getModel());
        System.out.println("Number = " + phone2.getNumber());
        System.out.println("Wight = " + phone2.getWeight());
        phone1.receiveCall("Bro");

        System.out.println("Model = " + phone3.getModel());
        System.out.println("Number = " + phone3.getNumber());
        System.out.println("Wight = " + phone3.getWeight());
        phone1.receiveCall("Bro");

    }
}
