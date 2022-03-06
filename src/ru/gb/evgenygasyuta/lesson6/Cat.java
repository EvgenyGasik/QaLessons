package ru.gb.evgenygasyuta.lesson6;

public  class Cat extends Animals {
    public Cat(String name){
        this.name=name;
    }

    @Override
    public void toRun(int distance) {
        maxRun=200;
        if(distance >= maxRun){
            System.out.println("Cat " + name + " cant run distance - " + distance);
        } else {
            System.out.println(" Cat " + name + " runs " + distance);
        }

    }

    @Override
    public void toSwim(int distance) {
        System.out.println("Cats dont swim");

    }
}
