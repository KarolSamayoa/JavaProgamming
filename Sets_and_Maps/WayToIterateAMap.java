import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.io.*;

public class WayToIterateAMap 
{
    public static void main(String [] args) 
    {
        Map <String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        
        System.out.println(map);
        
        System.out.println("\nusing for each with Map.Entry");
        for(Map.Entry<String, Integer> entry : map.entrySet() ) 
        {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
        
        //using for each with keyset
        System.out.println("\nusing for each with keySet");
        for (String key : map.keySet())
        {
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }
        
        //using for each with iterator
        System.out.println("\nusing for each with iterator");
        Iterator <Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) 
        {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value)            ;
        }
        
        //using lmabda expression
        System.out.println("\nusing lambda expression to process each entry");
        map.forEach((key, value) -> System.out.println(key + ": " + value));
        
        /*
        Lambda expressions are definitely a clean and efficient 
        way to handle map iterations
        */
    }
}









