package Behaviour_patterns.Strategy_pattern.SimUDuck.Impl;

import Behaviour_patterns.Strategy_pattern.SimUDuck.QuackBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Я не могу квакать");
    }
}
