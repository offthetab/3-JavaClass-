package ru.mirea.sadsa;

import java.util.Scanner;

public class task1 {

    public static void output(int[][] arr){     // ВЫвод массива
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[][] power(int[][] matrix, int n) {     // матрица в степень
        int[][] output = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                output[i][j] = (int) Math.pow(matrix[i][j], n);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int n = 2;
        int[][] arr = new int[n][n];

        Scanner input = new Scanner(System.in);

        System.out.println("заполнение массива");
        for (int i = 0; i < n; i++){    // заполнение массива
            for (int j = 0; j < n; j++){
                System.out.println("(" + i + ", " + j + ")");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("S");
        output(arr);

        System.out.println("S2");
        output(power(arr, 2));
        System.out.println("S3");
        output(power(arr, 3));
    }
}
