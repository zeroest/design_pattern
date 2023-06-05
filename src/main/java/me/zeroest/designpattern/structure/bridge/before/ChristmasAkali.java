package me.zeroest.designpattern.structure.bridge.before;

public class ChristmasAkali implements Champion {
    @Override
    public void move() {
        System.out.println("Christmas Akali move");
    }

    @Override
    public void skillQ() {
        System.out.println("Christmas Akali Q");
    }

    @Override
    public void skillW() {
        System.out.println("Christmas Akali W");
    }

    @Override
    public void skillE() {
        System.out.println("Christmas Akali E");
    }

    @Override
    public void skillR() {
        System.out.println("Christmas Akali R");
    }
}
