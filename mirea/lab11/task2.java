package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class task2 {
    public static void main(String[] args){

        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");

        Calendar calendar = new GregorianCalendar();
        System.out.println("Текущая дата: " + format1.format(calendar.getTime()));

        Calendar second_calendar = new GregorianCalendar();
        second_calendar.set(Calendar.YEAR, 2022);
        second_calendar.set(Calendar.MONTH, 10);
        second_calendar.set(Calendar.DAY_OF_MONTH, 23);
        System.out.println("Пользовательская дата: " + format1.format(second_calendar.getTime()));

        if(calendar.after(second_calendar))
            System.out.println("Пользовательская дата раньше");
        else
            System.out.println("Системная дата раньше");


    }
}
