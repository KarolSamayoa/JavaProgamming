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
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Car class represents a car object and implements 
//Comparable to allow sorting by 'make'

class Car implements Comparable <Car>
{
	public int year;
	public String make;
	public double price;
	
	// Constructor to initialize a Car object with 
	//year, make, and price
	public Car(int year, String make, double price) 
	{
		this.year = year;
		this.make = make;
		this.price = price;
	}
	
	//compare by make
	// Defines the natural ordering of Car objects by 'make'
	public int compareTo(Car other) 
	{
		return this.make.compareTo(other.make);
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public String getMake() {
		return make;
	}
	
	public double getPrice() {
		return price;
	}
	
	// Returns a string representation of the Car object
	public String toString() {
		return year + "\t" + make + "\t" + price;
	}
	
}

//Custom comparator to sort Car objects by year
class sortCarsByYear implements Comparator <Car> {
	public int compare(Car c1, Car c2) {
		return c1.year - c2.year;
	}
}

public class MapListOfCars { 
	public static void main(String[] args) 
	{
		//Create list of Car objects
		List <Car> cars = new ArrayList<>(List.of(new Car(2015, "BMW", 25600),
							  new Car(2022, "Audi",35750),
							  new Car(2025, "Honda", 32300)));
		cars.add(new Car(2025, "BMW", 55600));
		cars.add(new Car(2008, "Honda", 8500));
		cars.add(new Car(2008, "VW", 6500));
		cars.add(new Car(2022, "VW", 26500));
		cars.add(new Car(2008, "Toyota", 4500));
		cars.add(new Car(2008, "Honda", 6600));
		cars.add(new Car(2012, "Audi", 8750));
		cars.add(new Car(2014, "Honda", 10000));
		
		// Create a TreeMap that groups cars by year using Java Streams
		//Create map of cars where the key=year and value=list of cars
		Map <Integer, List<Car>> inventory = new TreeMap<> (cars.stream().
						    collect(Collectors.groupingBy(Car::getYear)));	
		
				
		//printMap(inventory);
		//findByYearInMap(2008, inventory);
		//findByYearInList(2008, cars);
		//findByYearAndMakeInList(2005,2015, "Honda", cars);
		//groupAndPrintSumAndAvgByYear(cars);
		//groupAndPrintByYear(cars);
		displayHighestPriceCar(cars);
		displayCheapestCar(cars);
	}
	
	// Calculates and prints the total and average price of cars in a list
	public static void printCarsSumAndAverage(List<Car> carList) {
		double sum = carList.stream().mapToDouble(e -> e.price).sum();
		double avg = carList.stream().mapToDouble(e -> e.price).average().getAsDouble();
		
		System.out.println("\nSum: $" + String.format("%,.2f", sum));
		System.out.println("Average: $" + String.format("%,.2f", avg));
	}
	
	// Prints all cars grouped by year along with their total and average price
	public static void printMap(Map <Integer, List<Car>> carMap) {
		
		//print using lambda expressions
		carMap.forEach((oneKey, oneList) -> {
			System.out.println("********" + oneKey + "********" );
			oneList.forEach(onecar -> System.out.println(onecar));
			printCarsSumAndAverage(oneList);
			System.out.println();
		});
	}
	
	//print all cars in the provided list using a stream
	public static void printCars(List <Car> carList) {
		carList.stream().forEach(System.out::println);
	}
	
	// Finds and prints all cars from a specific year in the given map
	public static void findByYearInMap(int year, Map <Integer, List<Car>> carMap) {
		System.out.println("\nfindByYearInMap, Finding cars by year: " + year);
		
		// Retrieve the list of cars for the specified year.
		// If the year doesn't exist in the map, use an empty 
		// list to avoid null pointer issues.
		List<Car> oneList = carMap.get(year) == null ? new ArrayList<>() : carMap.get(year);
		printCars(oneList); // Print the cars found for the specified year
		System.out.println("\nCars found: " + oneList.size());
	}
	
	// Finds and prints all cars from a specific year in the given list of cars
	public static void findByYearsInList(int year, List<Car> carList) {
		System.out.println("\nFindByYearInList, Finding cars by year: " + year);
		List <Car> oneList = carList.stream().filter(u -> u.getYear() == year).toList();
		printCars(oneList);
		System.out.println("Cars found: " + oneList.size());
		
	}
	
	// Finds and prints all cars within a specific year range and of a specific make from the given list
	public static void findByYearAndMakeInList(int fromYear, int toYear, String make, List <Car> carList) 
	{
		System.out.println("\nfindByYearAndMakeInList, Finding cars by years and make: " +
				fromYear + " " + toYear + " " + make);
		
		// Use a stream to filter the car list based on the make and year range
		List <Car> oneList = carList.stream().filter(u -> u.getMake().equals(make) && 
							 (u.getYear() >= fromYear && u.getYear() <=toYear)).toList();
		
		printCars(oneList);
		System.out.println("Cars found: " + oneList.size());
	}
	
	// Groups cars by year and prints the average and total price for each year
	public static void groupAndPrintSumAndAvgByYear(List <Car> carList) {
		System.out.println("*****groupAndPrintSumAndAvgByYear*****");
		
		// Group cars by year and calculate the average price for each year
	    // TreeMap is used to keep the years sorted in ascending order
		TreeMap<Integer, Double> result = carList.stream().collect(Collectors.groupingBy(Car::getYear,
						TreeMap::new, Collectors.averagingDouble(Car::getPrice)));
		
		System.out.println("Year\tAverage Price");
		System.out.println("--------------------");
		result.forEach((k, v) -> System.out.println(k + "\t" + v));
		
		// Group cars again by year, this time calculating the total (sum) of prices
		result = carList.stream().collect(Collectors.groupingBy(Car::getYear,
				TreeMap::new, Collectors.summingDouble(Car::getPrice)));
		
		System.out.println("\nYear\tTotal Sum");
		System.out.println("--------------------");
		result.forEach((k, v) -> System.out.println(k + "\t" + v));
	}
	
	// Groups the list of cars by year and prints the grouped data using the printMap method
	public static void groupAndPrintByYear(List <Car> carList) {
		System.out.println("*****groupAndPrintByYear*****");
		
		// Group the cars by year using a stream and the groupingBy collector
	    // The result is a Map where the key is the year and the value is 
		// a list of cars from that year
		Map <Integer, List<Car>> result = 
				carList.stream().collect(Collectors.groupingBy(Car::getYear));
		
		printMap(result);
	}
	
	public static void displayHighestPriceCar(List <Car> carList) {
		
		//Find the object with the maximun value
		System.out.println("Most expensive car: ");
		
		Optional<Car> maxCar = carList.stream().max(Comparator.comparingDouble(Car::getPrice));
		maxCar.ifPresent(System.out::println);
	}
	
	public static void displayCheapestCar(List <Car> carList) {
		//Find the object with the lowest value
		Optional<Car> cheapestCar = carList.stream().min(Comparator.comparingDouble(Car::getPrice));
		
		System.out.println("\nCheapest car: ");
		System.out.println(cheapestCar.get());
	}

}



























