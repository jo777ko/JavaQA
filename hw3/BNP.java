package telran.hw.hw3;

import java.util.Scanner;

public class BNP extends ATM{
    private String name;
    private int balanceATM;
    private String currency = "USD";

    Scanner sc = new Scanner(System.in);

    public BNP(String name, int balanceATM, String currency) {
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

    public String getCurrency() {
        return currency;
    }

    @Override
    public Object deposit(CreditCard card, int money) {
        if (checkCurrency(card)) {
            System.out.println("Enter your pin: ");
            if (checkPin(card, sc.nextInt())) {
                balanceATM += money;
                int currentBalance = card.setBalanceCard(card.getBalanceCard() + money);
                return "You balance is " + currentBalance;
            } else {
                return "Invalid pin";
            }
        } else {
            return "We don't support " + card.getTypeOfCurrency();
        }
    }

    @Override
    public Object withdraw(CreditCard card, int money) {
        if (checkPin(card, sc.nextInt())){
            if (checkCurrency(card)){
                balanceATM -= money;
                int currentBalance = card.setBalanceCard(card.getBalanceCard() - money);
                return "You balance is " + currentBalance;
            } else {
                return "Invalid pin";
            }
        } else {
            return "We don't support " + card.getTypeOfCurrency();
        }
    }

    public boolean checkCurrency(CreditCard card){
        if (currency.equalsIgnoreCase(card.getTypeOfCurrency())){
            return true;
        } else {
            return false;
        }
    }

}
