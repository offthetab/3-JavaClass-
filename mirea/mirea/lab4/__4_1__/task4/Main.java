package ru.mirea.lab4.__4_1__.task4;

public class Main {
    public static void main(String[] args) {
        Matrix mat1 = new Matrix();
        Matrix mat2 = new Matrix();

        mat1.matrix_output();
        mat2.matrix_output();

        Matrix mat3 = mat1.matrix_addition(mat2);
        mat3.matrix_output();

        Matrix mat4 = mat1.matrix_num_multiply(2);
        mat4.matrix_output();


    }
}
