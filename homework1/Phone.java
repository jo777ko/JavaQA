package homework.homework1;

public class Phone {
     private int number;
     private String model;
     private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String nameOfCaller){
        System.out.println("It's " + nameOfCaller + " calling.");
    }

    public int getNumber() {
        return number;
    }
}
