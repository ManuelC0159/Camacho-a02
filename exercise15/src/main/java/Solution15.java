/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */


import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);



    System.out.println("What is your Username? ");
    String user = input.nextLine();

    System.out.println("What is your password?");
    String pass = input.nextLine();

    String userPass = "abc$123";

    if(pass.equals(userPass)){
        System.out.println("Welcome!");
    }
    else{
        System.out.println("I don't know you");
    }
    }
}


/*

PseudoCode
Set password to deired password
Get Username from user 
Get password from user
Compare inputed password to set password
If they match, print welcome
If they do not match, print "I do not know you"
*/
