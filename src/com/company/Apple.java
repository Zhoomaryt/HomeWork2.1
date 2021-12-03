package com.company;

public final class Apple extends Fruits{
    private int colichestvo;


    public Apple(Type type, int colichestvo) {
        super(type);
        this.colichestvo = colichestvo;
    }

    public Apple(EnumTaste vkus, Type type, int colichestvo) {
        super(vkus, type);
        this.colichestvo = colichestvo;
    }

    public int getColichestvo() {
        return colichestvo;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nКоличество крастных яблок: "+colichestvo +"\n";
    }
}