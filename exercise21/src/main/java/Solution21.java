
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of the month: ");
        int month = input.nextInt();

        String monthString;

        switch(month){
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println("The name of the month is "+monthString);
    }
}
/*
* PseudoCode
* Prompt user for number of month
* get int from user
* Switch statement where each case represents a month
* Case 1 would be for month 1, january
* Continue till month 12 december
* default = invalid month
* print results to user
* */