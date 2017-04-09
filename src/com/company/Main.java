package com.company;

public class Main {

    public static void main(String[] args) {
        // declare datatype. Classes are datatypes. Initialize by calling new classname method
//        Car porsche = new Car();
//        Car acura = new Car();
//        porsche.setModel("Carrera");
//
//        System.out.println(porsche.getModel());

//        Account josh = new Account();
//        josh.setBalance(1000.56);
//        josh.setAccountNumber(1);
//        josh.setCustomerName("josh");
//        josh.setEmail("test@test.com");
//        josh.setPhoneNumber("555-555-5555");

        Account josh = new Account(1, 1000.00, "josh", "test@test.com", "555-555-5555");

        System.out.println(josh.getBalance());
        System.out.println(josh);
        josh.depositFunds(500.67);
        josh.withdrawFunds(100);
    }
}
