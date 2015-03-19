package Behavioral_patterns.Strategy_pattern.SimUDuck.model;

import Behavioral_patterns.Strategy_pattern.SimUDuck.interfaces.FlyBehaviour;
import Behavioral_patterns.Strategy_pattern.SimUDuck.interfaces.QuackBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("Все утки плавают, даже резиновые утки и утки -  приманки :)");
    }
}
