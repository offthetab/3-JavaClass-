package ru.mirea.lab3.MathAndRandom;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static int[] random_array_Random(int n){
        Random rand = new Random(); // объект класса Random для ген случ чисел
        int[] random_array = new int[n];
        for(int i = 0; i < n; i++){
            random_array[i] = rand.nextInt(1000);
        }

        return random_array;
    }

    public static double[] random_array_Math(int n){
        double[] random_array = new double[n];
        for(int i = 0; i < n; i++){
            random_array[i] = Math.random();
        }
        return random_array;
    }

    public static void array_output(int[] array){
        System.out.println("Массив целых чисел (Random)");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "   ");
        }
        System.out.println("\n");
    }
    public static void array_output(double[] array){
        System.out.println("Массив вещ. чисел (Math)");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "   ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во элементов в матрице");
        int n = input.nextInt();
        array_output(random_array_Random(n));

        array_output(random_array_Math(n));


    }
}
