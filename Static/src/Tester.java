class Laptop{
	private int lid;
	private String make;
	private double cost;
	private static int cnt;
	
	public Laptop() {
		lid=101;
		make="apple";
		cost=75000;
		cnt++;
	}
	public Laptop(int lid, String make, double cost) {
		this.lid = lid;
		this.make = make;
		this.cost = cost;
		cnt++;
	}
	public void show() {
		System.out.println(lid+" "+make+" "+cost);
	}
	public static void showCnt() {
		System.out.println("Number of objects- "+cnt);
	}
}
public class Tester {

	public static void main(String[] args) {
		Laptop l1=new Laptop(111, "Asus", 55000);
		Laptop l2=new Laptop(102,"Lenovo", 45000);
		Laptop l3=new Laptop();
		l1.show();
		l2.show();
		l3.show();
		Laptop.showCnt();
	}

}

