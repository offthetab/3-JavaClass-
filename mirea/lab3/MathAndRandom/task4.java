package ru.mirea.lab3.MathAndRandom;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    private static boolean isNumber(String str) {   // проверка явл ли строка числом
        return str.matches("-?\\d+");
    }

    private static int[] array_from_0_to_n(int n){  // заполняет массив длинной n числами от 0 до n
        Random random = new Random();
        int [] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = random.nextInt(0, (n + 1));
        }
        return array;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Введите целое число - размер массива");

        while (true) {      // ввод числа >= 0
            String line = input.nextLine();
            if (isNumber(line)) {
                int value = Integer.valueOf(line);
                if (value >= 0) {
                    System.out.println("Правильный ввод");
                    n = value;
                    break;
                } else {
                    System.out.println("Число больше или равное 0");
                }
            } else {
                System.out.println("Вы ввели не число!");
            }
        }
        System.out.println("Размер массива - " + n);
        System.out.println("Заполняю массив длиной n числами от 0 до n");

        int[] array = array_from_0_to_n(n);    // вызов функции заполнения массиа длинной n числами от 0 до n
        for(int i = 0; i < array.length; i++){  // вывод финального массива
            System.out.print(array[i] + "  ");
        }

    }
}
