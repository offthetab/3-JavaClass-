package ru.mirea.lab7;

public class task4 {
    public static void main(String[] args){
        MathCalculable mathCalculable = new MathFunc();
        double abs = mathCalculable.abs_complex(3, 4);
        System.out.println("Модуль комп. числа равен: " + abs);

        mathCalculable.pow_complex(123, 321);
        MathCalculable.circle_length(3);
    }
}

interface MathCalculable{
    double PI = 3.14;
    double pow_complex(double a, double b);
    double abs_complex(double a, double b);

    public static double circle_length(double radius){
        return 2 * PI * radius;
    }
}
class MathFunc implements MathCalculable{

    @Override
    public double pow_complex(double a, double b){    // возведение компексного числа в н-ую степень
        return 123;
    }
    @Override
    public double abs_complex(double a, double b){    // модуль комплексного числа
        return Math.sqrt(a * a + b * b);
    }
}
