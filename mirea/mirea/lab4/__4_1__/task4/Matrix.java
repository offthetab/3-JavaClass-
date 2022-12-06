package ru.mirea.lab4.__4_1__.task4;

import java.util.Scanner;

public class Matrix {
    private int n;
    private int m;
    private double[][] matrix;
    Scanner input = new Scanner(System.in);

    public Matrix(){
        System.out.print("Кол-во строк: ");
        n = input.nextInt();
        System.out.print("Кол-во столбцов: ");
        m = input.nextInt();

        matrix = new double[n][m];

        System.out.println("Заполняем матрицу: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("(" + i + ", " + j + ") = ");
                matrix[i][j] = input.nextDouble();
            }
        }
    }
    private Matrix(int n, int m){
        this.n = n;
        this.m = m;
        matrix = new double[n][m];
    }

    public Matrix matrix_addition(Matrix matrix1){
        Matrix result = new Matrix(n, m);
        if (n == matrix1.n & m == matrix1.m){
            System.out.println("Выполняю сложение...");
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    result.matrix[i][j] = this.matrix[i][j] + matrix1.matrix[i][j];
                }
            }
        }
        else{
            System.out.println("У матриц разные размерности! нельзя выполнить сложение");
        }
        return result;
    }

    public Matrix matrix_num_multiply(int n){
        System.out.println("Умножаю матрицу на " + n);
        Matrix result = new Matrix(n, m);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                result.matrix[i][j] = n * this.matrix[i][j];
            }
        }
        return result;
    }

    public void matrix_output(){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
