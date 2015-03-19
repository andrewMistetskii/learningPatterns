package Behavioral_patterns.Strategy_pattern.SimUDuck.interfaces.Impl;

import Behavioral_patterns.Strategy_pattern.SimUDuck.interfaces.FlyBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Я не могу летать");
    }
}
