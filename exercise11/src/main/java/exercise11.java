/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging? ");
        double euros = input.nextDouble();
        System.out.println("What is the exchange rate? ");
        double exchangeRate = input.nextDouble();

        double uS = exchangeRate*euros;

        System.out.printf(euros+" euros at an exchange rate of "+exchangeRate+" is %.2f", uS);

    }

}
/*
* PseudoCode
* Get number of euros from user
* Get exchange rate from user
* Find US dollars by multiplying exchange rate by euros
* Print statement to user, use %.2f to ensure that it only prints 2 decimal places for currency
* */