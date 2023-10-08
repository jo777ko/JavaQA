package telran.hw.hw2;

public class HomeWork2 {

    public static void main(String[] args) {

        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setModel("BlackBerry");
        buttonPhone.setOwnNumber(258);
        buttonPhone.call(123);
        buttonPhone.receiveCall(321);

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setModel("OnePlus");
        smartPhone.setOwnNumber(777);
        smartPhone.call(456);
        smartPhone.receiveCall(654);

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setModel("Nokia");
        radioPhone.setOwnNumber(137);
        radioPhone.call(789);
        radioPhone.receiveCall(987);

        Phone[] ph = {buttonPhone, smartPhone, radioPhone};
        makeCall(ph, 911);
        receiveCall(ph, 112);

    }

    public static void makeCall(Phone[] phones, int number){
        for (Phone phone : phones) {
            phone.call(number);
        }
    }

    public static void receiveCall(Phone[] phones, int number){
        for (Phone phone : phones) {
            phone.receiveCall(number);
        }
    }

}
