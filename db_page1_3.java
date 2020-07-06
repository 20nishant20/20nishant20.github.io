import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class db_page1_3 {
	
	public String cancel( String password ,String name)
	{	
		String msg="";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con  = 
					DriverManager.getConnection("jdbc:mysql://localhost/stadium", "root", "iamgroot!!");

			PreparedStatement ps = 
					con.prepareStatement("delete from seatdetails where password=? and name=?");
					
			
			ps.setString(1, password);
			ps.setString(2, name);
			
			
			ps.executeUpdate();
			msg ="Booking Cancelled";
		
		}
		
		catch(Exception e )
		{
			msg=e.toString();
		
		}
		
		
		return msg ;
		
	}

}
