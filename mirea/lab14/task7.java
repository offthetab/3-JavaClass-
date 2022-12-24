package ru.mirea.lab14;

import java.util.regex.Pattern;

public class task7 {
    public static boolean is_reliable(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }
    public static void main(String[] args){
        System.out.println(is_reliable("F032_Password"));

        System.out.println(is_reliable("smart_pass"));
        System.out.println(is_reliable("A007"));
    }
}
