package ru.mirea.lab3.format;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Currency_Converter {
    private double USD_RUB_currency = 61.5343;
    private double EUR_RUB_currency = 61.1328;
    private double USD_EUR_currency = USD_RUB_currency / EUR_RUB_currency;
    private String value1; // название 1 валюты (нач)
    private String value2; // название 2 валюты (в которую перевести)
    private double amount; // кол-во валюты для конвертации

    public Currency_Converter(String value1, String value2, double amount){
        this.value1 = value1;
        this.value2 = value2;
        this.amount = amount;
    }
    public double convert(){
        if(value1.matches(("(.*)RUB"))){
            if(value2.matches("USD"))
                return amount * (1.0 / USD_RUB_currency);
            else if(value2.matches("EUR"))
                return amount * (1.0 / EUR_RUB_currency);
            else
                return amount;
        }
        else if(value1.matches("(.*)USD")){
            if(value2.matches("RUB"))
                return amount * USD_RUB_currency;
            else if(value2.matches("EUR"))
                return amount * USD_EUR_currency;
            else
                return amount;
        }
        else{
            if(value2.matches("RUB"))
                return amount * EUR_RUB_currency;
            else if(value2.matches("USD"))
                return amount * (1.0 / USD_EUR_currency);
            else
                return amount;
        }
    }

    public static String converted_to_locale(double amount, String curr){
        Locale US = Locale.US;
        NumberFormat us = NumberFormat.getCurrencyInstance(US);

        Locale FR = Locale.FRANCE;
        NumberFormat fr = NumberFormat.getCurrencyInstance(FR);

        Locale russian = new Locale("ru", "RU");
        NumberFormat ru = NumberFormat.getCurrencyInstance(russian);

        if(curr.matches("RUB") || (curr.matches("RU")))
            return ru.format(amount);
        else if(curr.matches("USD") || (curr.matches("US")))
            return us.format(amount);
        else
            return fr.format(amount);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\n" + "Введите сумму для перевода и в какой валюте. Пример ввода: 100RUB");
        System.out.println("Доступны 3 валюты: 'RUB', 'USD', 'EUR'");
        String value1;
        while(true) {   // Ввод суммы и валюты (1000RUB, 0.12312RUB и тд)
            value1 = input.nextLine();
            if (value1.matches("\\d+\\w{3}") | value1.matches("\\d+\\.{1}\\d+\\w{3}"))
                if (value1.matches("(.*)RUB|(.*)USD|(.*)EUR")) {
                    break;
                }
                else
                    System.out.println("Валюта указана неверно!");
            else
                System.out.println("Некорректный ввод!");
        }

        String value2;
        System.out.println("Введите назание валюты, в которую надо перевести (RUB, USD, EUR)");
        while (true){
            value2 = input.nextLine();
            if(value2.matches("RUB") | value2.matches("USD") | value2.matches("EUR"))
                break;
            else
                System.out.println("Такой валюты нет!");
        }

        double amount = Double.parseDouble(value1.substring(0, value1.length()-3));
        Currency_Converter conv = new Currency_Converter(value1, value2, amount);

        String result = converted_to_locale(conv.convert(), value2);    // после конвертации и форматированное под локаль

        String value1_currency = value1.substring(value1.length()-3,value1.length()-1); // начальная валюта
        String value1_form = converted_to_locale(amount, value1_currency);  // фомратирование нач валюты под локаль

        System.out.println(value1_form + " = " + result);



    }
}
