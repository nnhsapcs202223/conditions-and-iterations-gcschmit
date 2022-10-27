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
    
    public static boolean doublesAreEqual(double num1, double num2)
    {
        /*
         * If we use the equality operator (==) for doubles, it will only return true
         *      if all binary digits match.
         *  For "equal" numbers, this is probably not the case due to floating-point
         *      rounding and, therefore, not what we want.
         *  We will check if they are "close enough" (i.e., epsilon value).
         */
        final double EPSILON = 1e-6;
        
        if(Math.abs(num1 - num2) < EPSILON)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        // don't have to use an if statement
        //return (Math.abs(num1 - num2) < EPSILON);
    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the variables (e.g., str1 and str2)
         *      contain the same value. For variables of a class type, including String,
         *      this means that they contain the same reference. That is, they
         *      refer to the same object in memory, not that the two strings have
         *      the same sequence of characters.
         *      
         *  Alias: two variables that refer to the same object
         */
        if(str1 == str2)
        {
            System.out.println("string references are equal");
        }
        else
        {
            System.out.println("string references are not equal");
        }
        
        /*
         * The equals method returns true if the two objects referenced by the variables
         *      are "equal". What "equals" means is defined by the class. For strings,
         *      it means that the two objects have the same sequence of characters.
         */
        if(str1.equals(str2))
        {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("strings are not equal");
        }
        
        /*
         * If we want to check if strings are not equal, we use the logical complement
         *      operator (i.e., !)
         */
        if( ! str1.equals(str2))
        {
            System.out.println("strings are NOT equal");
        }
        
        /*
         * We will determine which string comes first lexicographically using the
         *      compareTo method of the String class.
         *      
         *  compareTo returns an int value:
         *      0:      if the strings are equal (same sequence of characters)
         *      <0:     if str1 < str2 lexicographically
         *      >0:     if str1 > str2 lexicographically
         */
        int result = str1.compareTo(str2);
        
        String firstStr = null;
        
        if(result < 0)
        {
            firstStr = str1;
        }
        else if(result > 0)
        {
            firstStr = str2;
        }
        
        if(firstStr != null)
        {
            System.out.println("The first string is: " + firstStr);
        }
        else
        {
            System.out.println("strings are equal");
        }
        
        /*
         * This is an example of a "short circuit".
         * 
         *  If the left operand is false, the right operand will not be evaluated
         *      because the AND operation is already false.
         */
        if(firstStr != null && firstStr.length() > 3)
        {
            System.out.println("The first string has more than 3 characters.");
        }
        
        /*
         * This is another "short circuit" example
         * 
         *  If the left operand is true, the right operand will not be evaluated
         *      because the OR operation is already true.
         *      
         *  This may result in a bug if the first word is "kiwi".
         */
        System.out.print("Enter your two favorite fruits: ");
        if(s.next().equals("kiwi") || s.next().equals("kiwi"))
        {
            System.out.println("Kiwi is one of my favorites too!");
        }
        
        System.out.print("Enter your favorite ice cream flavor: ");
        String flavor = s.next();
        System.out.println("Favorite ice cream flavor: " + flavor);
    }
    
    public static void stringCompareActivity()
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if(word1.compareTo("aaa") > 0)
        {
            System.out.println("condition #1 is true");
        }
        
        if(word1.equals(word2))
        // if(word1.compareTo(word2) == 0)
        {
            System.out.println("condition #2 is true");
        }
        
        if(word1.compareTo(word2) < 0)
        {
            System.out.println("condition #3 is true");
        }
        
        if(word1.substring(0, 3).equals(word2.substring(0, 3)))
        {
            System.out.println("condition #4 is true");
        }
    }
}
