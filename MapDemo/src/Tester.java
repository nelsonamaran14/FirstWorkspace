import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		
		map.put(345, "Amit");
		map.put(425, "Rohan");
		map.put(567, "Nelson");
		
		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		System.out.println(keys); //prints only key values
	for(Integer key:keys)
	{
		System.out.println(map.get(key));
	}
	}
	

}
