/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */


import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("What is your age?");
    int age = input.nextInt();
    String compare = (age>=16)?"You are old enough to legally drive.": "You are not old enough to legally drive.";

    System.out.println(compare);
    }
}
/*
* PseudoCode
* Get age from user
* Compare age given by user to 16
* If less than 16 print user cannot legally drive
* If equal to or greater than 16 print user can legally drive
* */
