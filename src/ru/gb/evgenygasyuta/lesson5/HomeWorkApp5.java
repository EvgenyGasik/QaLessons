package ru.gb.evgenygasyuta.lesson5;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        // Employee employee1 = new Employee("Victor", "manager", 30, 45-12-12,35000.00);
        // employee1.inf();

        Employee[] arrEmpl = new Employee[5];
        arrEmpl[0] = new Employee("Maxim","CEO",45,450101,100000.00);
        arrEmpl[1] = new Employee("Oleg","Manager",32,450111,45000.00);
        arrEmpl[2] = new Employee("Natasha","Secretary",25,450112,40000.00);
        arrEmpl[3] = new Employee("Igor","IT",30,450110,60000.00);
        arrEmpl[4] = new Employee("Elena","Accountant",41,450245,55000.00);

        for (int i = 0; i < arrEmpl.length; i++) {
            if(arrEmpl[i].getAge() > 40) arrEmpl[i].inf();
        }
    }
}
