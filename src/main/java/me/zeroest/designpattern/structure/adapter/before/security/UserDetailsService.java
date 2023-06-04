package me.zeroest.designpattern.structure.adapter.before.security;

// Target Interface
public interface UserDetailsService {

    UserDetails loadUser(String username);

}
