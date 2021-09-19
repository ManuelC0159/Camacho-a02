/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */


import java.util.Scanner;

public class Solution16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    /*BAC = (A× 5.14 / W × r) − .015 × H
      A = alcohol
      w = weight
      r = ratio
        0.73 men
        0.66 women
      h = hours since last drink
      if BAC is less than 0.08 it is legal to drive
     */
        System.out.println("Enter 1 if you are male or a 2 if you are female: ");
        int sex = input.nextInt();

        System.out.println("How many ounces of alcohol did you have? ");
        int alcohol = input.nextInt();

        System.out.println("What is your weight, in pounds?");
        double weight = input.nextInt();

        System.out.println("How many hours has it been since your last drink?");
        int hours = input.nextInt();

        double BAC_step1 = alcohol * 5.14;
        if (sex == 1) {
            double BAC_Step2 = weight*0.73;
            double BAC_Step3 = BAC_step1/BAC_Step2;
            double BAC_Step4 = (0.015*hours);
            double BAC_Step5 = BAC_Step3-BAC_Step4;
            System.out.println("Your BAC is "+BAC_Step5);
            if(BAC_Step5 >0.08){
                System.out.println("It is not legal for you to drive");
            }
            else{
                System.out.println("It is legal for you to drive");
            }
        }
        else if(sex == 2){
            double BAC_Step2 = weight*0.66;
            double BAC_Step3 = BAC_step1/BAC_Step2;
            double BAC_Step4 = (0.015*hours);
            double BAC_Step5 = BAC_Step3-BAC_Step4;
            System.out.println("Your BAC is "+BAC_Step5);
            if(BAC_Step5 >0.08){
                System.out.println("It is not legal for you to drive");
            }
            else{
                System.out.println("It is legal for you to drive");
            }
        }
    }
}
/*
* PseudoCode
* Get gender from user
* Get weight from user
* Get ounces consumed from user
* Get time passed since last drink from user
* If gender male do calculations with ration = 0.73
* If gender is female do calculations with ratio = 0.66
* Find BAC using (A× 5.14 / W × r) − .015 × H
* If BAC is less than 0.08 print it is legal for user to drive
* If BAC is higher than  0.08 print it is not legal for user to drive
* */