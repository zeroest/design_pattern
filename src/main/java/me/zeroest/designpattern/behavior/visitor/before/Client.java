package me.zeroest.designpattern.behavior.visitor.before;

import me.zeroest.designpattern.behavior.visitor.before.device.Device;
import me.zeroest.designpattern.behavior.visitor.before.device.Phone;
import me.zeroest.designpattern.behavior.visitor.before.device.Watch;
import me.zeroest.designpattern.behavior.visitor.before.shape.Rectangle;
import me.zeroest.designpattern.behavior.visitor.before.shape.Triangle;

/**
 * 새로운 Shape이 생길 때마다 Shape에 Device 별 코드를 만들어야 함
 * Device또한 추가되면 매번 Shpae의 코드 수정이 필요하고 누락되어도 컴파일 에러가 나지 않으니 체크하기도 힘들다
 */
public class Client {
    public static void main(String[] args) {
        Device phone = new Phone();
        Device watch = new Watch();

        Rectangle rectangle = new Rectangle();
        rectangle.printTo(phone);
        rectangle.printTo(watch);
        /*
        Print rectangle to phone
        Print rectangle to watch
        */

        Triangle triangle = new Triangle();
        triangle.printTo(phone);
        triangle.printTo(watch);
        /*
        Print triangle to phone
        Print triangle to watch
        */
    }
}
