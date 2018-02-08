package edu.pupr.Shape;

public class Sphere extends ThreeDimensionalShape
{

	// three-argument constructor
	public Sphere(int x, int y, int radius)
	{
		super(x, y, radius, radius, radius);

	} // end three-argument Shape constructor

	//returns the area of the sphere
	public int getArea()
	{
		int area = (int) (4 * Math.PI * getDim1() * getDim1()); // area = 4 * PI * r^2
		return area;

	}

	//returns the volume of the sphere
	public int getVolume()
	{
		int vol = (int)( ((double)4/3) * Math.PI * getDim1() * getDim1() * getDim1()); // volume = (4/3) * PI * r^3
		return vol;

	}

	//returns the name of the shape(here,Sphere)
	public String getName()
	{
		return "Sphere";

	}

} // end Class Sphere