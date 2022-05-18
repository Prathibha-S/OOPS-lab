import java.io.*;
import java.util.*;
public class Employee {
int eno;

String ename;
double salary;
void input() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the employee id:");
eno=sc.nextInt();
System.out.println("Enter the employee name:");
ename=sc.next();
System.out.println("Enter the employee salary");
salary=sc.nextDouble();
}
void display() {
System.out.println("Employee id is:"+eno);
System.out.println("Employee name is:"+ename);
System.out.println("Employee salary is"+salary);
}
public static void main(String args[]){
int n,empno,f=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of employees");
n=sc.nextInt();
Employee e[]=new Employee[n];
for(int i=0;i<n;i++) {
	e[i]=new Employee();
	e[i].input();
	System.out.println("\n");
}
System.out.println("Display the details of employees");
for(int i=0;i<n;i++) {
	e[i].display();
	System.out.println("\n");
}
System.out.println("Enter the employee no to be searched:");
empno=sc.nextInt();
for(int i=0;i<n;i++) {
	if(empno==e[i].eno) {
		e[i].display();
		System.out.println("\n");
		f=1;
}
}
if(f!=1) {
	System.out.println("Employee does not exist");
}
}
}
