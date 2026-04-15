package pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Make an instance of a CellPhone
        Scanner scanner = new Scanner(System.in);

        // Create a CellPhone instance called newPhone

        CellPhone newPhone1 = new CellPhone();
        // CellPhone newPhone2 = new CellPhone();
        CellPhone newPhone3 = new CellPhone(1234567, "IPhone 17 Pro", "Verizon", "911", "Nurbu");


        // Printing phone information
        display(scanner, newPhone1);
        // display(scanner, newPhone2);
        display(newPhone3);

        //Calling phones
        newPhone1.dial(newPhone3.getPhoneNumber());

        //newPhone2.dial(newPhone1.getPhoneNumber());

        newPhone3.dial(newPhone1.getPhoneNumber());

        // Testing overloaded Dial method

        newPhone3.dial(newPhone3);

        scanner.close();
    }

    // Regular Display method
    public static void display(CellPhone phone) {
        // Used Getters to output information about newPhone
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }

    // Had Extra time created for fun.
    public static void display(Scanner scanner, CellPhone phone) {

        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        System.out.println("New phone");
        System.out.print("What is the serial number? ");
        serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is the model? ");
        model = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        carrier = scanner.nextLine();
        System.out.print("What is the phone number? ");
        phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the service? ");
        owner = scanner.nextLine();

        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        // Used Getters to output information about newPhone
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }
}
