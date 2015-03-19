package Behavioral_patterns.Strategy_pattern.WhatWillIWearToday;

import Behavioral_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.Impl.DefaultWearingStrategy;
import Behavioral_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.IWearingStrategy;

import java.text.MessageFormat;

/**
 * Created by podo on 19.03.15.
 */
public class Myself {
    private IWearingStrategy wearingStrategy = new DefaultWearingStrategy();

    public void changeStrategy(IWearingStrategy wearingStrategy) {
        this.wearingStrategy = wearingStrategy;
    }

    public void goOutside() {
        System.out.println("------------------------------------");
        String weather = wearingStrategy.getClass().getSimpleName().toString();
        String clothes = wearingStrategy.getClothes();
        String accessories = wearingStrategy.getAccessories();
        if (weather.contains("Sunshine")) {
            System.out.println(MessageFormat.format("Today is sunny day and i`ll wear {0} and took {1}", clothes, accessories));
        } else if (weather.contains("Rain")) {
            System.out.println(MessageFormat.format("Today is rainy day and i`ll wear {0} and took {1}", clothes, accessories));
        }
        System.out.println("------------------------------------");
    }
}
