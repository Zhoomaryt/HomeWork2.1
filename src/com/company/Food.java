package com.company;

public class Food {
    private EnumTaste vkus;

    public Food(){}

    public Food(EnumTaste vkus) {
        this.vkus = vkus;
    }

    public EnumTaste getVkus() {
        return vkus;
    }
}
