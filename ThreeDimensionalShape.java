package edu.pupr.Shape;

public abstract class ThreeDimensionalShape extends Shape
{

	private int dimension1;
	private int dimension2;
	private int dimension3;

	// five-argument constructor
	public ThreeDimensionalShape(int x, int y, int d1, int d2, int d3)
	{
		super(x, y);
		dimension1 = d1;
		dimension2 = d2;
		dimension3 = d3;
		
	} // end five-argument ThreeDimensionalShape constructor

	//returns dimenstion1
	public int getDim1()
	{
		return dimension1;
	}
	
	//returns dimenstion2
	public int getDim2()
	{
		return dimension2;
	}

	//returns dimenstion3
	public int getDim3()

	{
		return dimension3;
	}

	//abstract methods
	public abstract int getArea();
	public abstract int getVolume();

} // end ThreeDimensionalShape