package ru.mirea.lab6;

public class task6_9 {
    public static void main(String[] args){

        Printable[] printables = new Printable[]{new Book("Война и мир"), new Shop("Наука и техника")};
        for (int i = 0; i < 2; i++){
            printables[i].print();
        }
    }
}
interface Printable{
    void print();
}
class Book implements Printable{
    String name;
    Book(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Книга - " + name);
    }
}
class Shop implements Printable{
    String name;
    Shop(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Журнал - " + name);
    }
}