package org.example.designPatterns.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Currency implements Subject{

    public double USD ;
    public double EURO ;
    private List<Observer> observers = new ArrayList<>();

    public Currency(double usd , double euro){
        this.USD = usd;
        this.EURO = euro;
    }

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(USD,EURO);
        }
    }
    public void setCurrencies(double usd , double euro){
        this.USD = usd;
        this.EURO = euro;
    }
}
