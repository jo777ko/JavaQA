package homework.homework1;

public class HomeWork1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Loki", 25);

        Phone xiaomi = new Phone(123, "13 Pro", 180);
        Phone oneplus = new Phone(321, "7 Pro", 195);
        Phone samsung = new Phone(213, "S22", 175);

        System.out.println(xiaomi);
        System.out.println(oneplus);
        System.out.println(samsung);

        xiaomi.receiveCall("Johny");
        System.out.println(xiaomi.getNumber());
        oneplus.receiveCall("Kathy");
        System.out.println(oneplus.getNumber());
        samsung.receiveCall("Anna");
        System.out.println(samsung.getNumber());

    }

}
