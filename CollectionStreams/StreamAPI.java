package Practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
	
	public static void main(String[] args) {
		IntStreamDemo();
	}
	
	public static void IntStreamDemo()
	{
	    System.out.println("***IntStreamDemo***");
	    int[] values = {3,4,1,5,20, 1, 3, 3,4,6};
	    
	    System.out.println("The average of distinct even numbers > 3: " +
	    IntStream.of(values).distinct().filter(e ->e > 3 && e %2 ==0). average().getAsDouble());
	    System.out.println("The sum of the first 4 numbers is " +
	    IntStream.of(values).limit(4).sum());
	    
	    IntSummaryStatistics stats = IntStream.of(values).summaryStatistics();
	    System.out.println();
	    System.out.printf("The summary of the stream is \n%-10s%10d\n" + 
	    "%-10s%10d\n%-10s%10d\n%-10s%10d\n%-10s%10.2f\n", "Count:", stats.getCount(), 
	    "Max:", stats.getMax(), "Min:", stats.getMin(), "Sum:", stats.getSum(), 
	    "Average:", stats.getAverage());
	    
	    String[] names = { "John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", 
	                       "Stacy", "Michelle", "john" };
	                       
	    System.out.println("\nTotal character count for names is " + 
	    Stream.of(names).mapToInt(e ->e.length()).sum());
	    System.out.println("The number of digits in array value is " +
	    IntStream.of(values).mapToObj(e -> e + ""). mapToInt(e-> e.length()).sum());
	}

}
