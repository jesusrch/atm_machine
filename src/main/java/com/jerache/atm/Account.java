package com.jerache.atm;

public class Account {
    private long accountNumber;
    private int pin;
    private double balance;
    private double overdraft;

    public Account(long accountNumber, int pin, double balance, double overdraft) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) throws Exception {
        throw new Exception();
    }
}
