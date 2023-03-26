package me.zeroest.designpattern.observer.after.subject;

import me.zeroest.designpattern.observer.after.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class HelloSubject implements Subject {

    private static final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
