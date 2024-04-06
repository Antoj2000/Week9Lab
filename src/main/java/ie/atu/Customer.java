package ie.atu;

public class Customer extends Person {
    private String customerNumber;
    private boolean onMailingList;

    public Customer(){
    }
    public Customer(String name, String address, String phoneNumber, String customerNumber, boolean onMailingList) {
        super(name, address, phoneNumber); // Call the superclass constructor to initialize name, address, and phoneNumber
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    public String getCustomerNumber(){
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isOnMailingList() {
        return onMailingList;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }




}

