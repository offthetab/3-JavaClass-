package ru.mirea.lab2.task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Author auth = new Author("none", "none", '-');
        System.out.println(auth.getName() + "   " + auth.getEmail() + "    " + auth.getGender());

        System.out.println("Enter your email");
        auth.setEmail(input.nextLine());
        System.out.println(auth.getName() + "   " + auth.getEmail() + "    " + auth.getGender());

    }
}
