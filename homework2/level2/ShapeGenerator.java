package homework.homework2.level2;

import homework.homework2.level1.Circle;
import homework.homework2.level1.CreditCard;
import homework.homework2.level1.Square;
import homework.homework2.level1.Triangle;

public class ShapeGenerator{
    public static void main(String[] args) {

        CreditCard card = new CreditCard(123, 258);
        card.setLimit(100);
        card.setBalance(200);
        card.setDebt(0);
        card.withdraw(258, 350);
        card.setBalance(0);
        card.setDebt(-50);
        card.deposit(258, 30);
        ShapeGenerator sg = new ShapeGenerator();
        sg.generate();


    }
    public void generate() {
        int a = (int) (Math.random() * 3);
        if (a == 0) {
            System.out.println(new Circle());
        } else if (a == 1) {
            System.out.println(new Triangle());
        } else {
            System.out.println(new Square());
        }
    }
}
