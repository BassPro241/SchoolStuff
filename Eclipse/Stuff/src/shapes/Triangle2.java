package shapes;

public class Triangle2 extends Triangle{

	protected double side1;
	protected double side2;
	protected double side3;
	
	Triangle2()
	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle2(double a, double b, double c)
	{
		side1 = a;
		side2 = b;
		side3 = c;
	}

	public double getHeron() {
		double s = ((getSide1() + getSide2() + getSide3()) / 2.00);
		double areap1 = s * (s - getSide1()) * (s - getSide2()) * (s - getSide3());
		double area = Math.sqrt(areap1);
		area = ((100) * Math.round(area)) / 100;
		return area;
	}

	public void setSide1(double newSide) {
		side1 = newSide;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide2(double newSide) {
		side2 = newSide;
	}

	public double getSide2() {
		return side2;
	}
	public void setSide3(double newSide) {
		side3 = newSide;
	}

	public double getSide3() {
		return side3;
	}
}
