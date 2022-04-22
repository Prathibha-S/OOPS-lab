import java.util.*;
public class StringMenudriven{
	public static void main(String[] args) {
		int n,ch;
		boolean result=true;
		System.out.println("Java String Operations");
		System.out.println("\n1.Create new string\n2.String length\n3.String Concatenation\n4.Character extraction\n5.String Comparison\n6.Searching substrings\n7.Modifying a string");
			Scanner sc=new Scanner(System.in);
			while(result) {
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("\nEnter String: ");
					String stri1 = new String();
					stri1 = sc.nextLine();
					stri1+= sc.nextLine();
					System.out.println("Entered String is: "+stri1);
			break;
			case 2:System.out.println("\nEnter String: ");
					String str = new String();
					str = sc.nextLine();
					str+= sc.nextLine();
					int len = str.length();
					System.out.println("Length of String is: "+(len));
			break;
			case 3:Scanner s=new Scanner(System.in);
					System.out.println("Enter the first string:");
					String str1=s.nextLine();
					System.out.println("Enter the second string:");
					String str2=s.nextLine();
					System.out.println("Concatenation of given two strings are");
					String joinedString=str1.concat(str2);
					System.out.println(joinedString);
			break;
			case 4:System.out.println("\nEnter String: ");
					String st = new String(sc.next());
					System.out.println("Enter an index");
					int i=sc.nextInt();
					char c = st.charAt(i);
					System.out.println("character at " + i + " is " + c);
			break;
			case 5:System.out.println("Enter Your First String");
					String stringg1=sc.next();
					System.out.println("Enter Your Second String");
					String stringg2=sc.next();
					if(stringg1.equals(stringg2)) {
						System.out.println("Both Strings are equal");
					}
					else {
						System.out.println("Strings are not equal");
					}
			break;
			case 6:System.out.println("Enter the String");
					String ss1=sc.next();
					System.out.println("Entered String is: " + ss1);
					System.out.println("Enter SubString");
					String ss2=sc.next();
					int index = ss1.indexOf(ss2);
					System.out.printf("Substring " + ss2 + " is at index %d\n", index);
			break;
			case 7:System.out.println("\nEnter String: ");
					String ss = new String();
					ss = sc.next();
					System.out.println("Entered String is: "+ss);
					System.out.println("Enter where to replace..");
					String re=sc.next();
					System.out.println("Enter word to replace..");
					String rep=sc.next();
					String replaced=ss.replace(re, rep);
					System.out.println("After replacing: "+replaced);
			break;
			case 8:result=false;
			break;
			
			}
		}
		}
}

