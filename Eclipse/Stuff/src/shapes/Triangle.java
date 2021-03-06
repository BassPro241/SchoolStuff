package shapes;

public class Triangle {

	protected double base;
	protected double height;

	public Triangle(double b, double h) {
		base = b;
		height = h;
	}

	public Triangle() {
		base = 1.0;
		height = 1.0;
	}

	public double getArea() {
		double area = (1.00 / 2.00) * getBase() * getHeight();
		return area;
	}

	public void setBase(double newBase) {
		base = newBase;
	}

	public double getBase() {
		return base;
	}

	public void setHeight(double newHeight) {
		height = newHeight;
	}

	public double getHeight() {
		return height;
	}


}
