package shapes;

public class Circle {
	
	protected double radius;

	public Circle(double r)
	{
		radius = r;
	}
	
	public double getArea()
	{
		double area = Math.PI * Math.pow(getRadius(), 2.0);
		return area;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
}
