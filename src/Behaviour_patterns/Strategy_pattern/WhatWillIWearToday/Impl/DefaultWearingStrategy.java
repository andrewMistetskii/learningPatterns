package Behaviour_patterns.Strategy_pattern.WhatWillIWearToday.Impl;

import Behaviour_patterns.Strategy_pattern.WhatWillIWearToday.interfaces.IWearingStrategy;

/**
 * Created by podo on 19.03.15.
 */
public class DefaultWearingStrategy implements IWearingStrategy {
    @Override
    public String getClothes() {
        return "Shirt";
    }

    @Override
    public String getAccessories() {
        return "Nothing";
    }
}
