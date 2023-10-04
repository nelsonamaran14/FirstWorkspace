package in.mindcraft;

public class SalesPerson extends WageEmployee {

	private int sales;
	private int comm;
	
	public SalesPerson() {
		sales = 1;
		comm= 100;
	}
	
	public SalesPerson(int h, int r, int s, int c) {
		super();
		sales=s;
		comm=c;
		
	}
	public int calculateSalary{
		return super.calculateSalary() + sales*comm;
	}
	
	public void show() {
		super.show();
		System.out.println(sales);
		System.out.println(comm);
	
		
	}
}
