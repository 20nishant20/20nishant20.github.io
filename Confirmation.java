/*
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	
	import java.util.Scanner;
*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Confirmation
 */
@WebServlet("/Confirmation")
public class Confirmation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirmation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		PrintWriter out = response.getWriter();
	/*
		String name = null;
		int age = 0;
		String seat= null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stadium","root","iamgroot!!");
			
			PreparedStatement ps = con.prepareStatement("select name ,age,seat from seatdetails where password=?")	;
			
			Scanner sc = new Scanner(System.in);
			String password = sc.next();
			
			ps.setString(1, password);
	
			ResultSet rs = ps.executeQuery();
		
			 name = rs.getString(1);
			 age = rs.getInt(2);
			 seat= rs.getString(4);
		}
		catch(Exception e)
		{
			e.toString();
		}
	
		
		
	out.println("Name :"+name);
		out.println("Age :"+age);
		out.println("Seat Number :"+seat);
	*/	
		out.println("YOUR SEATS HAVE BEEN BOOKED !!!");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
