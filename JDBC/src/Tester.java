import java.sql.*;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id, make and cost");
		int lid=sc.nextInt();
		String make=sc.next();
		double cost=sc.nextDouble();
	
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		//Statement stmt=conn.createStatement();
		
		/*
		ResultSet rset=stmt.executeQuery("select * from Laptop");
		while(rset.next())
		{
			System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getDouble(3));
		} */
		
		
		PreparedStatement pstmt=conn.prepareStatement("insert into Laptop values(?,?,?)");
		pstmt.setInt(1,lid);
		pstmt.setString(2, make);
		pstmt.setDouble(3, cost);
		boolean  status=pstmt.execute();
		
		
		//boolean status=stmt.execute("insert into Laptop values(112,'abc', 34000)");
		
		if(!status)
			System.out.println("Row inserted successfully");
		conn.close();
	}

}
