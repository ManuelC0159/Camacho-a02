/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */


import java.util.Scanner;

public class Exercise09 {
    static final int GALLON = 350;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("length: ");
        double length = input.nextInt();

        System.out.println("Width: ");
        double width = input.nextInt();

        double area = length*width;

        double gallons_needed = area/GALLON;
        double test = Math.ceil(gallons_needed);
        System.out.println("You will need to purchase " +test+ " gallons of paint to cover "+area+" square feet");

    }
}
/*
* PseudoCode
* Call constant with value of 350
* Get length from user
* Get width from user
* Find area by multiplying length time width
* Find gallons needed by dividing area by the constant
* round up
* print data
* */