package ru.mirea.lab1;
/*
// ЗАДАНИЕ 3
public class task1{
    public static void main(String[] args){
        System.out.println("Данный массив задается инициализацией");
        int[] mat = new int[]{1, 2, 3, 4, 5, 6};
        double s = 0;
        for(int i = 0; i < mat.length; i++){
            s += mat[i];
        }
        double median = s / mat.length;
        System.out.print("Сумма элементов массива: ");
        System.out.println(s);
        System.out.print("Среднее арифметическое массива: ");
        System.out.println(median);
    }
}
 */

/*
// ЗАДАНИЕ 4
import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] mat = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
             mat[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        int min = mat[0];
        int max = mat[0];
        int sum = 0;
        int i = 0;
        while(i != size){
            sum += mat[i];
            if (mat[i] < min)
                min = mat[i];
            if (mat[i] > max)
                max = mat[i];
            i += 1;
        }
        System.out.print("sum = ");
        System.out.println(sum);
        System.out.print("min = ");
        System.out.println(min);
        System.out.print("max = ");
        System.out.println(max);

    }
}

*/

/*
//ЗАДАНИЕ 5
public class task1{
    public static void main(String[] args){


        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
*/


/*
//ЗАДАНИЕ 6
public class task1{
    public static void main(String[] args){
        for(float i = 1; i <= 10; i++){
            System.out.println(1/i);
        }
    }
}
*/

/*
//ЗАДАНИЕ 7
import java.util.Scanner;

public class task1{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите любое положительное целое число для подсчета его факториала");
        int n = input.nextInt();
        System.out.println("Факториал " + n + " равен: " + factorial(n));
    }
    public static int factorial(int n){     // Метод подсчета факториала
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
*/