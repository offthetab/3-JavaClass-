package ru.mirea.lab13;

public class task2 {
    public static void main(String[] args){
        Person paul = new Person("", " ", "Serg");
        System.out.println(paul.Get_person());
    }
}
class Person{
    private String Name;
    private String Surname;
    private String Last_name;

    public Person(String Name, String Surname, String Last_name){
        this.Name = Name;
        this.Surname = Surname;
        this.Last_name = Last_name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String Get_person(){
        if (Name.isEmpty())
            return new StringBuilder().append(Surname.charAt(0)).append(".").append(Last_name.charAt(0)).append(".").toString();
        else if (Last_name.isEmpty())
            return new StringBuilder().append(Name).append(" ").append(Surname.charAt(0)).append(".").toString();
        else if(Surname.isBlank())
            return new StringBuilder().append(Name).append(" ").append(Last_name).toString();
        else
            return new StringBuilder().append(Name).append(" ").append(Surname.charAt(0)).append(".").append(Last_name.charAt(0)).append(".").toString();

    }


}
