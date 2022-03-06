package ru.gb.evgenygasyuta.lesson6;

public class HomeWorkApp6 {
    public static void main(String[] args) {

        Animals animals[] = {
                new Cat("Tom"),
                new Dogs("Sharik"),
                new Dogs("Spike"),
                new Cat("Kitty")

        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].toRun(400);
            animals[i].toSwim(5);

        }
    }
}
