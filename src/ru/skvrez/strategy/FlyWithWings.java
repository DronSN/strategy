package ru.skvrez.strategy;

public class FlyWithWings implements FlyBehevior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}
