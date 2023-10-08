package telran.hw.hw3;

import java.util.Scanner;

public class ING extends ATM implements Converter{
    private String name;
    private int balanceATM;
    private String currency = "USD";

    Scanner sc = new Scanner(System.in);

    public ING(String name, int balanceATM, String currency) {
        this.name = name;
        this.balanceATM = balanceATM;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalanceATM() {
        return balanceATM;
    }

    @Override
    public Object deposit(CreditCard card, int money) {
        int currentBalance = card.getBalanceCard();
        System.out.println("Enter your pin: ");
        if (card.getPin() == sc.nextInt()) {
            System.out.println("Welcome in " + getName());
            System.out.println("Enter amount of money: ");
            money = sc.nextInt();
            balanceATM += convert(money);
            currentBalance = card.setBalanceCard(currentBalance + money);
            System.out.println("You balance is " + currentBalance);
            System.out.println("ATM balance is " + balanceATM);

        } else {
            System.out.println("Invalid pin");

        }
        return currentBalance;
    }

    @Override
    public Object withdraw(CreditCard card, int money) {
        int currentBalance = card.getBalanceCard();
        System.out.println("Enter your pin: ");
        if (card.getPin() == sc.nextInt()) {
            System.out.println("Welcome in " + getName());
            System.out.println("Enter amount of money: ");
            money = sc.nextInt();
            if (currentBalance - money < balanceATM){
                if (currentBalance - money < 0){
                    System.out.println("Not enough money on balance.");
                    System.out.println("The balance of your card: " + card.getNumber()+" is " + currentBalance);
                    System.out.println("ATM balance is " + balanceATM);
                } else {
                    balanceATM -= convert(money);
                    currentBalance = card.setBalanceCard(currentBalance - money);
                    System.out.println("You balance is " + currentBalance);
                    System.out.println("ATM balance is " + balanceATM);
                }
            } else {
                System.out.println("Not enough money in ATM.");
            }
        } else {
            System.out.println("Invalid pin");
        }
        return currentBalance;
    }

    @Override
    public boolean checkCurrency(CreditCard card) {
        return true;
    }

    @Override
    public double convert(int money) {
        double moneyUSD = money * 1.06;
        return  moneyUSD;
    }
}
