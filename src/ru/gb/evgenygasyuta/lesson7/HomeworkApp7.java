package ru.gb.evgenygasyuta.lesson7;

public class HomeworkApp7 {
    public static void main(String[] args) {
        Plate plate = new Plate(45);

        Cat[] cats = new Cat[]{
          new Cat("Tom", 15),
          new Cat("Kitty", 20),
          new Cat("Sweety", 45)
        };
        for(Cat cat:cats){
            cat.toEat(plate);
            if (cat.isFull()){
                System.out.println(cat.getName() + " is full");

            } else {
                System.out.println(cat.getName() + " is Not full");
            }
        }
        plate.addFood(20);


    }
}
