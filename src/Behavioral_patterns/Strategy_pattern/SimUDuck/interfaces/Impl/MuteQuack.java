package Behavioral_patterns.Strategy_pattern.SimUDuck.interfaces.Impl;

import Behavioral_patterns.Strategy_pattern.SimUDuck.interfaces.QuackBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Я не могу квакать");
    }
}
