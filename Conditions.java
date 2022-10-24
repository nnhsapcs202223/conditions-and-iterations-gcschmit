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
         *  Statements in the if block are executed if the conditional expression is true.
         *  
         *  Conditional expressions evaulate to either true or false.
         *      The conditional expression must go inside of parentheses.
         *      (Unlike Python, there is no colon after the conditional expression.)
         *      
         *  Statements are grouped by blocks (i.e., { } ).
         *      (Unlike Python, blocks are not defined by indentation.)
         */
        if(coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        
        /*
         * if, else statement
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

        // model the roll of a four-sided die [1-4]
        int dieRoll = (int)(Math.random() * 4) + 1;
        
        /*
         * if, else if, else statement
         * 
         *  (Unlike Python, Java uses "else if" instead of "elif").
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
