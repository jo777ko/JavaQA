package telran.hw.hw3;

public class CreditCard {

    private int number;
    private int pin;
    private int balanceCard;
    private String typeOfCurrency = "EUR";

    public CreditCard(int number, int pin, int balanceCard, String typeOfCurrency) {
        this.number = number;
        this.pin = pin;
        this.balanceCard = balanceCard;
        this.typeOfCurrency = typeOfCurrency;
    }

    public int getPin() {
        return pin;
    }

    public int getNumber() {
        return number;
    }

    public int getBalanceCard() {
        return balanceCard;
    }

    public String getTypeOfCurrency() {
        return typeOfCurrency;
    }

    public int setBalanceCard(int balanceCard) {
        this.balanceCard = balanceCard;
        return balanceCard;
    }
}
