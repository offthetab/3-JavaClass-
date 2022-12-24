package ru.mirea.lab14;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static ArrayList<String> find_prices(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> price_list = new ArrayList<>();
        while (m.find()){
            price_list.add(m.group());
        }
        return price_list;
    }
    public static void main(String[] args){
        System.out.println(find_prices("12.3 RUB,44 ERR, 0.004 EU, 123.3 EUR, 100 USD"));
    }
}
