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
		System.out.println("The Processor Cache is "+p.Cache());
		System.out.println("The RAM Clock speed is "+r.ClockSpeed());
	}

}
