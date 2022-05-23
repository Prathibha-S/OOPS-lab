import graphics.*;
import java.util.*;
public class Shapes {

	public static void main(String[] args) {
		int ch,r,l,b,le,al,a;
		boolean result=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("To calculate");
		System.out.println("\n1.Rectangle\t2.Triangle\t3.Square\t4.Circle");
		while(result) {
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			
			case 1: System.out.println("Enter the length of rectangle:");
					l=sc.nextInt();
					System.out.println("Enter the breadth of rectangle:");
					b=sc.nextInt();
					Rectangle re=new Rectangle(l,b);
					re.area();
				break;
			case 2: System.out.println("Enter the base length of triangle:");
					le=sc.nextInt();
					System.out.println("Enter the altitude of triangle:");
					al=sc.nextInt();
					Triangle t=new Triangle(le,al);
					t.area();
				break;
			case 3:	System.out.println("Enter the side of square:");
					a=sc.nextInt();
					Square s=new Square(a);
					s.area();
				break;
			case 4:	System.out.println("Enter the radius of circle:");
					r=sc.nextInt();
					Circle c=new Circle(r);
					c.area();
				break;
			case 5: result=false;
			break;
	}
		}
	}
}
