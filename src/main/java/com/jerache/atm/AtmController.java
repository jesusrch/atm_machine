package com.jerache.atm;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class AtmController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to the ATM!";
    }

    @RequestMapping("/balance")
    public Account balance(@RequestParam(value="accountnum") String accountnum, @RequestParam(value="pin") String pin) {
        return new Account(Long.valueOf(accountnum), Integer.valueOf(pin));
    }

    @RequestMapping(method = {RequestMethod.POST}, value = {"/withdraw"})
    public Account withdraw(@RequestParam(value="accountnum") String accountnum, @RequestParam(value="pin") String pin, @RequestParam(value="amount") String amount) {
        Account account = new Account(Long.valueOf(accountnum), Integer.valueOf(pin));
        try {
            account.withdraw(Double.valueOf(amount));
        }
        catch (Exception e)
            {
            }
        return account;
    }
}
