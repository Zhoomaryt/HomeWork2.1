package com.company;

public class Main {

    public static void main(String[] args) {

        Type type = new Type("фрукт");
        Type type2 = new Type("крастное  яблоко");

        Fruits objectA =new Fruits(EnumTaste.NOO,type);
        objectA.norm();
        System.out.println(objectA.getInfo());
        System.out.println("\n");

        Apple objectB = new Apple(type2,5);
        System.out.println(objectB.getInfo());

        Apple objectC = new Apple(EnumTaste.YES,type2,12);
        System.out.println(objectC.getInfo());



    }
}
