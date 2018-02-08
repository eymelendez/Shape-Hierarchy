package edu.pupr.Shape;

public abstract class TwoDimensionalShape extends Shape
{

	private int dimension1;
	private int dimension2;

	public TwoDimensionalShape(int x, int y, int d1, int d2)
	{
		super( x, y );
		dimension1 = d1;
		dimension2 = d2;

	} // end four-argument TwoDimensionalShape constructor

	//returns the dimension1
	public int getDim1()
	{
		return dimension1;
	}

	//returns the dimension2

	public int getDim2()
	{
		return dimension2;
	}

	//abstract method

	public abstract int getArea();

} // end TwoDimensionalShape Class