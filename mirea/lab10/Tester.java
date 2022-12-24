package ru.mirea.lab10;

import java.util.Comparator;

public class Tester implements Comparator<Student> {
    public static void main(String[] args){
        Student[] IDNumber = new Student[]{};
        //IDNumber = setArrray()
    }

    /*
    public Student[] setArrray(Student[] IDNumber){
        IDNumber
    }
*/
    public int compare(Student a, Student b){
        if (a.getGPA() > b.getGPA())
            return 1;
        else if (a.getGPA() < b.getGPA())
            return -1;
        else
            return 0;
    }
}




class Student{
    int GPA;
    String name;
    String surname;
    String speciality;
    int year;
    String group;

    public int getGPA() {
        return GPA;
    }
    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getSpeciality() {
        return speciality;
    }
    public int getYear() {
        return year;
    }
    public String getGroup() {
        return group;
    }
}