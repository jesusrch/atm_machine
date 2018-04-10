package com.jerache.atm;

import org.junit.Before;
import org.junit.Test;

public class AccountTests {

    private Account account;

    @Before
    public void setUp() {
        account = new Account(123456789, 1234, 800, 200);
    }

    @Test(expected = Exception.class)
    public void cannot_withdraw_more_money_than_the_atm_holds() throws Exception {

        account.withdraw(1000);
    }

    @Test(expected = Exception.class)
    public void cannot_withdraw_more_money_than_the_account_holds() throws Exception {

        account.withdraw(1000);
    }

}
