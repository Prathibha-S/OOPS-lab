import java.util.Scanner;
import java.lang.Exception;
class UserException extends Exception{
UserException(String msg){
System.out.println(msg);
}
}
class PassException extends Exception{
PassException(String msg){
System.out.println(msg);
}
}
public class UserPswd {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
String u,p;
System.out.println("Enter the username: ");
u=sc.nextLine();
System.out.println("Enter the password: ");
p=sc.nextLine();
int len=u.length();
try {
if(len<8)
throw new UserException("Username must be greater than 8 characters.\n");
else if(!p.equals("admin"))
throw new PassException("Password is incorrect.");
else
System.out.println("Login successfully");
}
catch(UserException user) {
System.out.println(user);
}
catch(PassException pass) {
System.out.println(pass);
}
}

}