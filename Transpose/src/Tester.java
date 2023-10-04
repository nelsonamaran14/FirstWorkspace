import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		int [][]a = new int[3][3];
		int [][]b = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix elements:");
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++)
			{
				b[j][i]= a[i][j];
			}
		}
		for (int []temp:b)
		{
			for(int val:temp)
			{
				System.out.println(val+" ");
			}
		}
		System.out.println();

	}

}
