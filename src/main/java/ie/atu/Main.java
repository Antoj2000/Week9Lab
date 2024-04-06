package ie.atu;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Anthony", "50 Valleycourt", "0877766382",
                "123456", true);

        System.out.println("Customer");
        System.out.printf("Name: %s\n", customer1.getName());
        System.out.printf("Address: %s\n", customer1.getAddress());
        System.out.printf("Phone Number: %s\n", customer1.getPhoneNumber());
        System.out.printf("Customer Number: %s\n", customer1.getCustomerNumber());
        System.out.printf("On Mailing List: %b\n", customer1.isOnMailingList());

    }
}