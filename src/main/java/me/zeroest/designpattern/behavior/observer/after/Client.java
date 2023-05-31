package me.zeroest.designpattern.behavior.observer.after;

import me.zeroest.designpattern.behavior.observer.after.observer.User;
import me.zeroest.designpattern.behavior.observer.after.subject.DesignPatternSubject;
import me.zeroest.designpattern.behavior.observer.after.subject.HelloSubject;

public class Client {
    public static void main(String[] args) {

        DesignPatternSubject dps = new DesignPatternSubject();
        HelloSubject hs = new HelloSubject();

        User user1 = new User("user1");
        dps.registerObserver(user1);
        hs.registerObserver(user1);
        User user2 = new User("user2");
        dps.registerObserver(user2);

        dps.notifyObservers("Observer");
        dps.notifyObservers("Visitor");
        /*
        user1 received : Observer
        user2 received : Observer
        user1 received : Visitor
        user2 received : Visitor
        */

        hs.notifyObservers("Hello");
        hs.notifyObservers("World");
        /*
        user1 received : Hello
        user1 received : World
        */

    }
}
