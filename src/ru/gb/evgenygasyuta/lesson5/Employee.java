package ru.gb.evgenygasyuta.lesson5;

public class Employee {
    private String name;
    private String position;
    private int age;
    private int phone;
    private double salary;


    public Employee(String name, String position, int age, int phone, double salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }
    public void inf(){
        System.out.println("Сотрудник :" + name + "\nДолжность :" + position + "\nТелефон :" + phone + "\nВозраст :" + age);
    }

    public int getAge(){
        return age;
    }
}
