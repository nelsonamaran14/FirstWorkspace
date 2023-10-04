//concurrency - multiple things happening at the same time
 /*Two ways to implement multi threading-
 1. Extending the class thread
 2. Implementing interface Runnable
 */

/*
//1. Extending the class thread
class FirstThread extends Thread
{
	public void run() {
		for(int i=0;i<100; i++)
		{
			System.out.println("Hi..");
			try{
				Thread.sleep(30);
			}
			catch(Exception e) {
				
			}
		}
	}
}
class SecondThread extends Thread{
	public void run() {
		for(int i=0;i<100;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(30);
			}
			catch (Exception e) {
		}
	}
}

public class Tester {

	public static void main(String[] args) {
		FirstThread ft=new FirstThread();
		SecondThread st=new SecondThread();
		ft.start();
		st.start();
	}

}
}
*/

//2. Runnable

class myThreads implements Runnable
{
	private Thread t1, t2;
	{
		t1=new Thread(this,"first");
		t2=new Thread(this,"second");
		t1.start();
		t2.start();
	}
	public void run() {
	for(int i=0;i<100; i++)
	{
		if(Thread.currentThread()==t1)
			System.out.println("Hii");
		else if(Thread.currentThread()==t2)
			System.out.println("Hello");
	}
}
}
public class Tester{
	public static void main(String[]args) {
		new myThreads();
	}
}
