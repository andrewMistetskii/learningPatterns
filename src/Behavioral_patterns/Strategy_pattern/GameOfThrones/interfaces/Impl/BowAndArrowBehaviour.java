package Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.Impl;

import Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.WeaponBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Выстрел из лука");
    }
}
