package com.company;

import java.util.Random;

public class Fruits extends Food{
    private Type type;

    public Fruits(EnumTaste vkus) {
        super(vkus);
    }

    public Fruits(Type type) {
        this.type = type;
    }

    public Fruits(EnumTaste vkus, Type type) {
        super(vkus);
        this.type = type;
    }

    public Type getType() {
        return type;
    }
    public void eating(String eat){
        System.out.println(eat);
    }
    public final void norm(){
        Random random = new Random();
        int dfsd = random.nextInt(2);
        if (dfsd == 0){
            System.out.println("Нормальный");
        }
        if (dfsd == 1){
            System.out.println("не нормальный");
        }
    }
    public String getInfo (){
        return "Тип: "+type.getType() + "\nВкусный? "+getVkus();
    }

}