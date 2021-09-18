/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double ratePercentage  = input.nextDouble();

        System.out.println("Enter the number of years: ");
        double time = input.nextDouble();

        double rate = ratePercentage/100;

        double investment = principal*(1+(rate*time));

        System.out.printf("After %.2f years at %.2f%%, the investment will be worth $%.2f", time, ratePercentage, investment);
    }
}
/*
* PseudoCode
* Get the principal amount from user
* Get the interest rate percentage from user
* Get number of years from user
* Divide percentage rate by 100 to get decimal that can be used for math
* Find investment by using equation P(1+rt)
* Print results to user
* */