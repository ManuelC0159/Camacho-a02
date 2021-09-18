/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution07 {
    static final double FACTOR = 0.09290304;
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("What is the length of your room in feet");
        double length = input.nextInt();


        System.out.println("What is the width of the room in feet?");
        double width = input.nextInt();

        //calculate
        double area = length*width;
        double meters = area*FACTOR;
        System.out.println("You entered the dimensions of "+length+" feet by "+width+" feet.\nThe area is "+area+" square feet\n");
        System.out.println(meters+" square meters");


    }

}
/*
    PseudoCode
    write constant for factor = 0.09290304
    Get length from user
    Get width from user
    Find area using length*width
    Find meter using  area*factor
    display results
* */