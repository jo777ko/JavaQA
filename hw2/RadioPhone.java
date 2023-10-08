package telran.hw.hw2;

public class RadioPhone extends Phone{

    private int ownNumber;

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void receiveCall(int number) {
        System.out.print("The phone "+super.getModel() + " " + getOwnNumber());
        super.receiveCall(number);
    }

    @Override
    public void call(int number) {
        System.out.print("The phone " + super.getModel() + " " + getOwnNumber());
        super.call(number);
    }
}
