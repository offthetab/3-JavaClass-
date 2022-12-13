package ru.mirea.lab2.task2;

import java.util.Scanner;
import java.util.ArrayList;

public class Shop {
    Scanner input = new Scanner(System.in);
    private int n;
    private ArrayList<String> list = new ArrayList<String>();

    public Shop(int n){
        this.n = n;
        for(int i = 0; i < n; i++){
            System.out.println("Введите название компьютера " + (i + 1));
            String comp = input.nextLine();
            list.add(comp);
        }
    }
    public void add_comp(){
        System.out.println("Введите название к-ра для добавления в базу");
        String id = input.nextLine();
        list.add(id);
    }

    public void delete_comp(){
        System.out.println("Введите название к-ра для удаления из базы");
        String id = input.nextLine();
        if(list.contains(id)) {
            System.out.println(id + " Удален");
            list.remove(id);
        }
        else{
            System.out.println(id + " Не найден");
        }
    }

    public void find_comp(){
        System.out.println("Введите название, чтобы проверить наличие в базе");
        String id = input.nextLine();
        if(list.contains(id))
            System.out.println(id + " found in list");
        else
            System.out.println(id + " not found in list");
    }

}
