package cloudvandana;
public class RomanToInteger 
{
    public static void main(String[] args) 
    {
        String romanNumeral = "MCMXCIV"; // Example Roman numeral
        int result = romanToInt(romanNumeral);
        System.out.println("Integer equivalent of " + romanNumeral + " is: " + result);
    }

    public static int romanToInt(String s) 
    {
        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--)
        {
            int currentValue = values[s.charAt(i) - 'A'];
            if (currentValue >= prevValue)
                result += currentValue;
            else
                result -= currentValue;
            prevValue = currentValue;
        }

        return result;
    }
}