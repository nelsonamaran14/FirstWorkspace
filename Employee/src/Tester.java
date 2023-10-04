class Employee{
	private int employeeId;
	private String name;
	private double basicsalary;
	
	
	
	public Employee() {
		
	}



	public Employee(int employeeId, String name, double basicsalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.basicsalary = basicsalary;
	}



	public double getBasicsalary() {
		return basicsalary;
	}



	public void display () {
		System.out.println(employeeId+" "+name+" "+basicsalary);
	}
	
	
}

class Manager extends Employee {
	private double petrol;
	private double food;
	private double other;

	
public Manager(int employeeId, String name, double basicsalary) {
	super(employeeId,name,basicsalary);
	petrol = 0.8*super.getBasicsalary();
	food = 0.12*super.getBasicsalary();
	other = 0.04*super.getBasicsalary();

}
public void display() {
	super.display();
	System.out.println("Petrol allowance "+petrol);
	System.out.println("Food allowance "+food);
	System.out.println("Other allowance "+other);
}
public double calGrossSalary() {
	return super.getBasicsalary()+petrol+food+other;
}
public double calNetSalary() {
	return calGrossSalary()-0.125*(super.getBasicsalary());
}
}

class MarketingExecutive extends Employee{
	private int kmTravelled;
	private double tourAllowance;
	private double telephoneallowance;

	
	
	public MarketingExecutive(int employeeId, String name, double basicsalary, int kmTravelled) {
		super(employeeId,name,basicsalary);
		this.kmTravelled = kmTravelled;
		this.tourAllowance = 2000;
		this.telephoneallowance = 5*kmTravelled;
	}
	public void display() {
		super.display();
		System.out.println("Tour allowance "+tourAllowance);
		System.out.println("Telephone allowance "+telephoneallowance);
	}
	
	public double calGrossSalary() {
		return super.getBasicsalary()+tourAllowance+telephoneallowance;
	}
	public double calNetSalary() {
		return calGrossSalary()-0.125*(super.getBasicsalary());
	}

	
}

public class Tester {

	public static void printObject(Employee e) {
		e.display();
	}
		public static void main(String[]args){
			Manager m=new Manager(101,"abc",10000);
			printObject(m);
			System.out.println("Gross Salary "+m.calGrossSalary());
			System.out.println("Net Salary "+m.calNetSalary());
		}
}
			
