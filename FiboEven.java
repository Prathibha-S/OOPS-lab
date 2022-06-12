class FiboThread implements Runnable{
	public void run() {
		int a=0,b=1,c=0;
		System.out.println("Fibbonacci Thread : "+a);
		System.out.println("Fibbonacci Thread : "+a);
		for(int h=1;h<=7;h++) {
			c=a+b;
			System.out.println("Fibbonacci Thread : "+c);
			a=b;
			b=c;
		}
	}
}
class EvenRangeThread implements Runnable{
	public void run() {
		int a=2,b=10;
		for(int k=a;k<=b;k+=2) {
			System.out.println("Even Thread : "+k);
		}
	}
}
public class FiboEven {

	public static void main(String[] args) {
		FiboThread ft=new FiboThread();
		EvenRangeThread et=new EvenRangeThread();
		Thread t1=new Thread(ft);
		Thread t2=new Thread(et);
		t1.start();
		t2.start();

	}

}
