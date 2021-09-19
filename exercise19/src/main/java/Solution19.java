/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */


import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //bmi = (weight / (height × height)) * 703
        double weight;
        double height;
        while(true){
            System.out.println("Enter weight in pounds: ");
            try {
                weight = Double.parseDouble(input.nextLine());
                break;
            }catch(NumberFormatException ignore){
                System.out.println("Invalid input");
            }
        }
        while(true){
            System.out.println("Enter height in inches: ");
            try {
                height = Double.parseDouble(input.nextLine());
                break;
            }catch(NumberFormatException ignore){
                System.out.println("Invalid input");
            }
        }
        double BMI = (weight/(height*height))*703;

        if(BMI <18.5){
            System.out.println("You are underweight");
        }
        else if(BMI >25){
            System.out.println("You are overweight");
        }
        else{
            System.out.println("You are within the ideal weight range");
        }


    }

}
/*
* PseudoCode
* Get weight in pounds from user
* If user input was not a double, ask again
* Get height in inches from user
* If user input was not a double, ask again
* Find BMI by doing BMI = (weight/height^2)*703
* If BMI is less than 18.5 print user is underweight
* if BMI is more than 25 print user is overweight
* else print user is within ideal weight range
* */