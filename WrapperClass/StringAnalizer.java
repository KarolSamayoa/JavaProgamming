import java.util.*;

public class StringAnalizer 
{
    public static void main(String[] args) 
    {
        String input; 
        char[] array;
        int letters = 0; 
        int digits = 0;
        int whitespaces = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        input = keyboard.nextLine();
        
        array = input.toCharArray();
        
        for (int i = 0; i < array.length; i++) 
        {
            if (Character.isLetter(array[i]))
                letters++;
            else if (Character.isDigit(array[i]))
                digits++;
            else if (Character.isWhitespace(array[i]))
                whitespaces++;
        }
        System.out.println(" The string contains " +
                letters + " letters, "+ 
                digits + " digits, and " +
                whitespaces + " whitspaces characters.");
    }
}

