package Practice1;

import java.util.*;
import java.util.Map.*;
import java.io.*;
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
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTwo
{
	public static void main(String[] args) {
			    
		//streamDemo();
		//streamOfChars();
		//IntStreamDemo();
		//streamOfNumbers();
		//StreamReductionDemo();
		//CollectDemo();
		//MoreCollectDemo();
		//CollectGroupDemo();
		//MoreCollectGroupDemo();
		//AnalyzeNumbersUsingStream();
		//CountLettersUsingStream();
		//CountOccurenceOfLettersInaString();
		TwoDimensionalArrayStream();
	}
	
	public static void streamDemo()
	{
	    String[] name = {"Jamal", "Peter", "Soraya", "Kim", "Imani", 
      "Giorgio", "Alan", "Stacy", "Michelle", "jamal"};
      
      System.out.print("List of names: ");
      
      for(String n : name) 
      {
          System.out.print(n + " ");
      }
      System.out.println("\n");
      
      //display first four names sorted
      Stream.of(name).limit(4).sorted().forEach(e -> System.out.print(e + " "));
      System.out.println();
      
      //Skip 4 names and display the rest sorted ignore case
      Stream.of(name).skip(4).sorted((e1, e2) ->e1.compareToIgnoreCase(e2)).
      forEach(e -> System.out.print(e + " "));
      System.out.println();
      
      Stream.of(name).skip(4).sorted(String::compareToIgnoreCase).
      forEach(e -> System.out.print(e + " "));
      
      System.out.println("\nLargest string with length > 4: " +
      Stream.of(name).filter(e -> e.length() >4).
      max(String::compareTo).get());
      
      System.out.println("Smallest string alphabetically: " + 
       Stream.of(name).min(String::compareTo).get());
       
       System.out.println("Soraya is in name? "+ 
       Stream.of(name).anyMatch(e -> e.equals("Soraya")));
       
       System.out.println("All names start with a capital letter? " +
       Stream.of(name).allMatch(e ->Character.isUpperCase(e.charAt(0))));
       
       System.out.println("No name begins with Ko? " + 
       Stream.of(name).noneMatch(e -> e.startsWith("Ko")));
       
       System.out.println("Number of distinct case-insensitive strings: " +
       Stream.of(name).map(e -> e.toUpperCase()).distinct().count());
       
       System.out.println("First element in the stream in lowercase: " + 
       Stream.of(name).map(String::toLowerCase).findFirst().get());
       
       System.out.println("Skip 4 and get any element in this stream: "+
       Stream.of(name).skip(4).sorted().findAny().get());
       
       Object[] namesInLowerCase = Stream.of(name).map(String::toLowerCase).
       toArray();
       System.out.println(Arrays.toString(namesInLowerCase));
	}
	
	public static void streamOfChars()
	{
	    Character[] chars = 
	    {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'X', 'Y', 'Z'};
	    
	    System.out.print("My list of chars: ");
	    
	    for(Character c : chars)
	    {
	        System.out.print(c + " ");
	    }
	    System.out.println();
	    
	    System.out.println(Stream.of(chars).sorted().findFirst().get());
	    System.out.println(Stream.of(chars).sorted(Comparator.reverseOrder()).
	    findFirst().get());
	    System.out.println(Stream.of(chars).limit(2).sorted().findFirst().
	    get());
	    System.out.println(Stream.of(chars).distinct().skip(2).
	    filter(e -> e > 'A').findFirst().get());
	    System.out.println(Stream.of(chars).max(Character::compareTo).get());
	    System.out.println(Stream.of(chars).max(Comparator.reverseOrder()).get());
	    System.out.println(Stream.of(chars).filter(e -> e >'A').findFirst().get());
	    System.out.println(Stream.of(chars).allMatch(e -> e >= 'A'));
	    System.out.println(Stream.of(chars).anyMatch(e -> e > 'F'));
	    System.out.println(Stream.of(chars).noneMatch(e -> e > 'F'));
	    
	    Stream.of(chars).map(e -> e + " ").map(e -> e.toLowerCase()).
	    forEach(System.out::print);
	    
	    Object[] temp = Stream.of(chars).map(e -> e + "Y").
	    map(e -> e.toLowerCase()).sorted().toArray();
	    
	    System.out.println();
	    System.out.println(Arrays.toString(temp));
	}
	
	public static void IntStreamDemo() 
	{
		int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
		
		System.out.print("Values: ");
		
		for(Integer i : values) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nThe average of distinct even numbers > 3: " +
		IntStream.of(values).distinct().filter(e -> e > 3 && e % 2 ==0).
		average().getAsDouble());
		
		System.out.println("The sum of the first 4 numbers: " +
		IntStream.of(values).limit(4).sum());
		
		IntSummaryStatistics stats = IntStream.of(values).summaryStatistics();
		
		System.out.println("The summary of the stream is");
		System.out.println("Count:\t" + stats.getCount());
		System.out.println("Min:\t" + stats.getMin());
		System.out.println("Max:\t" + stats.getMax());
		System.out.println("Sum:\t" + stats.getSum());
		System.out.println("Avg:\t" + stats.getAverage());
		
		String[] name = {"Jamal", "Peter", "Soraya", "Kim", "Imani", 
			      "Giorgio", "Alan", "Stacy", "Michelle", "jamal"};
		
		System.out.println("Total character count for all names is " +
		Stream.of(name).mapToInt(e -> e.length()).sum());
		
		System.out.println("The number of digits in array values is " +
		IntStream.of(values).mapToObj(e -> e + " ").mapToInt(e -> e.length()).sum());		
	}
	
	public static void streamOfNumbers() 
	{
		int[] numbers = {1, 4, 2, 3, 1};
		System.out.print("numbers: ");
		
		for(Integer n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println(IntStream.of(numbers).sorted().findFirst().getAsInt());
		System.out.println(IntStream.of(numbers).limit(2).sorted().findFirst().
				getAsInt());
		System.out.println(IntStream.of(numbers).distinct().skip(1).
				filter(e -> e > 2).sum());
		System.out.println(IntStream.of(numbers).distinct().skip(1).
				filter(e -> e >2).average().getAsDouble());
		System.out.println(IntStream.of(numbers).max().getAsInt());
		System.out.println(IntStream.of(numbers).filter(e -> e >1).
				findFirst().getAsInt());
		System.out.println(IntStream.of(numbers).allMatch(e -> e >= 1));
		System.out.println(IntStream.of(numbers).anyMatch(e -> e > 4));
		
		System.out.println(IntStream.of(numbers).noneMatch(e -> e >4));
		
		IntStream.of(numbers).mapToObj(e -> (char)(e +50)).forEach(System.out::println);
		
		Object[] temp = IntStream.of(numbers).mapToObj(e -> (char)(e + 'A')).toArray();
		System.out.println(Arrays.toString(temp));
	}
	
	public static void StreamReductionDemo() {
		int [] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
		
		System.out.print("The values are: ");
		IntStream.of(values).forEach(e -> System.out.print(e + " "));
		
		System.out.println("\nThe result of multiplying all vaues is " +
		IntStream.of(values).parallel().reduce(1,(e1, e2) -> e1 * e2));
		
		System.out.print("The values are " + IntStream.of(values).
				mapToObj(e -> e + "").reduce((e1,e2) -> e1 + ", " + e2).get());
		
		String[] names = {"Jamal", "Peter", "Soraya", "Kim", "Imani", 
			      "Giorgio", "Alan", "Stacy", "Michelle", "jamal"};
		System.out.print("\nThe names are: ");
		System.out.println(Stream.of(names)
			      .reduce((x, y) -> x + ", " + y).get());
			       
		System.out.print("Concat names: ");
	    System.out.println(Stream.of(names)
			      .reduce((x, y) -> x + y).get());
			    
		System.out.print("Total number of characters: ");
		System.out.println(Stream.of(names)
			      .reduce((x, y) -> x + y).get().length());
	}
	
	public static void CollectDemo() {
		String[] names = {"Jamal", "Peter", "Soraya", "Kim", "Imani", 
			      "Giorgio", "Alan", "Stacy", "Michelle", "jamal"};
		
		System.out.println("The number of characters for all names: " +
		Stream.of(names).parallel().collect(StringBuilder::new,
		StringBuilder::append, StringBuilder::append).length());
		
		List<String> list = Stream.of(names).collect(ArrayList::new,
				ArrayList::add, ArrayList::addAll);
		System.out.println(list);
		
		list = Stream.of(names).collect(Collectors.toList());
		System.out.println(list);
		
		Set<String> set = Stream.of(names).map(e -> e.toUpperCase()).collect(Collectors.toSet());
		System.out.println(set);
		
		Map<String, Integer> map = Stream.of(names).collect(Collectors.toMap(e -> e, e -> e.length()));
		System.out.println(map);
		
		System.out.println("The total number of characters is "+ Stream.of(names).collect(
				Collectors.summingInt(e -> e.length())));
		
		IntSummaryStatistics stats = Stream.of(names).collect(Collectors.summarizingInt(e -> e.length()));
		
		System.out.println("Max is " + stats.getMax());
		System.out.println("Min is " + stats.getMin());
		System.out.println("Average is " + stats.getAverage());		
	}
	
	public static void MoreCollectDemo() {
		int[] values = {1, 2, 3, 4, 1};
		
		List<Integer> list = IntStream.of(values).parallel().mapToObj(e ->e).
							 collect(Collectors.toList());
		System.out.println(list);
		
		Set<Integer> set = IntStream.of(values).parallel().mapToObj(e -> e).
						   collect(Collectors.toSet());
		System.out.println(set);
		
		Map<Integer, Integer> map = IntStream.of(values).parallel().distinct()
				  .mapToObj(e -> e)
				  .collect(Collectors.toMap(e -> e, e -> e.hashCode()));
		System.out.println(map);
		
		System.out.println(IntStream.of(values).parallel().mapToObj(e -> e).
				collect(Collectors.summingInt(e -> e)));
		
		System.out.println(IntStream.of(values).parallel().mapToObj(e -> e).
				collect(Collectors.averagingDouble(e -> e)));				
	}
	
	public static void CollectGroupDemo() 
	{
		String[] names = {"Jamal", "Peter", "Soraya", "Kim", "Imani", 
			      "Giorgio", "Alan", "Stacy", "Michelle", "jamal"};
		
		Map <String, Long> map1 = Stream.of(names).map(e -> e.toUpperCase()).collect(
				Collectors.groupingBy(e -> e, Collectors.counting()));
		
		System.out.println(map1);
		
		Map<Character, Long> map2 = Stream.of(names).collect(Collectors.groupingBy(e -> e.charAt(0),
									TreeMap::new, Collectors.counting()));
		System.out.println(map2);
		
		int[] values = {2, 3, 4, 1, 2, 3, 2, 3, 4, 5, 1, 421};
		
		IntStream.of(values).mapToObj(e -> e).collect(Collectors.groupingBy(e -> e, TreeMap::new,
		Collectors.counting())).forEach((k, v) -> System.out.println(k + " occours " + v + 
				(v > 1 ? " times " : " time ")));
		
		MyStudent[] students = {new MyStudent("Jhon", "Lu", "CS", 32, 78),
								new MyStudent("Susan", "Yao", "Math", 31, 85.4),
								new MyStudent("Kim", "Johnson", "CS", 30, 78.1)};
		
		System.out.printf("%10s%10s\n", "Department", "Average");
		Stream.of(students).collect(Collectors.groupingBy(MyStudent::getMajor, TreeMap::new,
			Collectors.averagingDouble(MyStudent::getScore))).forEach((k, v) 
					-> System.out.printf("%10s%10.2f\n", k,v));
	}
	
	public static void MoreCollectGroupDemo() 
	{
		int[] values = {1, 2, 2, 3, 4, 2, 1};
		
		IntStream.of(values).parallel().mapToObj(e -> e).collect(Collectors.groupingBy(
		e -> e, TreeMap::new, Collectors.counting())).forEach((k,v) -> System.out.println(
				k + " occurs " + v + (v >1 ? " times " : " time" )));
		
		IntStream.of(values).parallel().mapToObj(e -> e).collect(Collectors.groupingBy(e -> e,
		TreeMap::new, Collectors.summingInt(e -> e))).forEach((k,v) -> 
		System.out.println(k + ": " + v));
		
		MyStudent[] students = {
				  new MyStudent("John", "Johnson", "CS", 23, 89.2),
				  new MyStudent("Susan", "Johnson", "Math", 21, 89.1),
				  new MyStudent("John", "Peterson", "CS", 21, 92.3),
				  new MyStudent("Kim", "Yao", "Math", 22, 87.3),
				  new MyStudent("Jeff", "Johnson", "CS", 23, 78.5)};
		
		Stream.of(students).parallel().
		sorted(Comparator.comparing(MyStudent::getLastName).
		thenComparing(MyStudent::getFirstName)).forEach(e -> 
		System.out.println(e.getLastName() + ", " + e.getFirstName()));
		
		Stream.of(students).parallel().collect(Collectors.
				groupingBy(MyStudent::getAge, TreeMap::new, Collectors.
				averagingDouble(MyStudent::getScore))).forEach((k, v) ->
				System.out.printf("%10s%10.2f\n", k, v));
	}
	
	public static void AnalyzeNumbersUsingStream() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		
		double[] numbers = new double[n];
		double sum = 0;
		
		System.out.print("Enter the numbers: ");
		for(int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
		}
		
		double average = DoubleStream.of(numbers).average().getAsDouble();
		System.out.println("The average is " + average);
		
		System.out.println("The number of elements above average is: " + 
		DoubleStream.of(numbers).filter(e -> e > average).count());
	}
	
	private static int count = 0;
	public static void CountLettersUsingStream() 
	{
		 		
		Random random = new Random();
		
		Object[] chars = random.ints(100, (int)'a', (int)'z' + 1).
				mapToObj(e -> (char)e).toArray();
		
		System.out.println("The lowercase letters are: ");
		Stream.of(chars).forEach(e -> {System.out.print(e + (++count % 20 ==0 ? "\n" : " "));});		
		
		count =0; //Reset the count for columns
		System.out.println("\nThe occurrences of each letter are:");
		Stream.of(chars).collect(Collectors.groupingBy(e ->e,
		TreeMap::new, Collectors.counting())).forEach((k, v) -> {System.out.print(v + " "+ k +
				(++count % 10 ==0 ? "\n" : " "));
		});		
	}
	
	public static void CountOccurenceOfLettersInaString() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		count = 0; 
		System.out.println("The occurences of each letter are:");
		Stream.of(toCharacterArray(s.toCharArray())).filter(ch ->Character.isLetter(ch)).
		collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())).
		forEach((k, v) -> {System.out.print(v + " " + k + (++count % 10 == 0 ? "\n" : " "));});
	}
	
	public static Character[] toCharacterArray(char[] list) 
	{
		Character[] result = new Character[list.length];
		for(int i =0; i < result.length; i++) {
			result[i] = list[i];
		}
		
		return result;
	}
	
	private static int i =0;
	public static void TwoDimensionalArrayStream() {
		int[][] m = {{1,2},{3, 4}, {4, 5}, {1, 3}};
		
		int[] list = Stream.of(m).map(e -> IntStream.of(e)).
				reduce((e1, e2) -> IntStream.concat(e1, e2)).get().toArray();
		
		IntSummaryStatistics stats = IntStream.of(list).summaryStatistics();
		
		System.out.println("Max: " + stats.getMax());
		System.out.println("Min: " + stats.getMin());
		System.out.println("Sum: " + stats.getSum());
		System.out.println("Average: " + stats.getAverage());
		
		System.out.println("Sum of row ");
		Stream.of(m).mapToInt(e -> IntStream.of(e).sum()).
		forEach(e ->System.out.println("Sum of row " + i++ + ": " + e));
	}
}

class MyStudent 
{
	public String firstName;
	public String lastName;
	public String major;
	public int age;
	public double score; 
	
	public MyStudent(String firstName, String lastName,
			String major, int age, double score) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.age = age;
		this.score = score;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getScore() {
		return score;
	}
}
