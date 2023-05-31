package me.zeroest.designpattern.behavior.visitor.before.shape;

import me.zeroest.designpattern.behavior.visitor.before.device.Device;
import me.zeroest.designpattern.behavior.visitor.before.device.Phone;
import me.zeroest.designpattern.behavior.visitor.before.device.Watch;

public class Circle implements Shape {
    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("Print circle to phone");
        } else if (device instanceof Watch) {
            System.out.println("Print circle to watch");
        } else {
            System.out.println("Print circle");
        }
    }
}
