package me.zeroest.designpattern.state.before;

public class Client {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.powerPush(); // 전원 on
        laptop.powerPush(); // 전원 off
    }
}
