package ru.mirea.lab2.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    private int n;
    private ArrayList<Dog> dogs = new ArrayList<Dog>();  // В приюте реализуем массив собак
    public DogKennel(int n){    // конструктор приюта
        this.n = n;
        for(int i = 0; i < n; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Введите имя");
            String name = input.nextLine();
            System.out.println("Введите возраст " + name);
            int age = input.nextInt();
            Dog dog = new Dog(name, age);
            dogs.add(dog);
        }
    }

    public void add_dog(String name, int age){  // метод добавления собаки в приют
        Dog dog = new Dog(name, age);
        dogs.add(dog);
    }

    public static void main(String[] args){
        Dog amen = new Dog("amen", 12);
        Dog raf = new Dog("raf", 3);

        System.out.println(amen.toString());
        System.out.println(raf.toString());

        System.out.println("Введите кол-во собак в приюте");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        DogKennel kennel = new DogKennel(n);
        System.out.println("Введенное пользователем");
        System.out.println(kennel.dogs);

        kennel.add_dog("ADDED", 10);
        System.out.println("Добавленное");
        System.out.println(kennel.dogs);
    }
}
