/*
 *  UCF COP3330 Summer 2021 Assignment 6
 *  Copyright 2021 Steven Ortiz
 */

//What is your current age? 25
//At what age would you like to retire? 65
//You have 40 years left until you can retire.
//It's 2015, so you can retire in 2055.

package org.example;

import java.util.Scanner;
import java.time.LocalDate;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int ageint = ageint();
        int retireageint =  retireageint();
        int yearint = currentDate();


        int retireyears = retireageint - ageint;
        int retireyearint = yearint + retireyears;

        System.out.println("You have "+retireyears+ " years left until you can retire.");

        System.out.println("It's "+yearint+ ", so you can retire in "+retireyearint+".");

    }


    private static int ageint(){
        System.out.print("What is your current age? ");
        String agestring = in.nextLine();
        int ageint = Integer.parseInt(agestring);
        return ageint;
    }
    private static int retireageint() {
        System.out.print("At what age would you like to retire? ");
        String retireagestring = in.nextLine();
        int retireageint = Integer.parseInt(retireagestring);
        return retireageint;
    }

    private static int currentDate(){

        LocalDate currentDate = LocalDate.now();

        int yearint = currentDate.getYear();

        return yearint;
    }

}
