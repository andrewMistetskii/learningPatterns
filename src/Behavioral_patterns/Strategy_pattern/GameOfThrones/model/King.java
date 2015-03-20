package Behavioral_patterns.Strategy_pattern.GameOfThrones.model;

import Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.Impl.SwordBehavior;
import Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.WeaponBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public class King extends Character {



    public void setWeapon() {
       weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Я - король! ");
        weapon.useWeapon();
    }
}
