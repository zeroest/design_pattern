package me.zeroest.designpattern.structure.bridge.after.champion;

import me.zeroest.designpattern.structure.bridge.after.skin.Skin;
import me.zeroest.designpattern.structure.bridge.before.Champion;

public class DefaultChampion implements Champion {
    private final Skin skin;
    private final String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move", skin.getName(), name);
        System.out.println();
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q", skin.getName(), name);
        System.out.println();
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W", skin.getName(), name);
        System.out.println();
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E", skin.getName(), name);
        System.out.println();
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R", skin.getName(), name);
        System.out.println();
    }
}
