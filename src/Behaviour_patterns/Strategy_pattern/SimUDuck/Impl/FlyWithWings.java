package Behaviour_patterns.Strategy_pattern.SimUDuck.Impl;

import Behaviour_patterns.Strategy_pattern.SimUDuck.FlyBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Я могу летать");
    }
}
