package Behaviour_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.Impl;

import Behaviour_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.IWearingStrategy;

/**
 * Created by podo on 19.03.15.
 */
public class SunshineWearingStrategy implements IWearingStrategy {
    @Override
    public String getClothes() {
        return "T-shirt";
    }

    @Override
    public String getAccessories() {
        return "Sunglasses";
    }
}
