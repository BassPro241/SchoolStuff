package shapes;

public class Rectangle {
	
	protected double length;
	protected double height;

	
	public Rectangle(double l, double h)
	{
		length = l;
		height = h;
	}
	
	public Rectangle()
	{
		length = 1.0;
		height = 1.0;
	}
	
	public double getArea()
	{
		double area = getLength() * getHeight();
		return area;
	}
	
	public void setLength(double newLength) {
		length = newLength;
	}

	public double getLength() {
		return length;
	}

	public void setHeight(double newHeight) {
		height = newHeight;
	}

	public double getHeight() {
		return height;
	}
}
