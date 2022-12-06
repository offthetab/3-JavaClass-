package ru.mirea.lab11;

import java.util.Date;

public class task1 {
    public static void main(String[] args){
        String developer_surname = "Gromov";

        Date Work_date = new Date(1662121212121L);

        Date Dated = new Date();

        System.out.println("Фамилиия разработчика: " + developer_surname);
        System.out.println("Дата получения работы: " + Work_date);
        System.out.println("Дата сдачи работы: " + Dated);
    }
}
