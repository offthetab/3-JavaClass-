package ru.mirea.lab6;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args){
        System.out.print("Введите градусы по Цельсию: ");
        Scanner input = new Scanner(System.in);
        Celcius celcius = new Celcius(input.nextDouble());

        Convertable convertable = new Fahrenheit();
        System.out.println("В Фаренгейтах: " + convertable.convert(celcius));

        convertable = new Kelvin();
        System.out.println("В Кельвинах: " + convertable.convert(celcius));
    }
}
interface Convertable{
    double convert(Celcius celcius);

}
class Celcius {
    double temperature;
    public Celcius(double temperature){
        this.temperature = temperature;
    }

}
class Fahrenheit implements Convertable{
    double temperature;
    @Override
    public double convert(Celcius celcius){
        return celcius.temperature * 1.8 + 32;
    }
}
class Kelvin implements Convertable{
    double temperature;
    public double convert(Celcius celcius){
        return celcius.temperature + 273.15;
    }
}
