package me.zeroest.designpattern.behavior.state.after;

public class Client {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.powerPush(); // 절전모드
        laptop.powerPush(); // 전원 on
        laptop.powerPush(); // 전원 off

        laptop.powerPush(); // 절전모드
        laptop.powerPush(); // 전원 on
        laptop.powerPush(); // 전원 off
    }
}
