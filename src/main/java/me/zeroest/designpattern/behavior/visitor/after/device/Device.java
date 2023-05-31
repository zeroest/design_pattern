package me.zeroest.designpattern.behavior.visitor.after.device;

import me.zeroest.designpattern.behavior.visitor.after.shape.Circle;
import me.zeroest.designpattern.behavior.visitor.after.shape.Rectangle;
import me.zeroest.designpattern.behavior.visitor.after.shape.Triangle;

public interface Device {
    void print(Circle circle);
    void print(Rectangle rectangle);
    void print(Triangle triangle);
}
