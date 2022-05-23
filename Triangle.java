package graphics;

public class Triangle {
	int le,al;
	public Triangle(int bl,int at){
		le=bl;
		al=at;
	}
	public void area() {
		System.out.println("Area of triangle is:"+(0.5*le*al));
	}
}
