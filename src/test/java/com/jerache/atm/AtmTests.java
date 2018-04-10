package com.jerache.atm;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AtmTests {

    private Atm atm;

    @Before
    public void setUp() {
        atm = new Atm(200);
    }

//    @Test
//    public void checkBalance_has_to_return_the_accounts_current_balance() {
//        assertThat(atm.checkBalance()).isEqualTo(800);
//    }

    @Test(expected = Exception.class)
    public void cannot_withdraw_more_money_than_the_atm_holds() throws Exception {

        atm.withdraw(123456789, 1234, 1000);
    }

    @Test(expected = Exception.class)
    public void cannot_withdraw_more_money_than_the_account_holds() throws Exception {

        atm.withdraw(123456789, 1234, 1000);
    }

}
