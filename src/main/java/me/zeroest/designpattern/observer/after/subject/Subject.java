package me.zeroest.designpattern.observer.after.subject;

import me.zeroest.designpattern.observer.after.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers(String message);
}
