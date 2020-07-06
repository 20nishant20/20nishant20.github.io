import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Checkbooking {
	
	public static boolean checkseats(String password, String name)
	{	
		
			
		boolean flag = true;
		
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stadium","root","iamgroot!!");
			 PreparedStatement ps = con.prepareStatement("select * from seatdetails where password=? and name=?");
			 
			 ps.setString(1, password);
			 ps.setString(2, name);
			 
			 ResultSet rs = ps.executeQuery();
			 
			 flag=rs.next();
			 
		 	}
		 catch (Exception e)
		 {
			 
			 e.toString();
		 }
		
		return flag;
		

		

	}
}
