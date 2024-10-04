/**
 * This program demonstrate the Rectangle class's
 * setLength, setWidth, getWid
 */

public class LengthDemo 
{
    public static void main(String[] args) 
    {
        //Create a rectangle object and assign its
        //address to the box available. 
        Rectangle box = new Rectangle();
        
        
        //Call the box object's setLength method.
        box.setLength(10.0);
        
        //Call the object's setWidth method, passing 20.0
        //as an argument.
        box.setWidth(20.0);
        
        //Display the object's Lenth and Width.
        System.out.println("The box's length is " +
                            box.getLength());
        System.out.println("The box's width is " +
                            box.getWidth());
        
        //Display the area.
        System.out.println("The box's area is " +
                            box.getArea());
    }
}
