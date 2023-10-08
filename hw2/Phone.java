package telran.hw.hw2;

public class Phone {
    private String model;
    private String phoneName;

    public Phone() {
    }

    public Phone(String model, String phoneName) {
        this.phoneName = phoneName;
        this.model = model;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getModel() {
        return model;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void receiveCall(int number){
        System.out.println(" try to receive a call from number "  + number);
    }

    public void call(int number){
        System.out.println(" try to make a call to number " + number);
    }

}
