 class Polygon{
	public double calcArea() {
		return 0;
	}
	
}
class Circle extends Polygon{
	private int radius;

public Circle() {
	radius=1;
	
}

public Circle(int r) {
	radius=r;
}

public double calArea() {
	return 2*3.142*radius*radius;
}
public double calcPeri() {
	return 2*3.142*radius;
}
}

class Rectangle extends Polygon{
	private int len, brd;
	
	public Rectangle() {
		len=brd=1;
	}
	
	public Rectangle(int l,int b) {
		len=1;
		brd=b;
	}
	public double calcArea() {
		return len*brd;
	}
	public double calcPeri() {
		return 2*(len+brd); 
	}
}

class Square extends Rectangle{
	public Square() {
		
	}
	public Square(int s) {
		super(s,s);
	}
	public double clacArea() {
		return super.calcArea();
	}
	public double calcPeri() {
		return super.calcPeri();
	}
}
public class Tester {

	public static void main(String[] args) {
		Circle c=new Circle(5);
		System.out.println(c.calcArea());
		System.out.println(c.calcPeri());
		

	}

}
