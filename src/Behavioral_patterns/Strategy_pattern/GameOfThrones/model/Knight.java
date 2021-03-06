package Behavioral_patterns.Strategy_pattern.GameOfThrones.model;

import Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.Impl.AxeBehaviour;
import Behavioral_patterns.Strategy_pattern.GameOfThrones.interfaces.WeaponBehaviour;

/**
 * Created by podo on 19.03.15.
 */
public class Knight  extends Character{
    @Override
    public void setWeapon() {
        weapon = new AxeBehaviour();
    }

    @Override
   public void fight() {
        System.out.println("Я - рыцарь");
        weapon.useWeapon();
    }
}
