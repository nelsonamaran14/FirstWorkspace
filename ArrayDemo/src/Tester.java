import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int i;
		int [] a={1,2,3};  //intialized
		float [] b=new float [3]; //uninitialized
		int [] c=new int [] {11,12,13}; //initialized
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter three int:");
		for(i=0; i<b.length; i++)
			b[i]=sc.nextFloat();
		for(i=0; i<b.length; i++)
			System.out.print(b[i]+" ");

	}

}
