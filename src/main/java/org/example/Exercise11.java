/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 11 - Currency conversion

package org.example;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        //Read in euros and find out the exchange rate
        Scanner getNumbers = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        Integer euros = getNumbers.nextInt();
        System.out.print("What is the exchange rate? ");
        double exchange_rate = getNumbers.nextDouble();

        //Calc & print out totals
        double total_us = euros*exchange_rate;
        System.out.println(euros+ " euros at an exchange rate of " +exchange_rate+ " is");
        System.out.println(String.format("%.02f U.S. dollars.", total_us));
    }
}
