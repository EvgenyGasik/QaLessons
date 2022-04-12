package ru.gb.evgenygasyuta.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void addFood(int ammount){
        if (ammount < 0){
            return;
        }else {
            food += ammount;
        }
    }
    public boolean decreaseFood(int ammount){
        if (ammount > food){
            return false;
        } else {
            food -=ammount;
            return true;
        }
    }
    public int getFood() {

        return food;
    }

    public void setFood(int food) {

        this.food = food;
    }
}
