package ru.gb.evgenygasyuta.lesson7;

public class HomeworkApp7 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("tom", 40);
        Cat cat2 = new Cat("Barsik",60);

        Plate plate = new Plate(150);

        cat1.toEat(plate);
        cat2.toEat(plate);
        System.out.println(plate.getFood());

    }
}
