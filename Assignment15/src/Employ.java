import java.util.Scanner;

class Tester {
		private int emp_id;
		private String AccHolderName;
		private double AccBalance;
		
public Tester(int AccNum, String AccHolderName, double AccBalance) {
			this.AccNum = AccNum;
			this.AccHolderName = AccHolderName;
			this.AccBalance = AccBalance;
		}
		public int getAccNum() {
			return AccNum;
		}
		public void setAccNum(int AccNum) {
			this.AccNum = AccNum;
		}
		public String getAccHolderName() {
			return AccHolderName;
		}
		public void setAccHolderName(String AccHolderName) {
			this.AccHolderName = AccHolderName;
		}
		public double getAccBalance() {
			return AccBalance;
		}
		public void setAccBalance(double AccBalance) {
			this.AccBalance = AccBalance;
		}
		public void deposit(double amount) {
			AccBalance = AccBalance+amount;
		}
		public void withdraw(double amount) {
			AccBalance=AccBalance-amount;
		}
		public void show() {
			System.out.println(AccNum+" "+AccHolderName+" "+AccBalance);
		}
}
		
public class Employ {
	public static void main(String[] args) {
		int choice, cnt=0, AccNum;
		Employee e1 = new Employee();
		Tester[]arr=new Tester[10];
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("1.Add a record");
			System.out.println("2.Show all records");
			System.out.println("3.Deposits");
			System.out.println("4.Withdraw");
			System.out.println("5.Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter emp_id,employee_name, salary:");
				arr[cnt++]=new Tester(sc.nextInt(),sc.next(),sc.nextDouble());
				break;
			case 2:
				for (int i=0; i<cnt; i++)
					arr[i].show();
						break;
			case 3:
				System.out.println("E:");
				AccNum=sc.nextInt();
				for(int i=0; i<cnt; i++) {
					if(arr[i].getAccNum()==AccNum) {
						System.out.println("Enter amount to be deposited:");
						arr[i].deposit(sc.nextDouble());
					}
				}
				break;
			case 4:
				System.out.println("Enter account number:");
				AccNum=sc.nextInt();
				for(int i=0; i<cnt; i++) {
					if(arr[i].getAccNum()==AccNum) {
						System.out.println("Enter amount to be withdrawn:");
						arr[i].withdraw(sc.nextDouble());
					}
				}
				break;
			case 5:
				System.exit(0);
			}
		}
	}
}

		
				
			
		
	
		
	




 
public class Employ {
	public static void main(String []args) {
		Employee e1 = new Employee();
		int choice,cnt=0,acno;
		ArrayList <Employee> e1 List = new Employee <>();
		Scanner sc = new Scanner(System.in);
		
	}

}
