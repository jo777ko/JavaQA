package homework.homework2.level1;

public class CreditCard {
    protected int numberOfCard;
    protected int pinCode;
    protected int balance = 0;
    protected int limit;
    protected int debt = 0;

    public CreditCard(){

        this.balance = balance;
    }

    public CreditCard(int numberOfCard, int pinCode) {
        this.numberOfCard = numberOfCard;
        this.pinCode = pinCode;
    }


    public double getBalance() {

        return balance;
    }

    public void setBalance(int balance) { this.balance = balance; }

    public void setDebt(int debt) { this.debt = debt; }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void deposit(int pin, int m) {
        if(pinCode == pin && debt < 0 && balance <= 0) {
            System.out.println(debt + m);
        } else if (pinCode == pin && debt >= 0 && balance >= 0) {
            System.out.println(balance + m);
        } else{
            System.out.println("Cancel");
        }
    }

    public void withdraw(int pin, int money){
        if(pinCode == pin && balance >= money ){
//            System.out.print("Your balance: ");
            System.out.println(balance - money);
        } else if(pinCode == pin && balance < money && limit >= (money - balance)){
//            System.out.println("Your debt: ");
            System.out.println(balance - money + debt);
        } else {
            System.out.println("Canceled");
        }
    }
}
