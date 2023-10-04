package in.mindcraft;

public class WageEmployee extends Employee {
	private int hours;
	private int rate;
	
	public WageEmployee() {
		hours = 1;
		rate = 100;
	}
	
	public WageEmployee(int id, String n, int d, int m, int y, int h, int r) {
		super(id,n,d,m,y);
		hours=h;
		rate=r;
		
	}
	
	public int calculateSalary;
	{
		return hours*rate;
		
	}
	
	public void show() {
	
		super.show();
		System.out.println(hours);
		System.out.println(rate);
	
		
	}
}
