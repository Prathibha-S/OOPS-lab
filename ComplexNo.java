import java.util.*;
class ComplexNo{
	double real;
	double img;
	ComplexNo(double real,double img){
		this.real=real;
		this.img=img;
	}
	ComplexNo(){
	}
ComplexNo add(ComplexNo c1,ComplexNo c2) {
	ComplexNo temp=new ComplexNo();
	temp.real=c1.real+c2.real;
	temp.img=c1.img+c2.img;
	return temp;
}
public static void main(String[] args) {
		ComplexNo c1=new ComplexNo();
		ComplexNo c2=new ComplexNo();
		ComplexNo c3=new ComplexNo();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the real part of first complex no");
		c1.real=s.nextDouble();
		System.out.println("Enter the imaginary part of first complex no");
		c1.img=s.nextDouble();
		System.out.println("Enter the real part of second complex no");
		c2.real=s.nextDouble();
		System.out.println("Enter the imaginary part of second complex no");
		c2.img=s.nextDouble();
		System.out.println("The addition of two complex numbers is:");
		c3=c3.add(c1,c2);
		System.out.println(c3.real+" i"+c3.img);
	}

}
