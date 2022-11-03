import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Count Matches for Length
     * reads a series of words (ends with "quit")
     * counts the number of words of length greater than four
     * @return the number of words of length greater than four
     */
    public static int countMatchesForLength()
    {
        String word = "";
        int bigwords = 0;
        Scanner s = new Scanner(System.in);
        while (!word.equals("quit"))
        {
            word = s.next();
            if (word.length() > 4)
                bigwords++;
        }
        return bigwords;
    }

    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words  that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        String str;

        do
        {
            System.out.print("Enter a word (type quit to quit): ");

            str = s.next();
            if(str.length() > 2 && (str.substring(0,3)).equals("con"))
            {
                sum += 1;
            }
        }
        while(! str.equals("quit"));

        return sum;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a series of words or 'quit' to stop: ");
        String word;
        int count = 0;
        do{
            word = s.next();
            if(word.length() > 2 && word.substring(word.length() - 3).equals("est")){
                count++;
            }
        }
        while(!word.equals("quit"));
        return count;
    }

    /*
     * Loop Algorithm #4: Reverse String
     * reads one word
     * reverses the characters in the word
     * @return a new string with the characters reversed
     */
    public static String reverseWord()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = s.next();
        int length = word.length();
        String reverse = "";
        for(int i = 0; i < length; i++)
        {
            String letter = word.substring((length-1)-i,length-i);
            reverse += letter;
        }

        return reverse;

    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a series of words (enter a duplicate word to end): ");
        String word = s.next();
        String previousWord = "";
        int counter = 0;

        while(!word.equals(previousWord))
        {
            counter++;
            previousWord = word;
            word = s.next();
        }

        return counter;
    }

    /*
     * Loop Algorithm #6: Prompting until Criteria Is Met
     * prompts the user to enter a word that is alphabetically after "north"
     *        and has more than six characters
     * continues to prompt the user until the word meets the criteria
     * @return the word that meets the criteria
     */
    public static String promptUntilMatch()
    {
        Scanner s = new Scanner(System.in);
        String word = "";

        while(true)
        {
            System.out.println("enter a word: ");
            word = s.nextLine();

            int result = word.compareTo("north");
            if((result > 0) && word.length() > 6)
            {
                return word;
            }
        }

    }

    /*
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit on its own line.
     */
    public static void identifyDigits(int intValue)
    {
        String intstring = "" + intValue;
        for (int i = intstring.length()-1; i >= 0; i--)
        {
            System.out.println(intstring.substring(i, i+1));
        }
    }

    public static void identifyDigits2(int intValue)
    {
        String str = Integer.toString(intValue);
        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

}