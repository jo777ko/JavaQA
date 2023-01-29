package homework.homework2.level1.zoo;

public class Herbivore extends Animal {
    @Override
    public void eat(String food) {
        if ("meat".equals(food)){
            System.out.println("I don't eat a meat.");
        } else {
            System.out.println("Niami)");
        }
    }
}
