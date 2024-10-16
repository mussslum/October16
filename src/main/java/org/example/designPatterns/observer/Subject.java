package org.example.designPatterns.observer;

public interface Subject {
    void add(Observer o);
    void remove(Observer o);
    void notifyObservers();
}
