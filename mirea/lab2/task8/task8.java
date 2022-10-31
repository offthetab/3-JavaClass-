package ru.mirea.lab2.task8;

public class task8 {
  public static void main(String[] args){

       String[] list = new String[]{"1", "2", "3", "4", "5", "6"};
        int size = list.length;
        output(list);

        int n; // кол-во иттераций
        if(size % 2 == 0)   // определяем четное ли число элементов и переопределяем переменную
            n = size / 2;
        else
            n = size / 2 + 1;

        for(int i = 0; i < n; i++){
            String buffer = list[list.length - 1 - i];
            list[list.length - 1 - i] = list[i];
            list[i] = buffer;
        }
        output(list);

    }
    public static void output(String[] list){   // Функция вывода массива
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + "    ");
        }
        System.out.print("\n");
    }
}
