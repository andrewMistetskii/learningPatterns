package Behaviour_patterns.Strategy_pattern.WhatWillIWearToday;

import Behaviour_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.Impl.RainWearingStrategy;
import Behaviour_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.Impl.SunshineWearingStrategy;

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
