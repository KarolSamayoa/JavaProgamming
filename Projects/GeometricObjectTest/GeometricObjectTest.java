abstract class GeometricObject 
{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated; 


    protected GeometricObject (){
        dateCreated = new java.util.Date();
}

    protected GeometricObject(String color, boolean filled)
{
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled= filled;
}

    public String getColor()
{
    return color;
}

    public void setColor(String color) {
    this.color = color;
}

    public boolean isFilled()
{
    return filled;
}

    public void setFilled(boolean filled)
{
    this.filled = filled; 
}

    public java.util.Date getDateCreated()
{
    return dateCreated;
}

    @Override
    public String toString ()
{
    return "created on "+ dateCreated + "\ncolor: " + color +
        " and filled: " + filled;
}

    public abstract double getArea();

    public abstract double getPerimeter();
    
}


class Circle extends GeometricObject 
{
    private double radius;
    
    public Circle(){
        
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea()
    {
        return radius * radius* Math.PI;
    }
    
    public double getDiameter()
    {
        return 2 * radius;
    }
    
    @Override
    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }
    
    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated()+ 
        " and the radius is " + radius);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " radius: " + radius;
    }
}

class Rectangle extends GeometricObject
{
    private double width;
    private double height; 
    
    public Rectangle(){}
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setWidth(double width){
        this.width = width; 
    }
    public double getHeight()
    {
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return width * height;
    }
    
    @Override 
    public double getPerimeter(){
        return 2 * (width + height);
    }
    
    @Override
    public String toString(){
        return super.toString() + " width: " + width + " height: " +height;
    }
}

public class GeometricObjectTest
{
	public static void main(String[] args) {
		
		Circle c1 = new Circle(3.5);
		//c1.printCircle();
		System.out.print("A circle: " + c1 + "\n\n");
		
		Rectangle r1 = new Rectangle(5.0, 9.5);
		System.out.println("A rectangle: " + r1 + "\n\n");
		
		GeometricObject g1 = new Circle(5);
		GeometricObject g2 = new Rectangle(5,3);
		
		System.out.println("The 2 objects have the same area? " + equalArea(g1,g2));
		displayGeometricObject(g1);
		displayGeometricObject(g2);
	}
	
	public static boolean equalArea(GeometricObject g1, GeometricObject g2){
	    return g1.getArea() == g2.getArea();
	}
	
	public static void displayGeometricObject(GeometricObject object){
	    System.out.println();
	    System.out.println("The area is " + object.getArea());
	    System.out.println("The perimeter is " + object.getPerimeter());
	}
}

