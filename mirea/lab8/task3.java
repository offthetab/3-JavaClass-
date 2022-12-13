package ru.mirea.lab8;

public class task3 {
    public static void recurtion(int a, int b){
        if (a == b){
            System.out.print(a);
            return;
        }
        else if (a < b){
            System.out.print(a + " ");
            recurtion(a + 1, b);
        }
        else{
            System.out.print(b + " ");
            recurtion(a, b + 1);
        }

    }
    public static void main(String[] args){
        recurtion(0, 0);
    }
}
