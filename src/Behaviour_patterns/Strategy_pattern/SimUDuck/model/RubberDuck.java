package Behaviour_patterns.Strategy_pattern.SimUDuck.model;

import Behaviour_patterns.Strategy_pattern.SimUDuck.interfaces.Impl.FlyNoWay;
import Behaviour_patterns.Strategy_pattern.SimUDuck.interfaces.Impl.Squeak;

/**
 * Created by podo on 19.03.15.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Я резиновая утка:)");
    }

    @Override
    public void performFly() {
        super.performFly();
    }

    @Override
    public void performQuack() {
        super.performQuack();
    }

    @Override
    public void swim() {
        super.swim();
    }
}
