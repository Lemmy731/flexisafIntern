//write program that converts from number to string and from string back to numbers
//also write a program that reverse a string

public class Number
{
    public static void main(String[] args)
    {
      NumberConversion(70);
      StringConversion("790");
      ReverseString("market");
    }

//convert number to string 
    public static void NumberConversion(int digit)
{
    String validString = Integer.toString(digit);
    System.out.print(validString);
}

//convert string  to number
public static void StringConversion(String word)
{
    int validNumber = Integer.valueOf(word);   
    System.out.print(validNumber); 
}

//reverse string

public static void ReverseString(String words)
{
    StringBuffer str = new StringBuffer(words);
    str.reverse();
    System.out.print(str);
}
}