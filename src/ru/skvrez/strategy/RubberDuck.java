package ru.skvrez.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new Quack(), new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I'm Rubber Duck");
    }
}
