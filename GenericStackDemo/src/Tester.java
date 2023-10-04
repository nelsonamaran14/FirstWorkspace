class stack{
	private int size;
	private int top;
	private int [arr];
	
	public Stack() {
		sizes = 5;
		top==1;
		arr=new int [size];
	}
	public Stack(int s) {
		size=s;
		top==1;
		arr=new int[size];
	
	}
	public boolean isFull() {
		return top==size-1;
	
	}
	public void push(int val)throws Exception{
		if(!isFull())
			arr[++top]=val;
		
		else 
			throw new Exception ("Overflow");
	}
	public G pop()throws Exception{
		if(!isEmpty())
			return arr[top--];
		else
		
		throw mew Exception("Underflow!");
	}
	public void display() {
		for(int i=0; i<top;i++)
	}
public class Tester {

	public static void main(String[] args) {
		Stack<Integer>S

	}

}
