import java.util.*;
class P{
	int pcode;
	String pname;
	int price;
P(){
	pcode=1007;
	pname="Bag";
	price=432;
}
P(int pcode,String pname,int price){
	this.pcode=pcode;
	this.pname=pname;
	this.price=price;
}
void display(){
	System.out.println("The product code is:"+pcode+",product name is:"+pname+"and product price is:"+price);
}
}
class Product{
	public static void main(String args[]){
		P a=new P();
		P b=new P(2091,"Book",250);
		System.out.println("The first product");
		a.display();
		System.out.println("The second product");
		b.display();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the third product's productcode,product name ,product price");
		int pcode=s.nextInt();
		String pname=s.nextLine();
		pname+=s.nextLine();
		int price=s.nextInt();
		System.out.println("The third product");
		P c=new P(pcode,pname,price);
		c.display();
		if(a.price<b.price && a.price<c.price){
			System.out.println("The product with low price is:"+a.pname+","+a.price);
		}
		else if(b.price<a.price && b.price<c.price){
			System.out.println("The product with low price is:"+b.pname+","+b.price);
		}
		else{
			System.out.println("The product with low price is:"+c.pname+","+c.price);
		}
	}
}
