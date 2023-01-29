package homework.homework2.level1.zoo;

public class Predator extends Animal {

    @Override
    public void eat(String food) {
        if ("meat".equals(food)){
            System.out.println("Niami)");
        } else {
            System.out.println("I need a meat.");
        }
    }
}
