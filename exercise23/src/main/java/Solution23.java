import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class Solution23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?(y or n)");
        String user = input.nextLine();
        if(user.equals("y")){
            System.out.println("Are the battery  terminals corroded?(y or n)");
            String user2 = input.nextLine();
            if(user2.equals("y")){
                System.out.println("Clean terminal and try again.");
            }
            else{
                System.out.println("Replace the cables and try again");
            }
            System.exit(0);
        }
        else{
            System.out.println("Does the car make a slicking noise?(y or n)");
            String user3 = input.nextLine();
            if(user3.equals("y")){
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else {
                System.out.println("Does the car crank up but fail to start(y or n)");
                String user4 = input.nextLine();
                if(user4.equals("y")){
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else{
                    System.out.println("Does your car engine start then die?(y or n)");
                    String user5 = input.nextLine();
                    if(user5.equals("y")){
                        System.out.println("Does your car have fuel injection?(y or n)");
                        String user6 = input.nextLine();
                        if(user6.equals("y")){
                            System.out.println("Get it in for service");
                        }
                        else{
                            System.out.println("Check to ensure choke is opening and closing,");
                        }
                        System.exit(0);
                    }
                    else{
                        System.out.println("This should not be possible");
                    }
                }

            }
        }
    }
}
/*
* Ask user for yes or no questions based on steps
* Make giant if else tree that follows step by step depending on what the user asks.
* When a conclusion is reached end program
* 
* */