

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;;


public class Db_registration {
	
	
	public String Storevalues(String name,int age ,String password,String getseat)
	
	{
			String msg="";
			try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con  = 
					DriverManager.getConnection("jdbc:mysql://localhost/stadium", "root", "iamgroot!!");

			PreparedStatement ps = 
				//	con.prepareStatement("insert into seatdetails(name,age,password,seat) values(?,?,?,?)");
			con.prepareStatement("update seatdetails set name=? ,age=? ,password=? where seat=? ");
			
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, password);
			//	ps.setString(4,seat);
			ps.setString(4, getseat);	
			
			
			ps.executeUpdate();
			msg ="data is saved";
			
		}
		catch (Exception e) {
			// TODO: handle exception
			msg = e.toString();
					
		}
		
		return msg;
		
	}
	
}
