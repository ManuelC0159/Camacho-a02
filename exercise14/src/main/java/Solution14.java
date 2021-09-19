/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */


import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double tax = 5.5/100;

        System.out.println("What is the order amount?");
        double amount = Double.parseDouble(input.nextLine());

        System.out.println("What is the State? ");
        String state = input.nextLine();


        double taxTotal = amount;
        System.out.printf("The sub total is %.2f", amount);
        if(state.equals("WI")){
            double taxSub = tax*amount;
            taxTotal = taxSub+amount;
            System.out.printf("\nThe tax is $%.2f", taxSub);
        }
        System.out.printf("\nThe total is $%.2f", taxTotal);
    }
}
/*
* PseudoCode
* Get amount from user
* Get state from user
* Make if statement that compares state from user to "WI"
* If state input is the same as "WI" find the amount taxed, tax rate is 5.5%
*   ((5.5)/100)*amount = taxed amount
*   print the taxed amount
* print total
* */