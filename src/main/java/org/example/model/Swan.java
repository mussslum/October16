package org.example.model;

public class Swan extends Bird{
    @Override
    public void eat(){
        System.out.println("Swan can eat");
    }
    @Override
    public void fly(){
        System.out.println("Swan can fly");
    }
}
