/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = input.nextDouble();

        System.out.println("Enter the third number: ");
        double thirdNumber = input.nextDouble();

        if(firstNumber != secondNumber && firstNumber !=thirdNumber && secondNumber != thirdNumber){
            if(firstNumber > secondNumber && firstNumber > thirdNumber){
                System.out.println("The largest number is "+firstNumber);
            }
            else if(secondNumber > firstNumber && secondNumber > thirdNumber){
                System.out.println("The largest number is "+secondNumber);
            }
            else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
                System.out.println("The largest number is "+thirdNumber);
            }
        }
    }

}

/*
* PseudoCode
* Get first number from user
* Get second number from user
* Get third number from user
* Use if statement to compare all inputs to make sure they are different
* If true, do another if statement to check if first input is biggest, if yes, print first input
* If first statement fails, if else  check second number to see if it is the biggest, if it is, print second number
* Repeat for third number
* 
* */
