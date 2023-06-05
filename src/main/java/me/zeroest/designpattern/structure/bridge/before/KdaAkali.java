package me.zeroest.designpattern.structure.bridge.before;

public class KdaAkali implements Champion {
    @Override
    public void move() {
        System.out.println("KDA Akali move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA Akali Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA Akali W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA Akali E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA Akali R");
    }
}
