package ru.mirea.lab3.MathAndRandom;

import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static int[] random_array_Random(int n){
        Random rand = new Random(); // объект класса Random для ген случ чисел
        int[] random_array = new int[n];
        for(int i = 0; i < n; i++){
            random_array[i] = rand.nextInt(10, 100);
        }

        return random_array;
    }

    public static boolean if_strictly_increasing(int[] array){  // проверяет явл ли последовательность строго возрастающей
        boolean result = true;
        for(int i = 1; i < array.length; i++){
            if(array[i] > array[i-1])
                continue;
            else{
                result = false;
                break;
            }
        }
        return result;
    }

    public static void array_output(int[] array){
        System.out.println("Массив целых чисел от 10 до 99");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "   ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Кол-во элементов в матрице: 4");
        int[] array = random_array_Random(4);
        array_output(array);
        if(if_strictly_increasing(array))
            System.out.println("Строго возрастающая последовательность");
        else
            System.out.println("Не строго возрастающая последовательность");
    }
}
