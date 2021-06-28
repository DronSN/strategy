package ru.skvrez.strategy;

public class SilenceQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence quack...");
    }
}
