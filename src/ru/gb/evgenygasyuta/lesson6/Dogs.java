package ru.gb.evgenygasyuta.lesson6;

public class Dogs extends Animals {
    public Dogs (String name){
        this.name = name;
    }

    @Override
    public void toRun(int distance) {
        maxRun = 500;
        if (distance >= maxRun){
            System.out.println("Dog " + name + " cant run this distance - " + distance);
        } else {
            System.out.println("Dog " + name + " runs " + distance);
        }

    }

    @Override
    public void toSwim(int distance) {
        maxSwim = 10;
        if (distance >= maxSwim) {
            System.out.println("Dog " + name + "cant swim this distance : " + distance);
        } else {
            System.out.println("Dog " + name + " runs " + distance);

        }

    }

}
