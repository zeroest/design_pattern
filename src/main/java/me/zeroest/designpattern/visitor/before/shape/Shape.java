package me.zeroest.designpattern.visitor.before.shape;

import me.zeroest.designpattern.visitor.before.device.Device;

public interface Shape {
    void printTo(Device device);
}
