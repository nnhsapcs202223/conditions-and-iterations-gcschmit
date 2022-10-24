import java.util.Scanner;

/**
 * Examples and notes on conditions (Chapter 5)
 *
 * @author gcschmit
 * @version 16nov2020
 */
public class Conditions
{
    public static void ifExample()
    {
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int)(Math.random() * 2);
        
        /*
         * if statement
         * 
         * Statements in the if block are executed if the conditonal expression is true.
         * 
         * Conditional expressions evaluate to either true or false.
         *      The conditional expression must go inside of parentheses.
         *      (there is no colon after the conditional expression, unlike Python)
         *      
         *  Statements are grouped by blocks (i.e., { } ).
         *      (not by indentation like in Python)
         */
        if(coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        
        /*
         * if-else statement
         * 
         *  The else block is executed if the conditional expression evaluates to false
         */
        if(coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        else
        {
            System.out.println("coin is tails!");
            System.out.println("better luck next time...");
        }
        
        // model the roll a four-sided die [1-4]
        int dieRoll = (int)(Math.random() * 4) + 1;
        
        /*
         * if, else if, else statement
         * 
         *  (In Java, "else if" is used instead of "elif" likein Python.)
         */
        if(dieRoll == 1)
        {
            System.out.println("rolled a one");
        }
        else if(dieRoll == 2)
        {
            System.out.println("rolled a two");
        }
        else if(dieRoll == 3)
        {
            System.out.println("rolled a three");
        }
        else
        {
            System.out.println("rolled a four");
        }
        
        /*
         * { } are not required for a single statement
         *      However, they are always a good idea!
         *      Leaving them out can lead to bugs like this:
         */
        if(coinFlip == 0)
            System.out.println("coin is tails!");
            System.out.println("better luck next time...");
    }
}
