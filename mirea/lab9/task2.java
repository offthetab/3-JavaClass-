package ru.mirea.lab9;

import java.util.Comparator;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        System.out.println("Введите кол-во учеников");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Student_a[] students = new Student_a[n];

        System.out.println("Вводите сначала GPA потом ID");
        for (int i = 0; i < n; i++){
            System.out.println("Введите GPA");
            int GPA = input.nextInt();
            System.out.println("Введите ID");
            int ID = input.nextInt();
            Student_a temp = new Student_a(GPA, ID);
            students[i] = temp;
        }


        SortingStudentsByGPA.sort(students, 0, students.length - 1);

        for (int i = 0; i < n; i++){
            System.out.println(students[i].toString());
        }

    }
}

class SortingStudentsByGPA{

    public static void sort(Student_a[] list, int low, int high){
        StudentsComparator studentsComparator = new StudentsComparator();

        if (list.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        Student_a border = list[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (studentsComparator.compare(list[i], border) == -1) i++;
            while (studentsComparator.compare(list[j], border) == 1) j--;
            if (i <= j) {
                Student_a swap = list[i];
                list[i] = list[j];
                list[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) sort(list, low, j);
        if (high > i) sort(list, i, high);
    }
}

class StudentsComparator implements Comparator<Student_a> {
    public int compare(Student_a a, Student_a b){
        if (a.getGPA() > b.getGPA())
            return 1;
        else if (a.getGPA() < b.getGPA())
            return -1;
        else
            return 0;
    }
}
class Student_a{
    private int ID;     // ID студента
    private int GPA;    // итоговый балл
    public Student_a(int GPA, int ID){
        this.ID = ID;
        this.GPA = GPA;
    }

    public int getID() {
        return ID;
    }
    public int getGPA() {
        return GPA;
    }

    public String toString(){
        return "{ID: " + ID + ",    GPA: " + GPA + "}";
    }
}