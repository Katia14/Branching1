package com.MyPackage;

import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.time.YearMonth;


public class MyClass {
    private static Scanner input;

    public static void main(String[] args) {

        // Branching assignment 1.2.
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

        // Branching assignment 1.3.

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

        // Branching assignment 1.4.

        {
            System.out.print("The day number is: ");
        }
        int dayNumber = input.nextInt();

        if (dayNumber >= 334 && dayNumber <= 365) {
            System.out.println("It is December");
        } else if (dayNumber >= 304 && dayNumber <= 333) {
            System.out.println("It is November");
        } else if (dayNumber >= 273 && dayNumber <= 303) {
            System.out.println("It is October");
        } else if (dayNumber >= 243 && dayNumber <= 272) {
            System.out.println("It is September");
        } else if (dayNumber >= 212 && dayNumber <= 242) {
            System.out.println("It is August");
        } else if (dayNumber >= 181 && dayNumber <= 211) {
            System.out.println("It is July");
        } else if (dayNumber >= 151 && dayNumber <= 180) {
            System.out.println("It is June");
        } else if (dayNumber >= 120 && dayNumber <= 150) {
            System.out.println("It is May");
        } else if (dayNumber >= 90 && dayNumber <= 119) {
            System.out.println("It is April");
        } else if (dayNumber >= 59 && dayNumber <= 89) {
            System.out.println("It is March");
        } else if (dayNumber >= 32 && dayNumber <= 59) {
            System.out.println("It is February");
        } else if (dayNumber > 0 && dayNumber <= 31) {
            System.out.println("It is January");

        }

        // Branching assignment alternative 1.4.

        int yearNumber = input.nextInt();
        int monthNumber = input.nextInt();
        YearMonth yearMonthObject = YearMonth.of(yearNumber, monthNumber);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println("Number of days is " + daysInMonth);

        // Branching assignment 1.5.

        System.out.println("Please inter working hours a day: ");
        int workingHoursInDay;
        workingHoursInDay = input.nextInt();
        if (workingHoursInDay < 0 || workingHoursInDay > 24) {
            System.out.println("Wrong working hours! ");
        } else if (workingHoursInDay <= 8) {
            System.out.print("Salary is " + workingHoursInDay * 10);
        } else if (workingHoursInDay > 8) {
            System.out.print("Salary is " + (80 + (workingHoursInDay - 8) * 15));
        }
    }
}












