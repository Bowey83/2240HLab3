
public class Circle {
	private double radius;
    private final double PI = 3.14159;

    // no argument Constructor
    public Circle()
    {
        radius = 0;
    }
    // one argument Constructor
    public Circle(double rad)
    {
        // make sure the parameter is not negative
        if (rad < 0)
            radius = 0;
        else
            radius = rad;
    }
    public void setRadius(double rad)
    {
    	if (rad < 0)
    		radius = 0;
    	else
    		radius = rad;
    }
    public double getRadius() {
    	return radius;
    }

    // GetArea Method
    public double GetArea()
    {
        double area;
        // compute the area = radius^2 * PI
        area = radius * radius * PI;
        return area;
    }
    //overloaded > operator to compare circles
    public boolean isGreater(Circle circle1) {

      if(circle1.radius < radius)
    	  return true;

      return false;
  }
}
