package edu.pupr.Shape;

public class Square extends TwoDimensionalShape
{

	// three-argument constructor
	public Square(int x, int y, int side)
	{
		super(x, y, side, side);

	} // end three-argument Square constructor

	//returns the area of the square
	public int getArea()
	{
		int area = getDim1() *getDim1();
		return area;
	}

	//returns the name of the shape(here,Square)
	public String getName()
	{
		return "Square";
	}

} // end of Square Class