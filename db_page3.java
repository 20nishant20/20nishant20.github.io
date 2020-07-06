import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class db_page3 {
	
	public String checkbox(String seat)
	{	
		String msg="";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con  = 
					DriverManager.getConnection("jdbc:mysql://localhost/stadium", "root", "iamgroot!!");

			PreparedStatement ps = 
					con.prepareStatement("insert into seatdetails(seat) values (?)");
					
			
			ps.setString(1,seat);
			
			
			ps.executeUpdate();
			msg ="seat status active";
		
		}
		
		catch(Exception e )
		{
			msg=e.toString();
		
		}

		return msg;
		
	}

}
