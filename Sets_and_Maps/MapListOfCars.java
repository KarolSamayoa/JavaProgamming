import java.util.*;
import java.util.Map.*;

class Car implements Comparable <Car> 
{
    public int year;
    public String make;
    public double price;
    
    public Car(int year, String make, double price) 
    {
        this.year = year;
        this.make = make;
        this.price = price;
    }
    
    //compare to make
    public int compareTo(Car other)
    {
        return this.make.compareTo(other.make);
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getMake()
    {
        return make;
    }
    
    @Override
    public String toString()
    {
        return year + "\t" + make + "\t" + price;
    }
}

class sortCarsByYear implements Comparator<Car> 
{
    public int compare(Car c1, Car c2)
    {
        return c1.year - c2.year;
    }
}

public class MapListOfCars {

    
    public static void main(String[] args) {
        
        List<Car> cars = new ArrayList<>(List.of(new Car (2015, "BMW", 25000),
                                                 new Car (2022, "Audi", 35750),
                                                 new Car (2024, "Honda", 32300)));
        
        cars.add(new Car(2025, "BMW", 55600));
        cars.add(new Car(2008, "Honda", 8500));
        cars.add(new Car(2025, "VW", 6500));
        cars.add(new Car(2022, "VW", 26500));
        cars.add(new Car(2008, "Toyota", 4500));
        cars.add(new Car(2008, "Honda", 6600));
        cars.add(new Car(2012, "Audi", 8750));
        cars.add(new Car(2014, "Honda", 10000));
        
       //create map of cars where the key=year and value = list of cars
       
       TreeMap<Integer, List<Car>> inventory = new TreeMap<>();
       
       for (Car oneCar : cars)
       {
           if(inventory.containsKey(oneCar.year))
           {
               inventory.get(oneCar.year).add(oneCar);
           }
           else 
           {
               inventory.put(oneCar.year, new ArrayList<>(List.of(oneCar)));
           }
       }
       
       //Print cars
       printMap(inventory);
       printByYear(inventory, 2008);
       printByYear(inventory, 2022);
       printByYear(inventory, 2026);
        
       
    }
    
    public static void printCars(List <Car> carList)
    {
        for (Car oneCar: carList)
        {
            System.out.println(oneCar);
        }
    }
    public static void printCarsSumAndAverage(List <Car> carList)
    {
        double sum = 0;
        for(Car oneCar : carList)
        {
            sum +=oneCar.price;
        }
        
        System.out.println("------------------");
        System.out.println("Sum: $" + String.format("%,.2f", sum));
        System.out.println("Average: $"+ String.format("%,.2f", sum/carList.size()));
    }
    
    public static void printMap(Map <Integer, List<Car>> carMap)
    {
        for (Entry <Integer, List<Car>> oneEntry : carMap.entrySet())
        {
            System.out.println("----" + oneEntry.getKey()+ "----");
            
            List<Car> oneList = oneEntry.getValue();
            for (Car oneCar : oneList)
            {
                System.out.println(oneCar);
            }
        }
    }
    
    public static void printByYear(Map <Integer, List<Car>> carMap, int year)
    {
        System.out.println("\nFinding cars by year: " + year);
        List<Car> oneList = carMap.get(year) == null ? new ArrayList<>() : carMap.get(year);
        printCars(oneList);
        System.out.print("Cars found: " + oneList.size());
    }
    
}
