package Behavioral_patterns.Strategy_pattern.GameOfThrones.model;

import Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.Impl.KnifeBehaviour;
import Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.WeaponBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public class Queen extends Character {
    @Override
    public void setWeapon() {
        weapon = new KnifeBehaviour();
    }

    @Override
    public void fight() {
        System.out.println("Я - королева!");
        weapon.useWeapon();
    }
}
