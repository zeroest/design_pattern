package me.zeroest.designpattern.behavior.visitor.before.shape;

import me.zeroest.designpattern.behavior.visitor.before.device.Device;

public interface Shape {
    void printTo(Device device);
}
