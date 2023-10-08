package telran.hw.hw3;

public class HomeWork3 {
    public static void main(String[] args) {

        ATM atm1 = new JPMorgan("JP", 1000, "USD");
        ATM atm2 = new BNP("BNP", 1000, "USD");
        ATM atm3 = new ING("ING", 1000, "USD");
        ATM atm4 = new JPMorgan("JP", 1000, "USD");

        ATM[] atms = {atm1, atm2, atm3, atm4};

        CreditCard card = new CreditCard(976431, 1234, 100, "EUR");

        for (ATM a :atms) {
            if (a.checkCurrency(card)){
                a.deposit(card, 100);
                a.withdraw(card, 1000);
            }
        }
    }
}
