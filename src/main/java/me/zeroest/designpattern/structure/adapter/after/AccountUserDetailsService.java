package me.zeroest.designpattern.structure.adapter.after;

import me.zeroest.designpattern.structure.adapter.before.Account;
import me.zeroest.designpattern.structure.adapter.before.AccountService;
import me.zeroest.designpattern.structure.adapter.before.security.UserDetails;
import me.zeroest.designpattern.structure.adapter.before.security.UserDetailsService;

/**
 * Adapter
 * 코드가 외부 라이브러리라는 가정일때 해당 클래스와 같이 새로운 클래스에서 구현
 * 만약 코드를 직접 수정 가능하다면 AccountService 클래스에서 직접 UserDetailsService 를 구현하여도 무방
 */
public class AccountUserDetailsService
    // target
    implements UserDetailsService {

    // adaptee
    private final AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }
}
