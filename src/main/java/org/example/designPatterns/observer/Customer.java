package org.example.designPatterns.observer;


public class Customer implements Observer{

    public double money;
    public double moneyUSD ;
    public double moneyEURO ;

    public Customer(double money){
        this.money = money;
    }
    @Override
    public void update(double usd , double euro) {
        this.moneyUSD = money*usd;
        this.moneyEURO = money*euro;

        /*System.out.println("I have "+money*usd+"USD");
        System.out.println("I have "+money*euro+"EURO");*/
    }
}
