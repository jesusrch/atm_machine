package com.jerache.atm;

public class Atm {
    private final double deposit;

    public Atm(double deposit) {
        this.deposit = deposit;
    }

    public void withdraw(long account, int pin, double amount) throws Exception{
        throw new Exception();
    }
}
