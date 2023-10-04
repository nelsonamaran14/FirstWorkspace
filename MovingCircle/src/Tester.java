//Assignment Q.22----circle


import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

class MovingStrings extends Frame implements Runnable
{
	private Thread t1;
	private int x1;
	public MovingStrings()
	{
		x1=100;
		t1= new Thread(this,"t1");
		t1.start();
	
	
	}
	
	public void paint (Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x1,200,100,100);
		
	}
	public void run() {
		int flag=0;
		while(true)
		{
			if(Thread.currentThread()==t1)
			{
		
				if(flag==0)
					x1++;
				else if(flag==1)
					x1--;
				if(x1==this.getWidth()-100)
					flag=1;
				if(x1==0)
					flag=0;
				try {
					Thread.sleep(10);
				}
				catch(Exception e) {
			}
			}
			repaint();
		}
	}
}
public class Tester {

	public static void main(String[] args) {
		MovingStrings ms=new MovingStrings();
		ms.setSize(500, 500);
		ms.setVisible(true);

	}

}




