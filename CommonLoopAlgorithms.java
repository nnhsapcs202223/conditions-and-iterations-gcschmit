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
        String input;
        int count = 0;
        do
        {
            input = s.nextLine();
            if(input.length() > 4)
            {
                count++;
            }
        }

        while(!input.equals("quit"));

        return count;

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
        System.out.println("Enter a word: ");
        String word = null;
        int count = 0;

        do {
            word = s.next();
            if(word.length() >= 3 && ! word.equals("quit")) {
                if(word.substring(0, 3).equals("con")) {
                    count++;
                }
            }
        }
        while(! word.equals("quit"));

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
        String x;
        int counter = 0;
        Scanner s = new Scanner(System.in);
        do
        {
            System.out.println("Enter words: ");
            x = s.next();
            if(!x.equals("quit") && x.length() >= 3)
            {
                String y = new String(x.substring(x.length() - 3));
                if(y.equals("est"))
                {
                    counter += 1;
                }
            }
        } while(!x.equals("quit"));
        System.out.println(counter);

        return counter;
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
        String str = s.next();
        String str2 = "";
        for(int count = 1;
                count <= str.length();
                count++)
        {
            str2 += str.substring(str.length() - count, str.length() - count +1);
        }
        return str2;
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        Scanner scan=new Scanner(System.in);
        int wordCount=0;
        Boolean same=false;
        String lastWord="";
        do
        {
            System.out.println("enter word: ");
            String word=scan.next();
            if (! word.equals(lastWord))
            {
                wordCount++;
                lastWord=word;
            }
            else
            {
                same=true;
            }
        }
        while (same!=true);
        return wordCount;
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
        String word;
        do
        {
            System.out.print("Enter a word that is alphabetically after north and has more than 6 letters: ");
            word = s.nextLine();

        }
        while(word.length() <= 6 || word.compareTo("north") < 0);
        return word;
    }

    /*
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit on its own line.
     */
    public static void identifyDigits(int intValue)
    {
        Scanner s = new Scanner(System.in);
        String message = intValue + "";
        for (int i = 0; i < message.length(); i++)
        {
            System.out.println(message.substring(i, i+1));
        }
    }

}