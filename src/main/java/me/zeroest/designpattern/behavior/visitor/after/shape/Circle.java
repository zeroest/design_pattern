package me.zeroest.designpattern.behavior.visitor.after.shape;

import me.zeroest.designpattern.behavior.visitor.after.device.Device;

public class Circle implements Shape {
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
