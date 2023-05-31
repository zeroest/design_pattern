package me.zeroest.designpattern.behavior.observer.after.subject;

import me.zeroest.designpattern.behavior.observer.after.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers(String message);
}
