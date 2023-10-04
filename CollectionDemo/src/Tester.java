import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class Tester {

	public static void main(String[] args) {
		List<Integer> List= new ArrayList<>();
		List.add(10);
		List.add(20);
		List.add(30);
		List.add(40);
		List.add(50);
		
		System.out.println(List);  //using toString
		
		for(Integer val:List)
			System.out.print(val+" ");   //using for each
		
		System.out.println();
		
		Iterator<Integer> itr=List.iterator();//using iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n"+List.get(3));
 
}
}