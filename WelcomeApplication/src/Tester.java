import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int a,b ;
		System.out.println("Enter two numbers:");
		
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int c = a+b;
		
		System.out.println("Addition is " +c);

	}

}
