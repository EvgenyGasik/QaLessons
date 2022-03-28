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
    public boolean isFull(){
        return fullOrNot;
    }
    public void toEat(Plate plate){
        if (plate.decreaseFood(appetit)){
            System.out.println(name + " is to eat");
            fullOrNot = true;
        }else {
            System.out.println(name + " is Not eat");
        }
    }

    public String getName(){
        return name;
    }
    public static int getCountOfCat(){
        return countOfCat;
    }
}
