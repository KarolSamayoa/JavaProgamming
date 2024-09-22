import java.util.Scanner; 

public class DiscountCalculator 
{
    //funtion to ccalculate the discount percentage based on the quantity
    public static double getDiscountPercentage (int quantity)
    {
        if (quantity < 10)
        {
            return 0.0; 
        } else if (quantity >=10 && quantity <=20)
        {
            return 20.0;
        } else if (quantity >=21 && quantity <=50)
        {
            return 40.0;
        } else if (quantity >=51 && quantity <=100)
        {
            return 60.0;
        } else 
        {
            return 70.0;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //input item details
        System.out.println("Please enter the name, the price of the item, and the quantity:");
        String itemName = input.nextLine(); //name of the itemName
        double price = input.nextDouble();  //price of the itemName
        int quantity = input.nextInt();     //quantity of the itemName
        
        //Get the discount percentage based on quantity
        double discountPercentage = getDiscountPercentage(quantity);
        
        //Calculate discount amount
        double discountAmount = (discountPercentage/100) * price * quantity;
        
        //Calculate total price after applying discount. 
        double totalPrice = (price * quantity) - discountAmount;
        
        //Output formatted results. 
        System.out.printf("Name = %s\n", itemName);
        System.out.printf("Price = %.2f\n", price);
        System.out.printf("Quantity = %d\n", quantity);
        System.out.printf("Discount percentage = %.1f%%\n", discountPercentage);
        System.out.printf("Disount amount = $%.2f\n", discountAmount);
        System.out.printf("Total = $%.2f\n", totalPrice);
        
       
    }
    
}
