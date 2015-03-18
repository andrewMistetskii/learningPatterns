package Behaviour_patterns.Strategy_pattern.SimUDuck;

import Behaviour_patterns.Strategy_pattern.SimUDuck.Impl.FlyWithWings;
import Behaviour_patterns.Strategy_pattern.SimUDuck.Impl.Quack;

/**
 * Created by podo on 19.03.15.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    
    @Override
    public void display() {
        System.out.println("Я настоящая дикая утка");
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
