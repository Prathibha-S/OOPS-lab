package graphics;

public class Rectangle {
	int l,b;
	public Rectangle(int le,int br) {
		l=le;
		b=br;
	}
	public void area() {
		System.out.println("Area of rectangle is:"+(l*b));
	}
}
