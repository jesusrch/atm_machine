package com.jerache.atm;

public class Atm {
    private final double deposit;

    public Atm(double deposit) {
        this.deposit = deposit;
    }

    public void withdraw(long accountNumber, int pin, double amount) throws Exception{
        if (amount > deposit) {
            throw new Exception();
        }
        else {
//            Account account = new Account(accountNumber, pin);
//            account.withdraw(amount);
        }
    }
}
