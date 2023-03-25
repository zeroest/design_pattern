package me.zeroest.designpattern.visitor.after.shape;

import me.zeroest.designpattern.visitor.after.device.Device;
import me.zeroest.designpattern.visitor.after.device.Phone;
import me.zeroest.designpattern.visitor.after.device.Watch;

public class Triangle implements Shape {
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
