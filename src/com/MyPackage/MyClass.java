package com.MyPackage;

import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MyClass {
    private static Scanner input;

    public static void main(String[] args) {

        // Branching assignement 1.2.
        int time = 100;
        if (time < 12 && time >= 8) {
            System.out.println("Good Morning Sunshine!");
        } else if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon. Work Hard!");
        } else if (time >= 20 && time <= 24) {
            System.out.println("Good evening. Get some rest!");
        } else if (time < 0) {
            System.out.println("Wrong! Clock hours can not be less than zero");
        } else if (time > 24) {
            System.out.println("Wrong! Clock hours can not be more than twenty-four");
        }

        // Branching assignement 1.3.
        Scanner input = new Scanner(System.in);
        {
            System.out.print("Please enter the day: ");
        }
        int day = input.nextInt();
        {
            System.out.print("Please enter the month: ");
        }
        int month = input.nextInt();
        {
            System.out.print("Please enter the year: ");
        }
        int year = input.nextInt();
        {
            System.out.print("Please select date format: 1 - YYYY/MM/DD 2 - YYYY.MM.DD: ");
        }
        int format = input.nextInt();
        if ((day < 1 || day > 31) || (month < 1 || month > 12) || year > 2021) {
            System.out.println("Wrong date!");
        } else if (format == 1) {
            System.out.println("Your Date is: " + year + "/" + month + "/" + day);
        } else {
            System.out.println("Your Date is: " + year + "." + month + "." + day);


        }



    }
}












