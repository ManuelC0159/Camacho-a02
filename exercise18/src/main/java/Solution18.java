import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */
public class Solution18 {

    public static void main(String[] args){
        //C = (F − 32) × 5 / 9
        //F = (C × 9 / 5) + 32
        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        String user = input.nextLine();

        System.out.println("Your choice: "+user);
        if(user.equals("C") || user.equals("c")){
            System.out.println("Please enter the temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = (fahrenheit-32)*(5.0/9);
            System.out.println("The temperature in Celsius is "+celsius);
        }
        else {
            System.out.println("Please enter the temperature in Celsius");
            double celsius = input.nextDouble();
            double fahrenheit = (celsius*(9.0/5))+32;
            System.out.println("The temperature in Fahrenheit is "+fahrenheit);
        }
    }
}
/*
* PseudoCode
* Get F or C from user depending on what they want to find the temperature for. F for fahrenheit and C for celsius
* Print the choice the user made
* If the input is = to C or c do C = (F − 32) × 5 / 9 where F is user input
* else do F = (C × 9 / 5) + 32 where C is user input
* print results
* */