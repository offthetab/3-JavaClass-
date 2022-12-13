package ru.mirea.lab13;

public class task4 {
    public static void main(String[] args){





        String[] str = new String[]{"S001,Black Polo,Black,XL", "S0002,White T-Shirt,White,L", "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL", "S006,Black T-Shirt,Black,XL", "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L", "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"};
        Shirt[] shirts = new Shirt[str.length];

        System.out.println("Заполнение массива Shirts..." + "\n");  // заполнение массива shirts строками из str
        for (int i = 0; i < str.length; i++) {
            shirts[i] = new Shirt(str[i]);
        }

        System.out.println("Вывод массива Shirts:");    // вывод массива Shirts
        for (int i = 0; i < shirts.length; i++) {
            System.out.println(shirts[i].toString());

        }

    }
}
class Shirt{
    String id;
    String name;
    String color;
    String size;
    public Shirt(String str){
        String[] arr = str.split(",");
        id = arr[0];
        name = arr[1];
        color = arr[2];
        size = arr[3];
    }

    @Override
    public String toString(){
        return new StringBuilder().append("\n").append(id).append("\n").append(name).append("\n").append(color).append("\n").append(size).toString();
    }
}