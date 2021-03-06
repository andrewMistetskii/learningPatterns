package Behavioral_patterns.Strategy_pattern.SimUDuck;

import Behavioral_patterns.Strategy_pattern.SimUDuck.model.Duck;
import Behavioral_patterns.Strategy_pattern.SimUDuck.model.MallardDuck;
import Behavioral_patterns.Strategy_pattern.SimUDuck.model.RubberDuck;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        List<Duck> ducks = new ArrayList<Duck>();
        ducks.add(mallardDuck);
        ducks.add(rubberDuck);

        for(Duck duck : ducks){
            System.out.println("--------------------------------");
            duck.display();
            System.out.println();
            duck.performFly();
            System.out.println();
            duck.performQuack();
            System.out.println();
            duck.swim();
            System.out.println("--------------------------------");
        }
    }
}
