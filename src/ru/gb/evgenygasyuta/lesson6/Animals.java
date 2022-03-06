package ru.gb.evgenygasyuta.lesson6;

public abstract class Animals {
    String name;
    int maxRun = 0;
    int maxSwim = 0;

    public abstract void toRun(int distance);
    public abstract void toSwim(int distance);

}
