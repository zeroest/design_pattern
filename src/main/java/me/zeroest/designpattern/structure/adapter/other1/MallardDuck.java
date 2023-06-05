package me.zeroest.designpattern.structure.adapter.other1;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Im flying");
    }
}
