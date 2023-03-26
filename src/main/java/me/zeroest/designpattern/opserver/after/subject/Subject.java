package me.zeroest.designpattern.opserver.after.subject;

import me.zeroest.designpattern.opserver.after.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers(String message);
}
