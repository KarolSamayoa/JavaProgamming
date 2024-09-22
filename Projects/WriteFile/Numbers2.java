
import java.io.*;

public class Numbers2
{
	public static void main(String[] args) throws IOException
	{
	PrintWriter outputFile = new PrintWriter("Numbers2.txt");
	
	for (int i=1; i < 50; i++)
	{
	    outputFile.println(i);
	}
	outputFile.close();	
	}
}
