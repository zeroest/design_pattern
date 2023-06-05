package me.zeroest.designpattern.structure.bridge.before;

public class ChristmasAri implements Champion {
    @Override
    public void move() {
        System.out.println("Christmas Ari move");
    }

    @Override
    public void skillQ() {
        System.out.println("Christmas Ari Q");
    }

    @Override
    public void skillW() {
        System.out.println("Christmas Ari W");
    }

    @Override
    public void skillE() {
        System.out.println("Christmas Ari E");
    }

    @Override
    public void skillR() {
        System.out.println("Christmas Ari R");
    }
}
