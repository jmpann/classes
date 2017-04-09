package com.company;

/**
 * Created by flatironschool on 4/9/17.
 */
public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        System.out.println("caled empty constructor");
    }

    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account() {
        this(12345, 0.00, "unknown", "unknown", "unknown");
        System.out.println("No fields given. Created default account.");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("You now have " + this.balance + " in your account.");
    }

    public void withdrawFunds(double amount) {
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println("You now have " + this.balance + " in your account.");
        } else {
            System.out.println("There are insufficient funds.");
        }

    }
}
