package ru.gb.evgenygasyuta.lesson7;

public class Cat {
    private static int countOfCat = 0;
    private String name;
    private int appetit;
    private boolean fullOrNot;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        countOfCat++;
    }
    public void toEat(Plate plate){
        plate.setFood(plate.getFood() - appetit);
    }

    public String getName(){
        return name;
    }
    public static int getCountOfCat(){
        return countOfCat;
    }
}
