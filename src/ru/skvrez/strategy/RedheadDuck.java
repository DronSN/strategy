package ru.skvrez.strategy;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new Quack(), new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I'm Redhead Duck");
    }
}
