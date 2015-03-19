package Behavioral_patterns.Strategy_pattern.WhatWillIWearToday;

import Behavioral_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.Impl.RainWearingStrategy;
import Behavioral_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.Impl.SunshineWearingStrategy;

/**
 * Created by podo on 19.03.15.
 */
public class Main {

    public static void main(String[] args) {
        Myself me = new Myself();
        me.changeStrategy(new SunshineWearingStrategy());
        me.goOutside();
        me.changeStrategy(new RainWearingStrategy());
        me.goOutside();
    }
}
