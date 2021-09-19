/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */


import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What  is the order amount? ");
        int orderAmount = input.nextInt();
        input.nextLine();

        System.out.println("What state do you live in?");
        String state = input.nextLine();

        double tax;

        if(state.equals("Wisconsin")){
            System.out.println("What county do you live in?");
            String county = input.nextLine();
            if(county.equals("Eau Claire")){
                tax = 0.005;
            }
            else if(county.equals("Dunn")){
                tax = 0.004;
            }
            else{
                tax = 1;
            }
        }
        else if(state.equals("Illinois")){
             tax = 0.08;
        }
        else{
            tax = 1;
        }
        double orderTax = tax*orderAmount;
        double orderTotal = orderAmount+orderTax;

        System.out.printf("The tax is $%.2f\nThe total is $%.2f", orderTax, orderTotal);

    }
}
