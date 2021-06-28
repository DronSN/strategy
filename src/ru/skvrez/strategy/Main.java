package ru.skvrez.strategy;

public class Main {

    public static void main(String[] args) {

        Duck redheadDuck = new RedheadDuck();
        testDuck(redheadDuck);

        Duck rubberDuck = new RubberDuck();
        testDuck(rubberDuck);
        rubberDuck.setQuackBehavior(new SilenceQuack());
        testDuck(rubberDuck);
    }

    public static void testDuck(Duck duck) {
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }
}
