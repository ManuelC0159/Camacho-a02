/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */



import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.println("What is the rate");
        double ratePercentage = input.nextDouble();

        System.out.println("What is the number of years");
        double years = input.nextDouble();

        System.out.println("What is the number of times the interest is compounded per year?");
        int compound = input.nextInt();


        double rate = ratePercentage/100;

        //A = P(1 + r/n)^(n*t)
        double equation1 =(1+(rate/compound));
        double equation2 = compound*years;
        double compoundInterest = principal*(Math.pow(equation1,equation2));

        System.out.printf("$%.2f invested at %.2f%% for %.2f years compounded %d times per year is $%.2f", principal, ratePercentage, years, compound, compoundInterest);

    }
}

/*
* PseudoCode
* Get principal amount from user
* Get rate from user
* Get time from user
* Get times compounded per year
* Use A=P(1+r/n)^(n*t) to find compounded interest
* Print data for user
* */
