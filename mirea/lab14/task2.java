package ru.mirea.lab14;

public class task2 {
    public static boolean isStr(String str){  // определяет явл ли строка строкой "abcdefghijklmnopqrstuv18340"
        return str.equals("abcdefghijklmnopqrstuv18340");
    }
    public static void main(String[] args){
        System.out.println(isStr("fdsfsfd"));   // false

        System.out.println(isStr("abcdefghijklmnopqrstuv18340"));   // true
    }
}
