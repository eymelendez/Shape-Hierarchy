package edu.pupr.Shape;

public class Cube extends ThreeDimensionalShape
{
	// three-argument constructor
	public Cube(int x, int y, int side)
	{
		super(x, y, side, side, side);

	} // end three-argument Cube constructor

	//returns the name of the shape(here,Cube)
	public String getName()
	{
		return "Cube";
	}

	//returns the area of the cube
	public int getArea()
	{
		int area = 6 * getDim1() * getDim1(); // area = 6 * a^2
		return area;

	}

	//returns the volume of the cube
	public int getVolume()
	{
		int vol = getDim1() * getDim1() *getDim1(); // area = a^3
		return vol;

	}

} // end Cube Class.