import java.util.Scanner;


/**
 * Examples and notes on iterations (Chapter 6)
 *
 * @author gcschmit
 * @version 16nov2020
 */
public class Iterations
{
    public static void whileExample()
    {
        /*
         * while loop:
         * 
         *      evaluates a boolean expression (i.e., condition)
         *          if true, executes the body of the loop and then re-evaluates the condition
         *          if false, skips the body and continues
         */
        int count = 1;                                      // initialization
        
        while(count <= 5)                                   // condition
        {
            System.out.println(count);                      // body
            
            count++;                                        // update the loop variable
        }
        
        System.out.println("done");
    }
    
    public static void whileExample2()
    {
        int count = 1;                                      // initialization
        
        /*
         * This is an example of an infinite loop!
         * 
         * A better condition would be:
         *  while(count < 50)
         */
        while(count != 50)                                  // condition
        {
            System.out.println(count);                      // body
            
            count += 2;                                     // update the loop variable
        }
        
        System.out.println("done");
    }
    
    public static void forExample()
    {
        /*
         * for loop:
         *      Three parts of the for loop statement:
         *          1. initialization - executed once
         *          2. condition - boolean expression evaluated at the start of each iteration
         *          3. update the loop variable - executed at the *end* of each iteration
         *                                          *before* evaluating the condition again
         */
        for(int count = 1;                              // initialization
                count <= 5;                             // condition
                count++)                                // update the loop variable
        {
            System.out.println(count);                  // body            
        }
        
        System.out.println("done");
        
        /*
         * variables declared within the for statement are scoped to the for statement
         *      and its body
         */
        //System.out.println("final value of count: " + count);
    }
    
    public static void forExample2()
    {
        int count;
        for(count = 1;                                  // initialization
                count <= 5;                             // condition
                count++)                                // update the loop variable
        {
            System.out.println(count);                  // body            
        }
        
        System.out.println("done");
        
        System.out.println("final value of count: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error is common with for loops
         *      executes one too many or one to few times.
         *      
         *  Carefully ask: Should the initial value start at 0 or 1?
         *                 Should the condition be < or <=?
         *                 
         *     "Think! Don't compile and try at random!"
         *     
         *  By convention, for simple for loops, we start at 0 and we use < operator
         */
        
        // we want to print five "*"
        for(int i = 0;                                  // initialization
                i <= 5;  // should be i < 5             // condition
                i++)                                    // update the loop variable
        {
            System.out.println("*");                    // body
        }
        
        System.out.println("done");
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop):
         * 
         *      1. executes the body of the loop
         *      2. evaluates the condition:
         *          if true, executes the body of the loop again
         *          if false, continues execution after the loop
         */
        
        int count = 1;                                      // initialization
        
        do
        {
            System.out.println(count);                      // body
            
            count++;                                        // update the loop variable
        }
        while(count <= 5);                                  // condition
        
        System.out.println("done");
    }
    
    public static int sum()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print("Enter a positive integer (-1 to quit): ");
            
            /*
             * Sentinel variable / value
             * 
             *  Value (e..g, -1) used to terminate a loop.
             *  It is often enetered by a user.
             */
            value = s.nextInt();
            
            if(value != -1)
            {
                // this was a bug! sum was 1 less than it should be
                //      before the if statement was added
                sum += value;
            }
        }
        while(value != -1);
        
        return sum;
    }
    
    public static void loop1()
    {
        for(int i = 1; i <= 2; i++)
        {
            for(int j = 1; j <= 4; j++)
            {
                System.out.println(i + " " + j);
            }
        }
    }
    
    public static void loop2()
    {
        int i = 1;
        while(i <= 2)
        {
            int j = 1;
            while(j <= 4)
            {
                System.out.println(i + " " + j);
                j++;
            }
            i++;
        }
    }
}





