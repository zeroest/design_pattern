package me.zeroest.designpattern.behavior.visitor.after.device;

import me.zeroest.designpattern.behavior.visitor.after.shape.Circle;
import me.zeroest.designpattern.behavior.visitor.after.shape.Rectangle;
import me.zeroest.designpattern.behavior.visitor.after.shape.Triangle;

public class Pad implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("Print Circle to Pad");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Print Rectangle to Pad");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Print Triangle to Pad");
    }
}
