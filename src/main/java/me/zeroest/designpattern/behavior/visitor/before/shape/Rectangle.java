package me.zeroest.designpattern.behavior.visitor.before.shape;

import me.zeroest.designpattern.behavior.visitor.before.device.Device;
import me.zeroest.designpattern.behavior.visitor.before.device.Phone;
import me.zeroest.designpattern.behavior.visitor.before.device.Watch;

public class Rectangle implements Shape {
    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("Print rectangle to phone");
        } else if (device instanceof Watch) {
            System.out.println("Print rectangle to watch");
        } else {
            System.out.println("Print rectangle");
        }
    }
}
