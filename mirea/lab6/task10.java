package ru.mirea.lab6;

import java.util.ArrayList;

public class task10 {


    public static void main(String[] args){

        Shop_int shop_int = new Shopp();
        shop_int.filling_Shop(1);


    }
}

interface Shop_int{
    void filling_Shop(int size);
}
class Shopp implements Shop_int{
    public ArrayList<Computer> computers = new ArrayList<Computer>();

    public void add_computer(Computer computer){
        computers.add(computer);
    }
    public void delete_computer(Computer computer){
        computers.remove(computer);
    }

    @Override
    public void filling_Shop(int size) {
        for (int i = 0; i < size; i++){
            Computer computer = new Computer("fdsf", "fdsfsd", "dsad");
            computers.add(computer);
        }
    }

    public void out_put(){
        for (int i = 0; i < computers.size(); i++){
            System.out.println(computers.get(i));
        }
    }





}
class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Computer.Computer_name name;

    public Computer(String processor, String memory, String monitor){
        this.processor.setProcessor_name(processor);
        this.memory.setMemory_name(memory);
        this.monitor.setMonitor_name(monitor);
    }

    public void setName(Computer_name name) {
        this.name = name;
    }

    private enum Computer_name {
        APPLE,
        MICRO,
        RAZER,
        ASOS
    }

}
class Processor {
    String processor_name;
    public void setProcessor_name(String processor_name) {
        this.processor_name = processor_name;
    }
}

class Memory {
    String memory_name;
    public void setMemory_name(String memory_name) {
        this.memory_name = memory_name;
    }
}

class Monitor {
    String monitor_name;
    public void setMonitor_name(String monitor_name) {
        this.monitor_name = monitor_name;
    }
}