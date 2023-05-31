package me.zeroest.designpattern.behavior.visitor.after.shape;

import me.zeroest.designpattern.behavior.visitor.after.device.Device;

public interface Shape {
    void accept(Device device);
}
