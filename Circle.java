package graphics;

public class Circle {
	int r;
	double pi=3.14;
	
	public Circle(int radius) {
		r=radius;
		
		

	}
	public void area() {
	System.out.println("Area of circle: "+(pi*r*r));
	}
}
