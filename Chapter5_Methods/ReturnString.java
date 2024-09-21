/**
 * This program demonstrate a method that 
 * returns  a reference to a String object.
 */

public class ReturnString 
{
    public static void main (String[] args) 
    {
        String customerName; 
        
        customerName = fullName("Karol", "Samayoa");
        System.out.println(customerName);
    }
    
    /**
     * The fullName method accepts two Strings arguments
     * containing a first and last name. it concatenates
     * them into a single String object.
     * @param first The first name.
     * @param last The last name.
     * @return A reference to a String object containing 
     * the first and last names.
     */
    
    public static String fullName(String first, String last)
    {
        String name = first+ " "+ last;
        return name;
    }
}
