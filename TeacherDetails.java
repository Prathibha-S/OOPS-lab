import java.util.*;

class Person{
	String name;
	String gender;
	String address;
	int age;
	Person(String a,String b,String c,int d){
		name=a;
		gender=b;
		address=c;
		age=d;
	}
}
class Employee1 extends Person{
	int empid;
	String cpname;
	String qualification;
	int salary;
	Employee1(String a,String b,String c,int d,int e,String f,String g,int h){
		super(a,b,c,d);
		empid=e;
		cpname=f;
		qualification=g;
		salary=h;
	}
}
class Teacher extends Employee1{
	String sub;
	String dep;
	int tid;
	Teacher(String a,String b,String c,int d,int e,String f,String g,int h,String i,String j,int k){
		super(a,b,c,d,e,f,g,h);
		sub=i;
		dep=j;
		tid=k;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
		
		System.out.println("Employee id: "+empid);
		System.out.println("CompanyName: "+cpname);
		System.out.println("Qualification: "+qualification);
		System.out.println("Salary: "+salary);
		
		System.out.println("Subject: "+sub);
		System.out.println("Department: "+dep);
		System.out.println("Teacher id: "+tid);
	}
}
public class TeacherDetails {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of teachers");
		n=sc.nextInt();
		Teacher t[]=new Teacher[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Name");
			String a1=sc.next();
			System.out.println("gender");
			String a2=sc.next();
			System.out.println("Address");
			String a3=sc.next();
			System.out.println("Age");
			int a4=sc.nextInt();
			System.out.println("Employeeid:");
			int a5=sc.nextInt();
			System.out.println("CompanyName:");
			String a6=sc.next();
			System.out.println("Qualification:");
			String a7=sc.next();
			System.out.println("Salary");
			int a8=sc.nextInt();
			System.out.println("Subject:");
			String a9=sc.next();
			System.out.println("Department:");
			String a10=sc.next();
			System.out.println("Teacherid:");
			int a11=sc.nextInt();
			
			t[i]=new Teacher(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11);
			
		}
		for(int i=0;i<n;i++) {
		t[i].display();
		System.out.println("\n");
		}
	}
}
