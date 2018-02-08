package edu.pupr.Shape;

public class Circle extends TwoDimensionalShape
{
	// Constructor with three variables as arguments
	public Circle(int x, int y, int radius)
	{
		super(x, y, radius, radius);

	} // end three-argument Circle constructor

	//returns the name of the shape(here,circle)
	public String getName()
	{
		return "Circle";
	}

	//returns the area of the circle

	public int getArea()

	{
		int area = (int) (Math.PI*getDim1()*getDim1());
		return area;

	}

} // end Circle Class.