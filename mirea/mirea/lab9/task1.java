package ru.mirea.lab9;

public class task1 {
    public static void main(String[] args){
        Student student = new Student("PAUL", 1);
        Student student1 = new Student("fsd", 12);
        Student[] Str = new Student[]{student, student1};

        for (int i = 0; i < Str.length; i++){
            System.out.println(Str[i].name + "  " + Str[i].IDNumber);
        }

    }
    public static class Student {
        String name;
        int IDNumber;

        public Student(String name, int IDNumber) {
            this.IDNumber = IDNumber;
            this.name = name;
        }
    }
    public static class Students_array{
        int n;
        String[] names = new String[n];
        int[] IDs = new int[n];

        public Students_array(Student[] students){
            this.n = students.length;
            for (int i = 0; i < students.length; i++){
                this.names[i] = students[i].name;
                this.IDs[i] = students[i].IDNumber;
            }
            //Insertion_Sort(this.IDs);
        }
        public void Insertion_Sort(Comparable[] IDs){

        }
    }
}

