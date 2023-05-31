package me.zeroest.designpattern.behavior.observer.after.observer;

public class User implements Observer {
    public User(String name) {
        this.name = name;
    }

    private final String name;

    @Override
    public void update(String message) {
        System.out.println(name + " received : " + message);
    }
}
