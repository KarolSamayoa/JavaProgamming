public class ArrayManipulator 
{
    private int[]numbers;
    
    public ArrayManipulator(int[] numbers) 
    {
        this.numbers= numbers;
    }
    
    public int getMaximum()
    {
        int max = numbers[0];
        
        for (int num : numbers) 
        {
            if (num > max)
            {
                max = num;
            }
        } return max; 
    }
    
    public int getMin()
    {
        int min = numbers[0];
        
        for (int num : numbers) 
        {
            if (num < min) 
            {
                min = num;
            }
        } return min;
    }
    
    public double getAverage()
    {
        int sum = 0;
        for (int num : numbers)
        {
            sum+=num;
        } return (double)sum /numbers.length;
    }
    
} 
