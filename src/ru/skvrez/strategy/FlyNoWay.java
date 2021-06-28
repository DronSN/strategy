package ru.skvrez.strategy;

public class FlyNoWay implements FlyBehevior {
    @Override
    public void fly() {
        System.out.println("I can't fly :-(");
    }
}
