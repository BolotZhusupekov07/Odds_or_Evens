package com.company;

import java.util.Random;
import java.util.Scanner;

public class Odds_or_Evens {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Let’s play a game called “Odds and Evens”");

        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String your_choice = scan.next();
        String computer_choice = computer_choice(your_choice);
        if (computer_choice.equals("evens")){
            your_choice = "odds";
        } else {
            your_choice = "evens";

        }
        System.out.println(name  + " has picked "
                + your_choice + "! The computer will be " + computer_choice + ".");
        System.out.println("-------------------------------------------------");
        fingers(your_choice, name);
    }
    static String computer_choice(String c){
        String c_c;
        switch (c){
            case "O":
                c_c = "evens";
                break;
            case "E":
                c_c = "odds";
                break;
            default:
                throw new IllegalArgumentException("Unexpected character " + c );
        }
        return c_c;

    }
    static void fingers(String your_choice,  String name){
        System.out.println("How many \"fingers\" do you put out?");
        int yours = scan.nextInt();
        Random random = new Random();
        int comp = random.nextInt(6);
        System.out.println("The computer plays " + comp + " \"fingers\".");
        System.out.println("---------------------------------------------------");
        int sum = yours + comp;
        System.out.println(yours + " + " + comp + " = " + sum);
        if (sum%2==0){
            System.out.println(sum + " is ...evens!");
        } else {
            System.out.println(sum + " is ...odds!");
        }
        who_won(sum, your_choice, name);
    }
    static void who_won(int sum, String yours,String name){
        if (sum%2==0 && yours.equals("evens")){
            System.out.println("That means " + name + " wins! :)");
        } else if (sum%2!=0 && yours.equals("odds")){
            System.out.println("That means " + name + " wins! :)");
        } else {
            System.out.println("That means computer wins! :(");
        }
    }

}
