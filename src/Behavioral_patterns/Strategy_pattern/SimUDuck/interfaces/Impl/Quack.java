package Behavioral_patterns.Strategy_pattern.SimUDuck.interfaces.Impl;

import Behavioral_patterns.Strategy_pattern.SimUDuck.interfaces.QuackBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Я квакаю");
    }
}
