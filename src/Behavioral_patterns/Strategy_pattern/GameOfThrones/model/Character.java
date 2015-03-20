package Behavioral_patterns.Strategy_pattern.GameOfThrones.model;

import Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.WeaponBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public abstract class Character {
    WeaponBehaviour weapon;

    public abstract void setWeapon();



   public abstract void fight();
}
