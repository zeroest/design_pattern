package me.zeroest.designpattern.visitor.before.shape;

import me.zeroest.designpattern.visitor.before.device.Device;
import me.zeroest.designpattern.visitor.before.device.Phone;
import me.zeroest.designpattern.visitor.before.device.Watch;

public class Triangle implements Shape {
    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("Print triangle to phone");
        } else if (device instanceof Watch) {
            System.out.println("Print triangle to watch");
        } else {
            System.out.println("Print triangle");
        }
    }
}
