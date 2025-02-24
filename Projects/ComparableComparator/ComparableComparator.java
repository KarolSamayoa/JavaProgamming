import java.util.*;
import java.io.*;

class Car implements Comparable <Car> {
    public int year;
    public String make;
    public double price;
    
    public Car (int year, String make, double price){
        this.year = year;
        this.make = make;
        this.price = price;
    }
    
    //compare by make
    public int compareTo(Car other){
        return this.make.compareTo(other.make);
    }
    
    public int getYear(){
        return year;
    }
    
    public String getMake(){
        return make;
    }
    
    public String toString(){
        return year + "\t" + make + "\t" + price ;
    }    
    
}

//sort cars by year
class sortCarsByYear implements Comparator<Car>
{
    public int compare(Car c1, Car c2){
        return c1.year - c2.year;
    }
}


public class ComparableComparator {
    public static void main (String [] args) {
        
        List<Car> cars = new ArrayList <>(List.of(new Car(2015,"BMW", 25600), 
                new Car(2022,"Audi", 35750), new Car(2024, "Honda", 32300)));
        
        cars.add(new Car(2025,"BMW", 55600));
        cars.add(new Car(2012, "Audi", 8750));
        cars.add(new Car(2014,"Honda", 10000));
        
        System.out.println("*-*-*-*-No Sorting-*-*-*-*-*");
        printCars(cars);
        
        System.out.println("*-*-*-*-*-*-Sorted by name-*-*-*-*-*");
        Collections.sort(cars);
        printCars(cars);
        
        //Create comparator anonymus  inner class and sort by price
        Comparator <Car> sortCarbyPrice = new Comparator <Car>()
        {
            public int compare(Car c1, Car c2)
            {
                return Double.compare(c1.price, c2.price);
            }
        };
        
        //Sort by price
        System.out.println("*-*-*-*-*-Sort by price-*-*-*-*-*");
        Collections.sort(cars, sortCarbyPrice);
        printCars(cars);
        printCarsSumAndAverage(cars);
    }
    
    public static void printCars(List <Car> carList){
            for (Car oneCar : carList) {
                System.out.println(oneCar);
            }
    }
    
    public static void printCarsSumAndAverage(List <Car> carList)
    {
        double sum = 0;
        
        for (Car oneCar : carList){
            sum += oneCar.price;
        }
        
        System.out.println("------------------------------");
        System.out.println("Sum: $" + String.format("%,.2f",sum));
        System.out.println("Average: $" + String.format("%,.2f", sum/carList.size()));
    }
}
