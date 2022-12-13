package ru.mirea.lab9;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Введитее кол-во студентов");

        int n = input.nextInt();    // кол-во студентов
        System.out.println("Вводите ID студентов по-порядку");
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++){    // input in array
            Student temp = new Student(input.nextInt());
            students[i] = temp;
        }
        Sorting.sort(students);

        System.out.println("Отсортированный массив");   // вывод сортированного массива
        for (int i = 0; i < n; i++){
            System.out.print(students[i].getID() + "   ");
        }
    }
}

class Sorting{
    public static void sort(Comparable[] list){     // сортировка вставками
        for (int i = 1; i < list.length; i++) {
            int j;
            //сохраняем ссылку на индекс предыдущего элемента
            Comparable swap = list[i];
            for (j = i; j > 0 && swap.compareTo(list[j -1]) == -1; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                list[j] = list[j - 1];
            }
            list[j] = swap;
        }
    }
}

class Student implements Comparable<Student>{

    private int ID;
    Student(int ID){

        this.ID = ID;
    }
    int getID(){return ID;}

    public int compareTo(Student p){
        if(ID > p.getID())
            return 1;
        else if(ID < p.getID())
            return -1;
        else
            return 0;
    }
}


