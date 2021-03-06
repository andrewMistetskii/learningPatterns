package Behavioral_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.Impl;

import Behavioral_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.IWearingStrategy;

/**
 * Created by podo on 19.03.15.
 */
public class RainWearingStrategy implements IWearingStrategy {
    @Override
    public String getClothes() {
        return "Coat";
    }

    @Override
    public String getAccessories() {
        return "Umbrella";
    }
}
