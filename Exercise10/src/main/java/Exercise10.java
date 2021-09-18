
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */


import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){

        Scanner input =new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        double item1 = input.nextDouble();
        System.out.println("Enter the quantity of item 1: ");
        double quantity1 = input.nextDouble();

        System.out.println("Enter the price of time 2: ");
        double item2 = input.nextDouble();
        System.out.println("Enter quantity of item 2: ");
        double quantity2 = input.nextDouble();

        System.out.println("Enter price of item 3: ");
        double item3 = input.nextDouble();
        System.out.println("Enter quantity of item 3: ");
        double quantity3 = input.nextDouble();

        double  item1_price_total = item1*quantity1;
        double item2_price_total = item2*quantity2;
        double item3_price_total = item3*quantity3;

        double total_Subprice = item1_price_total+item2_price_total+item3_price_total;
        double tax = (total_Subprice*5.5)/100;
        double total = tax+total_Subprice;

        System.out.println("Subtotal:  $" + total_Subprice);
        System.out.println("\nTax: $"+tax);
        System.out.println("\nTotal: $"+total);
    }
}
/*
* PseudoCode
* Get quantity and price of items 1-3 from user
* Get total price per item by multiplying quantity of each item by price
* Get sub total by adding all totals for items 1-3
* Get tax by multiplying sub total by 5.5 and dividing that answer by 100
* Get final total by adding subtotal by tax;
* Print data to user
*/