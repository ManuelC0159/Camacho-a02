import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Manuel Camacho
 */

public class Solution06 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your current age?");
        String inputAge = input.nextLine();
        System.out.println("At what age would you like to retire?");
        String inputRetire = input.nextLine();
        int timeLeft = Integer.parseInt(inputRetire) - Integer.parseInt(inputAge);
        int year = Calendar.getInstance().get(Calendar.YEAR);

        if(timeLeft <= 0){
            System.out.println("You can already retire!\n");
        }
        else if(timeLeft > 0){
            int retireYear = year+timeLeft;
            System.out.println("You have "+timeLeft +" years until you can retire.\nIt's "+year+", so you can retire in "+retireYear);
        }
    }
}
/*
* PseudoCode
*   Ask user for current age
*   Ask user for age they wish to retire
*   make input into ints
*   subtract age from age wished to retire
*   use computer to find current year using Calendar.getInstance().get(Calendar.YEAR)
*   if difference in retire age and current age is 0 or less print they can retire
*   else print out put on how long till they can retire and what year they can retire
**/