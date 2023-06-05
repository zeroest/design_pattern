package me.zeroest.designpattern.structure.bridge.after;

import me.zeroest.designpattern.structure.bridge.after.champion.Ari;
import me.zeroest.designpattern.structure.bridge.after.skin.ChristmasSkin;
import me.zeroest.designpattern.structure.bridge.after.skin.KdaSkin;

public class App {
    public static void main(String[] args) {
        Ari christmasAri = new Ari(new ChristmasSkin());
        christmasAri.skillQ();
        christmasAri.skillW();

        Ari kdaAri = new Ari(new KdaSkin());
        kdaAri.skillQ();
        kdaAri.skillW();
    }
}
