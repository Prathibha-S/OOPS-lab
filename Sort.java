import java.util.Arrays;
import java.util.*;
public class Sort{

	public static void main(String[] args) {
		int n1,ch;
		boolean t=true;
	    Scanner r=new Scanner(System.in);
		
		n1=2;
		String a[]=new String[n1];
	 		
		System.out.println("1.Insert String:");
		System.out.println("2.Sort function:");
		System.out.println("3.sort");
		System.out.println("4.display:");
		System.out.println("5.Exit");
		while(t)
		{
			System.out.println("Enter your choice:");
			ch=r.nextInt();
			
			switch(ch) {
			
			case 1 : 
				System.out.println("Enter the no of strings:");
				n1=r.nextInt();
				a=new String[n1];
				for(int i=0;i<n1;i++)
				{
					a[i]=r.next();
				}
				break;
			case 2 :
				Arrays.sort(a);
				break;
			case 3 : 
				for(int i=0;i<n1-1;i++)
				{
					for(int j=i+1;j<n1;j++)
					{
						if(a[i].compareTo(a[j])>0)
						{
							String temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
					
				}
				break;
			case 4 : 
				System.out.println(Arrays.toString(a));
				break;
			
			case 5 :
				t=false;
				break;
				
			}
		}
		
	}

}