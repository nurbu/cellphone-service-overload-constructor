package pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    // Getters and Setters
    public void setSerialNumber(int newSerialNumber) {
        serialNumber = newSerialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }

    public void setCarrier(String newCarrier) {
        carrier = newCarrier;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setOwner(String newOwner) {
        owner = newOwner;
    }

    public String getOwner() {
        return owner;
    }

    // Modifications

    public void dial(String callingNumber) {
        System.out.println(owner + "'s phone is calling " + callingNumber);
    }


}
