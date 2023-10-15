package cloudvandana;
public class PangramChecker 
{
    public static void main(String[] args) 
    {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkIfPangram(input.toLowerCase());
        
        if (isPangram) 
        {
            System.out.println("The input is a pangram.");
        } 
        else 
        {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String str) 
    {
        int count = 0;

        for (char c = 'a'; c <= 'z'; c++) 
        {
            if (str.indexOf(c) != -1) 
            {
                count++;
            }
        }

        return count==26;
    }
}