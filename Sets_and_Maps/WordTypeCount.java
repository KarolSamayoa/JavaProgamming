import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount 
{
    public static void main(String[] args) 
    {
        Map <String, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);
    }
    
    //Create map for user input
    private static void createMap(Map<String, Integer> map) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.nextLine();
        
        //tokenize the input
        String[] tokens = input.split(" ");
        
        //processing input text
        for (String token: tokens)
        {
            String word = token.toLowerCase();
            
            if(map.containsKey(word))
            {
                int count = map.get(word);
                map.put(word, count +1);
            }
            else
                map.put(word,1);
        }        
    }
    
    //dislay map content
    private static void displayMap(Map<String, Integer> map) 
    {
        Set<String> keys = map.keySet();
        
        TreeSet<String> sortedKeys = new TreeSet<String>(keys);
        
        System.out.println("\nMap contains:\nKey\t\tValue");
        
        //generate output for each key in map
        for(String key : sortedKeys)
            System.out.printf("%-10s%10s\n", key, map.get(key));
        
        System.out.printf("\nsize: %d\nisEmpty: %b\n", map.size(), map.isEmpty());        
    }
}










