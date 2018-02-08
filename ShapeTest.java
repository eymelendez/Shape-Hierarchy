/*
 * Filename: ShapeTest.java
 * 
 * Author: Edwin Y. Melendez Lopez #89139
 * 
 * Description: 
 *  
 * 			History:
 * 			01/28/2018 - Created Program. EML
 *  		01/28/2018 - Created Abstract Class Shape. EML
 * 			01/28/2018 - Created Setters and getters. EML
 * 			01/28/2018 - Created toString() for Class Shape. EML
 * 			01/28/2018 - Fixed some errors. EML
 * 
 * 			01/28/2018 - Created Class TwoDimensionalShape. EML
 * 			01/28/2018 - Created Setters and getters. EML
 * 			01/28/2018 - Created toString() for Class TwoDimensionalShape. EML
 * 
 *   		01/28/2018 - Created Class ThreeDimensionalDimensional. EML
 * 			01/28/2018 - Created Setters and getters. EML
 * 			01/28/2018 - Created toString() for Class ThreeDimensional. EML
 * 
 *  		01/28/2018 - Created Class Circle. EML
 * 			01/28/2018 - Created Setters and getters. EML
 * 			01/28/2018 - Created toString() for Class Circle. EML
 * 
 *  		01/28/2018 - Created Class Square. EML
 * 			01/28/2018 - Created Setters and getters. EML
 * 			01/28/2018 - Created toString() for Class Square. EML
 * 
 * 			01/29/2018 - Created Class Cube. EML
 * 			01/29/2018 - Created Setters and getters. EML
 * 			01/29/2018 - Created toString() for Class Cube. EML
 * 
 * 			01/29/2018 - Created Class Sphere. EML
 * 			01/29/2018 - Created Setters and getters. EML
 * 			01/29/2018 - Created toString() for BasePlusCommissionEmployee. EML
 * 
 * 			01/30/2018 - Added Some Throw new exceptions.EML
 * 			01/30/2018 - Began tests. EML
 * 			01/30/2018 - Fixing Issues. EML
 * 			01/31/2018 - Tested Program , documentation complete. Ready to submit EML
 * */

package edu.pupr.Shape;

public class ShapeTest
{

	// create Shape objects and display their information
	public static void main(String args[])
	{
		// Polymorphism 
		
		Shape shapes[] = new Shape[4];
		shapes[0] = new Circle(22, 88, 4);
		shapes[1] = new Square(71, 96, 10);
		shapes[2] = new Sphere(8, 89, 2);
		shapes[3] = new Cube(79, 61, 8);
		
		// call method print on all shapes
		for (Shape currentShape : shapes)
		{

			System.out.printf( "%s: %s",currentShape.getName(), currentShape );

			// The java "instanceof" operator is used to test whether the object is 
			// an instance of the specified type (class or subclass or interface). 
			// The instanceof in java is also known as type comparison operator because
			// it compares the instance with type. It returns either true or false.
			
			if (currentShape instanceof TwoDimensionalShape)
			{
				TwoDimensionalShape twoDimensionalShape =
						(TwoDimensionalShape) currentShape;

				System.out.printf( "%s's area is %s\n",
						currentShape.getName(), twoDimensionalShape.getArea() );

			} // end if

			if (currentShape instanceof ThreeDimensionalShape)
			{
				ThreeDimensionalShape threeDimensionalShape =
						(ThreeDimensionalShape) currentShape;

				System.out.printf( "%s's area is %s\n",
						currentShape.getName(), threeDimensionalShape.getArea() );

				System.out.printf( "%s's volume is %s\n",
						currentShape.getName(),

						threeDimensionalShape.getVolume() );
			}

			System.out.println();

		} // end for

	} // end main

} // end class ShapeTest


/* 

Circle: [22, 88]Circle's area is 50

Square: [71, 96]Square's area is 100

Sphere: [8, 89]Sphere's area is 50
Sphere's volume is 33

Cube: [79, 61]Cube's area is 384
Cube's volume is 512

*/