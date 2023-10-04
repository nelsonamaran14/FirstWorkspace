//import static in.mindcraft.*; //will import all classes
//import static in.mindcraft.Laptop.showCnt; // line 14 --no need for class name
//import static java.lang.System.out; // line 15 --no need for class name
import com.mindcraft.pack1.*;
import com.mindcraft.pack2.*;

public class Tester {

	public static void main(String[] args) {
		/*Laptop l1=new Laptop(111, "Asus", 55000);
		Laptop l2=new Laptop(102,"Lenovo", 45000);
		Laptop l3=new Laptop();
		l1.show();
		l2.show();
		l3.show();
		showCnt();
		out.println("static import");*/
		
		Student First=new Student();
		Student Second=new Student(232, "Christy");
		First.show();
		Second.show();
		
		Batch One=new Batch();
		Batch Two=new Batch("Python", 50);
		One.show();
		Two.show();
	}

}

