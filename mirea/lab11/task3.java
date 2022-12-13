package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args){

        System.out.println("Введите дату в соответствии с одним из форматов");
        System.out.println("Краткий формат dd/MM/yyyy (прим. 23/10/2003)");
        System.out.println("Средний формат dd/MMM/yy (прим. 20/Dec/18)");
        System.out.println("Длинный формат dd.MM.yyyy HH:mm:ss (прим. 12.11.2001 13:34:59)");

        Scanner input = new Scanner(System.in);

        Student pavel = new Student();
        pavel.setDate_of_birth(input.nextLine());

        System.out.println(pavel.toString());
    }
}

class Student{
    public Date date = new Date();
    private SimpleDateFormat format = new SimpleDateFormat();
    private boolean for_output = true;
    public void setDate_of_birth(String s){
        try{
            // 23/10/2003
            format = new SimpleDateFormat("dd/MM/yyyy");
            date = format.parse(s);
            //date  = new SimpleDateFormat("dd/MM/yyyy").parse(s);    // проверка на краткий формат ввода
        }
        catch (Exception e1){
            try {
                // 20/Dec/18
                format = new SimpleDateFormat("dd/MMM/yy", Locale.ENGLISH);
                date = format.parse(s);
                //date  = new SimpleDateFormat("dd/MMM/yy", Locale.ENGLISH).parse(s);    // проверка на средний формат ввода
            }
            catch (Exception e2){
                try {
                    // 12.11.2001 13:34:59
                    format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                    date = format.parse(s);
                    //date  = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").parse(s);    // проверка на полный формат ввода
                }
                catch (Exception e3){
                    System.out.println("Не правильный формат ввода");
                    for_output = false;
                    return;
                }
            }
        }
    }

    @Override
    public String toString(){
        System.out.println("\n" + "Вызов метода toString");
        if (for_output)
            return "{Object date of birth: " + format.format(date) + "}";
        else
            return "Не правильный формат ввода :(";
    }

}
