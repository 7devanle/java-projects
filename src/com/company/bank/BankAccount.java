package com.company.bank;

public class BankAccount {
    public BankAccount() {
        this(43.90);
    }
    public BankAccount(double balance){
        this("1204923", balance, "aburo farouq", "ffamexyz@gmail.com", "08097382");
    }

    public BankAccount(String accountNumber, double balance, String accountName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    private String accountNumber;
    private double balance;
    private String accountName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
    public void depositeFunds(double amount){
        double balance = this.balance;
        balance += amount;
        this.balance = balance;
        System.out.println("account credited with " + amount + " your current balance is " + getBalance());
    }
    public void withdrawFunds(double amount){
        double balance = this.balance;
        balance -= amount;
        if(balance<0){
            System.out.println("insufficient funds");
        }
        this.balance = balance;
        System.out.println("Account debited with " + amount + " your current balance is " + getBalance());
    }
}
