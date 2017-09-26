/**
 * 
 */
package assignment5_1;
import java.util.Scanner;

/**
 *  Abstract class polygon with abstract method area
 *
 */
abstract class Polygon {
	
	abstract int area(); // Abstract method area
	
}

/**
 * Class rectangle includes properties of rectangle that extends Polygon
 *
 */
class Rectangle extends Polygon {
	
	int breadth; // Declaring breadth of Rectangle as instance variable
	int height;	// Declaring height of Rectangle as instance variable
	
	int area() { // abstract method overridden to calculate area of the rectangle
		return this.breadth*this.height;
	}
}

/**
 * Class to calculate area of the rectangle
 *
 */
public class Assignment5_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // main method starts
		// TODO Auto-generated method stub
		Scanner mScanner= new Scanner(System.in); // Creating object for scanner to take input
		Rectangle mRectangle= new Rectangle();    // Creating object for Rectangle
		
		System.out.println("Enter the breadth of rectangle : "); // Printing message to take input of breadth
		mRectangle.breadth=mScanner.nextInt();					// Assigning variable to instance variable breadth
		
		System.out.println("Enter the height of rectangle : ");	// Printing message to take input of height
		mRectangle.height=mScanner.nextInt();					// Assigning variable to instance variable height 
		
		System.out.println("Area of the rectangle is "+ mRectangle.area()); // Printing the area of the rectangle using area  method 
		
		mScanner.close();									// Close scanner object
		

	}

}// class closed
