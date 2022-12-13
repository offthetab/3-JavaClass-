package ru.mirea.lab3.obolochki;



public class task1 {
    public static void main(String[] args){
        Double num = Double.valueOf(12.321);
        System.out.println(num);

        double num1 = num.parseDouble("1.43242");
        System.out.println("String to double: " + num1);

        String num2 = num.toString();
        System.out.println("string " + num2);

        byte num3 = num.byteValue();
        System.out.println("byte: " + num3);

        short  num4 = num.shortValue();
        System.out.println("short: " + num4);

        int num5 = num.intValue();
        System.out.println("int: " + num5);

        long num6 = num.longValue();
        System.out.println("long: " + num6);

        float num7 = num.floatValue();
        System.out.println("float: " + num7);

        double num8 = num.doubleValue();
        System.out.println("double: " + num8);

        String d = Double.toString(3.14);
        System.out.println("double to String: " + d);
    }
}
