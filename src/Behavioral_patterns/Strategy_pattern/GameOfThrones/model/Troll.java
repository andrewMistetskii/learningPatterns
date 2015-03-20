package Behavioral_patterns.Strategy_pattern.GameOfThrones.model;

import Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.Impl.BowAndArrowBehaviour;
import Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.WeaponBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public class Troll extends Character {
    @Override
    public void setWeapon() {
        weapon = new BowAndArrowBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("Я - тролль!");
        weapon.useWeapon();
    }
}
