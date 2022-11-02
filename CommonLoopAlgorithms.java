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
        Scanner s = new Scanner(System.in);
        System.out.println("Enter words >_<");
        int wordsGreaterThanFour = 0;
        boolean stillGoing = true;
        while (stillGoing)
        {
            String nextWord = s.next();
            if (!nextWord.equals("quit"))
            {
                if (nextWord.length() > 4)
                {
                    wordsGreaterThanFour++;
                }
            }
            else
            {
                stillGoing = false;
            }
        }
        return wordsGreaterThanFour;
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

        int count = 0;
        String str = "";
        while(!str.equals("quit")){
            System.out.println("Enter words end with quit: ");
            str = s.next();
            if(str.substring(0,3).equals("con")){
                count+=1;
            }
        }
        return count;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        System.out.print("Enter a series of words, separated by spaces (enter quit at end): ");
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int count = 0;
        String wordSuffix = "";

        do
        {
            wordSuffix = word.substring(word.length()-3, word.length());
            if (wordSuffix.equals("est"))
            {
                count+=1;
            }
            word = s.next();
        }
        while (word.equals("quit")!=true);

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
        return "";
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        return 0;
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
        String input;
        do
        {
            System.out.println("Type a word that is alphabetically after North and has more than 6 characters");
            input = s.nextLine();

        }
        while(!((input.length() > 6) && (input.compareTo("north") > 0)));

        System.out.println("Done");

        return input;
    }

    /*
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit on its own line.
     */
    public static void identifyDigits(int intValue)
    {
        String strValue = "" + intValue;
        for(int i = 0 ; i < strValue.length(); i++)
        {
            System.out.println(strValue.substring(i,i+1));
        }
    }

    public static void identifyDigits2(int intValue)
    {
        String newString = "";
        newString = newString + intValue;
        String digit = "";
        for (int i=0;i<newString.length();i++)
        {
            digit = newString.substring(i,i+1);
            System.out.println(digit);
        }
    }

    public static void identifyDigits3(int intValue)
    {
        String stringIntValue = "" + intValue;
        for(int i = 0; i <= stringIntValue.length(); i++)
        {

            System.out.println(stringIntValue.substring(0 + i, i+1));

        }
    }

}