package me.zeroest.designpattern.visitor.after.shape;

import me.zeroest.designpattern.visitor.after.device.Device;

public interface Shape {
    void accept(Device device);
}
