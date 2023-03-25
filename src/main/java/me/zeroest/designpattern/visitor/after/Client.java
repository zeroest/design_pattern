package me.zeroest.designpattern.visitor.after;

import me.zeroest.designpattern.visitor.after.device.Device;
import me.zeroest.designpattern.visitor.after.device.Phone;
import me.zeroest.designpattern.visitor.after.device.Watch;
import me.zeroest.designpattern.visitor.after.shape.Rectangle;
import me.zeroest.designpattern.visitor.after.shape.Triangle;

public class Client {
    public static void main(String[] args) {
        Device phone = new Phone();
        Watch watch = new Watch();

        Rectangle rectangle = new Rectangle();
        rectangle.accept(phone);
        rectangle.accept(watch);
        /*
        Print rectangle to phone
        Print rectangle to watch
        */

        Triangle triangle = new Triangle();
        triangle.accept(phone);
        triangle.accept(watch);
        /*
        Print triangle to phone
        Print triangle to watch
        */
    }
}
