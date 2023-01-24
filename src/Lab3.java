import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		double inpRadius;
		// create a circle object with no arg constructor
		Circle cir1 = new Circle();
		// create a circle object with one arg constructor
		Circle cir2 = new Circle(10);

		// print out the area of the circles
		System.out.println("circle 1 has radius " + cir1.getRadius() + " and area " + cir1.GetArea());
		System.out.println("circle 2 has radius " + cir2.getRadius() + " and area " + cir2.GetArea());

		//prompt the user for a radius
		do
		{
			System.out.println("Enter a positive radius => ");
			inpRadius = scan.nextDouble();
		} while (inpRadius < 0);
			
		cir1.setRadius(inpRadius);

		// print out the area of the circles
		System.out.println("circle 1 has radius " + cir1.getRadius() + " and area " + cir1.GetArea());
		System.out.println("circle 2 has radius " + cir2.getRadius() + " and area " + cir2.GetArea());

		//add circles
		if(cir1.isGreater(cir2))
		  System.out.println("Circle 1, with radius " + cir1.getRadius() + " is bigger than circle 2 with radius " + cir2.getRadius());
	   else
		  System.out.println("Circle 1, with radius " + cir1.getRadius() + " is not bigger than circle 2 with radius " + cir2.getRadius());
	}
}
