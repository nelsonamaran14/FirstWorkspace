/*import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(22);
		set.add(22);
		set.add(2);
		set.add(32);
		set.add(12);
	}

}
*/



//using laptop class for HashSet



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Laptop implements Comparable<Laptop>{
	private int lid;
	private String make;
	private double cost;
	
	public Laptop() {
		lid=101;
		make="apple";
		cost=75000;
	}
	
	//parameterized constructor
	public Laptop(int lid, String make, double cost) {
		this.lid = lid;
		this.make = make;
		this.cost = cost;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void show() {
		System.out.println(lid+" "+make+" "+cost);
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", make=" + make + ", cost=" + cost + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, lid, make);
	}
	
	
	//hashcode and equals
	//-----------------TYPE 1----------------
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && lid == other.lid
				&& Objects.equals(make, other.make);
	}
	
	//compareTo---COMPARABLE-----------TYPE 2--------------------
	
	public int compareTo(Laptop o) {  //o is an obj....l1.compareTol2
		if(this.cost<o.cost)
			return -1;
		else if(this.cost>o.cost)
			return 1;
		else return 0;
		
	}
	
	//get method for lid Laptop o
	public int getlid() {
		return lid;
	}


	//compare --------COMPARATOR------Type 3-----------------------------
class LaptopCompare implements Comparator<Laptop>
{
	public int compare(Laptop o1, Laptop o2) {
		if(o1.getlid()<o2.getlid())
			return -1;
		else if(o1.getlid()>o2.getlid())
			return 1;
		else return 0;
	}
}
}

//main method
public class Tester {

	public static void main(String[] args) {
		/*Set<Laptop> set = new HashSet<>();
		set.add(new Laptop(101, "HP", 50000));
		set.add(new Laptop(101, "HP", 50000));
		set.add(new Laptop(105, "Asus", 50060));
		set.add(new Laptop(103, "Dell",550000));
		System.out.println(set);*/
		
		Set<Laptop> set = new TreeSet<>();
		set.add(new Laptop(101, "HP", 50000));
		set.add(new Laptop(101, "HP", 50000));
		set.add(new Laptop(105, "Asus", 50060));
		set.add(new Laptop(103, "Dell",550000));
		System.out.println(set);
		
		System.out.println();
		
		List<Laptop> list=new ArrayList<>();
		list.add(new Laptop(101, "HP", 50000));
		list.add(new Laptop(101, "HP", 50000));
		list.add(new Laptop(105, "Asus", 50060));
		list.add(new Laptop(103, "Dell",550000));
		Collections.sort(list, new LaptopCompare());
		System.out.println(list);

	}
	
	
}

