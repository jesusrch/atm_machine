package com.jerache.atm;

public class Account {
    private final long accountNumber;
    private final int pin;
    private final double balance;
    private final double overdraft;

    public Account(long accountNumber, int pin, double balance, double overdraft) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.overdraft = overdraft;
    }

    public Account(long accountNumber, int pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 800;
        this.overdraft = 200;
    }

    public void withdraw(double amount) throws Exception {
        throw new Exception();
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraft() {
        return overdraft;
    }

}
