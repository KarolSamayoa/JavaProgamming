import java.util.*;

public class ArrayMaxMinAvg 
{
    public static void main (String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        
        for (int i = 0; i < size; i++) 
        {
            array[i] = Integer.parseInt(inputs[i]);
        }
        
        ArrayManipulator manipulator = new ArrayManipulator(array);
        System.out.println("Maximum value: " + manipulator.getMaximum());
        System.out.println("Minimum value: " + manipulator.getMin());
        System.out.println("Average value: " + manipulator.getAverage());
    }
}
