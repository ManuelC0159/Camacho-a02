
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */


import java.util.Scanner;

public class Solution08 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many people?");
        int people = input.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizzas = input.nextInt();
        System.out.println("How many slices per pizza?");
        int slices = input.nextInt();

        int total_slices = pizzas*slices;
        int slice_per_person = total_slices/people;
        int leftovers = total_slices%people;


        System.out.println(people+ " people with " +pizzas+ " pizzas ("+total_slices+" slices of pizza)");
        System.out.println("Each person gets " + slice_per_person+" slices of pizza");
        System.out.println("There are "+leftovers+" leftovers pieces");
    }
}

/*
* PseudoCode
* Get number of people from user
* Get number of pizzas from user
* Get number of slices per pizza
* Find total slices by pizzas*slices
* Find slices per person by total slices divided by amount of people
* Find leftovers by total slices modulus of people
* Print data to user
*
* */
