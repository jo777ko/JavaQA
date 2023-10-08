package telran.hw.hw3;

public abstract class ATM {

    public abstract Object deposit(CreditCard card, int money);

    public abstract Object withdraw(CreditCard card, int money);

    public boolean checkPin(CreditCard card, int pin){
        if (card.getPin() == pin) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCurrency(CreditCard card){
        return false;
    }


}
