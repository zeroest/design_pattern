package me.zeroest.designpattern.structure.adapter.after;

import me.zeroest.designpattern.structure.adapter.before.AccountService;
import me.zeroest.designpattern.structure.adapter.before.security.LoginHandler;
import me.zeroest.designpattern.structure.adapter.before.security.UserDetailsService;

public class Application {
    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("zeroest", "zeroest");
        System.out.println("login = " + login);

    }
}
