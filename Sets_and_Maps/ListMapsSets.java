import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.io.*;


    class ListMapsSets {
    
    public static String getParagraph()
    {
        return "You you may know that the kickoff for the 2025 Super Bowl will be held today, but do you know what time it will start and end? With a game as anticipated as this, knowing where and when to watch is critical.The Kansas City Chiefs are set to take on the Philadelphia Eagles in a highly anticipated Super Bowl match - up at the Caesars Superdome in New Orleans on Feb 9. The Chiefs enter the contest following a Jan 26 win over the Buffalo Bills.That came a few hours after the Eagles punched their ticket to the Super Bowl with a comprehensive win over the Washington Commanders x.";
    }
    
    public static void displayCharacterFrequency()
    {       
    
        System.out.println("-------Character Frequency-------");
        LinkedHashMap<String, Integer> frequencies = new LinkedHashMap<>();
        String line = getParagraph();
        int sumOfBlanks = 0;
        for (int i = 0; i < line.length(); i++) 
        {
            char oneCharacter = line.charAt(i);
            String oneCharacterAsString = String.valueOf(oneCharacter);
            
            if(Character.isLetterOrDigit(oneCharacter))
            {
                frequencies.put(oneCharacterAsString, frequencies.containsKey(oneCharacterAsString)? frequencies.get(oneCharacterAsString)+1:1);
                
                if(frequencies.containsKey(oneCharacterAsString))
                {
                    int oneFreq = frequencies.get(oneCharacterAsString);
                }
                else {}
            } else 
            {
                sumOfBlanks++;
            }
        }
        
        System.out.println("sumOfBlanks: " + sumOfBlanks);
        System.out.println("Freq\tCharacter");
        System.out.println("------------------");
        int sum = 0;
        
        for (Map.Entry<String, Integer> oneEntry: frequencies.entrySet())
        {
            System.out.println(oneEntry.getValue() + "\t" + oneEntry.getKey());
            sum += oneEntry.getValue();
        }
        System.out.println("Sum: " + sum);        
    }
    
    public static void populateMap(Map<String, String> map, List<String> oneList) 
    {
        for (String token: oneList) 
        {
            map.put(token,token);
        }
    }
    public static <K, V> void printAnyMap(Map<K,V> map) 
    {
        System.out.println("\n----Using: " + map.getClass());
        System.out.println("Key\t\t\tValue");
        System.out.println("--------------------------");
        for (Entry<K,V> entry: map.entrySet())
        {
            System.out.println(entry.getKey() + "\t\t\t" + entry.getValue());
        }
    }
    
    public static void printSet(Set<String> oneSet)
    {
        System.out.println("\n----using: "+ oneSet.getClass());
        
        System.out.println("Total Unique Words: " + oneSet.size());
        System.out.println("Word");
        System.out.println("-----------");
        for (String oneWord : oneSet) 
        {
            System.out.println(oneWord);
        }
    }
    
    public static void main(String[] args)
    {
        String paragraph = getParagraph();
        
        String[] arrayOfTokens = paragraph.split("\\W+");
        List<String> tokens = List.of(arrayOfTokens);
        
        tokens = List.of(getParagraph().split("\\W+"));
        
        for (String oneToken : tokens)
        {
            System.out.println(oneToken);
        }
        
        System.out.println("# of characters in paragraph: " + paragraph.length());
        System.out.println("# of words in paragraph: " + tokens.size());
        System.out.println();;
        
        displayCharacterFrequency();
        
        Map<String, Integer> ages = Map.of("Alice", 30, "Bob", 25, "Charlie", 35);
        printAnyMap(ages);
        
        Map<String, String> oneMap = new HashMap<>();
        populateMap(oneMap, tokens);
        printAnyMap(oneMap);
        
        oneMap = new LinkedHashMap<>();
        populateMap(oneMap, tokens);
        printAnyMap(oneMap);
        
        oneMap = new TreeMap<>();
        populateMap(oneMap, tokens);
        printAnyMap(oneMap);
        
        HashSet <String> oneSet = new HashSet<>(tokens);
        printSet(oneSet);
        
        printSet(new TreeSet<>(tokens));
        printSet(new LinkedHashSet<>(tokens));
        
    }
    
}
