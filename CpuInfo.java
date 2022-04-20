import java.util.Scanner;

class Cpu{
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double Cache() {
			return 4.3;
		}
	}
	static class Ram{
		double memory;
		String manufacturer;
		double ClockSpeed() {
			return 5.5;
		}
	}
}
public class CpuInfo {
	public static void main(String[] args) {
		Cpu cp=new Cpu();
		Cpu.Processor p=cp.new Processor();
		Cpu.Ram r=new Cpu.Ram();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the price of the CPU");
		cp.price=s.nextDouble();
		System.out.println("Enter the cores of the processor");
		p.cores=s.nextDouble();
		System.out.println("Enter the manufacturer of the processor");
		p.manufacturer=s.next();
		System.out.println("Enter the memory");
		r.memory=s.nextDouble();
		System.out.println("Enter the manufacturer");
		r.manufacturer=s.next();
		System.out.println("The price of the CPU is "+cp.price);
		System.out.println("The cores of the processor is "+p.cores);
		System.out.println("The manufacturer of the processor is "+p.manufacturer);
		System.out.println("The Processor Cache is "+p.Cache());
		System.out.println("The memory is "+r.memory);
		System.out.println("The manufacturer is "+r.manufacturer);
		System.out.println("The RAM Clock speed is "+r.ClockSpeed());
	}

}
