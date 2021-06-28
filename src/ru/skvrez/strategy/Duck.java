package ru.skvrez.strategy;

public abstract class Duck {
    private QuackBehavior quackBehavior;
    private FlyBehevior flyBehevior;

    public Duck(QuackBehavior quackBehavior, FlyBehevior flyBehevior) {
        this.quackBehavior = quackBehavior;
        this.flyBehevior = flyBehevior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehevior(FlyBehevior flyBehevior) {
        this.flyBehevior = flyBehevior;
    }

    public abstract void display();

    public  void swim() {
        System.out.println("All ducks can to swim!");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehevior.fly();
    }
}
