package me.zeroest.designpattern.structure.adapter.after;

import me.zeroest.designpattern.structure.adapter.before.Account;
import me.zeroest.designpattern.structure.adapter.before.security.UserDetails;

/**
 * Adapter
 * 코드가 외부 라이브러리라는 가정일때 해당 클래스와 같이 새로운 클래스에서 구현
 * 만약 코드를 직접 수정 가능하다면 Account 클래스에서 직접 UserDetails 를 구현하여도 무방
 */
public class AccountUserDetails
    // target
    implements UserDetails {

    // adaptee
    private final Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
