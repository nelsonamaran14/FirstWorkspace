import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num,x,sum = 0;
		System.out.println("Enter the number:");
		num = sc.nextInt();
		int temp=num;
		while(num>0)
		{
			x=num%10;
			num=num/10;
			sum=sum+x*x*x;
		}
		if (sum==temp)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");
	}

}
