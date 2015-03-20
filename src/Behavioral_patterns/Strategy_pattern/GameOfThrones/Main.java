package Behavioral_patterns.Strategy_pattern.GameOfThrones;


import Behavioral_patterns.Strategy_pattern.GameOfThrones.model.*;
import Behavioral_patterns.Strategy_pattern.GameOfThrones.model.Character;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by podo on 19.03.15.
 */
public class Main {

    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        king.setWeapon();
        queen.setWeapon();
        knight.setWeapon();
        troll.setWeapon();

        List<Character> characters = new ArrayList<>();
        characters.add(king);
        characters.add(queen);
        characters.add(knight);
        characters.add(troll);

        for(Character character : characters){
            System.out.println("******************");
            character.fight();
            System.out.println("******************");
        }
    }
}
