import java.util.*;
interface A{
	void area();
	void perimeter();
}

class Circle implements A{
	int r;
	double pi=3.14,p,a;
	Circle(int rad){
		r=rad;
	}
	public void perimeter() {
		p=(2*pi*r);
	System.out.println("Perimeter of Circle is: "+p);
	}
	public void area() {
		a=pi*r*r;
	System.out.println("Area of Circle is: "+a);
	}
}

class Rectangle implements A{
	int l,b,pe,ae;
	Rectangle(int len,int bre) {
		l=len;
		b=bre;
	}
	public void perimeter() {
		pe=2*(l+b);
	System.out.println("Perimeter of Rectangle is: "+pe);
	}
	public void area() {
		ae=l*b;
	System.out.println("Area of Rectangle is: "+ae);
	}
}	
public class Interface {
	public static void main(String args[]) {
		int ch;
		boolean result=true;
		System.out.println("To calculate: ");
		System.out.println("\n1.Circle:\n2.Rectangle\n");
		Scanner sc=new Scanner(System.in);
		while(result) {
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			
			case 1: System.out.println("Enter the radius of the circle: ");
					int r=sc.nextInt();
					Circle ci=new Circle(r);
					ci.area();
					ci.perimeter();
			break;
			case 2:System.out.println("Enter the length of the rectangle: ");
					int l=sc.nextInt();
					System.out.println("\nEnter the breadth of the rectangle: ");
					int b=sc.nextInt();
					Rectangle re=new Rectangle(l,b);
					re.perimeter();
					re.area();
			break;
			case 3:result=false;
			break;
			}
		}
	}
}
