package javaprograms;
import java.util.Scanner;
class CalculateArea{
double a;
void Area(float b,float l) {
a=l*b;
System.out.println("Area of rectangle ="+a);
}
void Area(int ba,int al) {
a=0.5*al*ba;
System.out.println("Area of triangle ="+a);
}
void Area(int r) {
a=3.14*r*r;
System.out.println("Area of circle ="+a);
}
void Area(float sq) {
a=sq*sq;
System.out.println("Area of square ="+a);
}
}
class Area {
public static void main(String[] args) {
int ch,r,al,ba;
float l,b,sq;
Scanner read=new Scanner(System.in);
while (true) {
    System.out.println("To find the area of");
System.out.println("1.Circle\t2.Triangle\t3.Rectangle\t4.Square\t5.Exit");
ch=read.nextInt();
CalculateArea object=new CalculateArea();
switch(ch) {
case 1:System.out.println("Circle");
System.out.println("Radius:");
r=read.nextInt();
object.Area(r);
break;
case 2:System.out.println("Triangle");
System.out.println("Enter the base length");
ba=read.nextInt();
System.out.println("Enter the altitude");
al=read.nextInt();
object.Area(ba,al);
break;
case 3:System.out.println("Rectangle");
System.out.println("Enter the breadth");
b=read.nextInt();
System.out.println("Enter the length");
l=read.nextInt();
object.Area(b,l);
break;
case 4:System.out.println("Square");
System.out.println("Enter the side of square");
sq=read.nextInt();
object.Area(sq);
break;
case 5:System.out.println("Exiting...");
System.exit(0);
default:System.out.println("Enter correct choice");
}
}
}
}