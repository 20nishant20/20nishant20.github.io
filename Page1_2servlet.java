

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Page1_2servlet
 */
@WebServlet("/Page1_2servlet")
public class Page1_2servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page1_2servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
		String password,name;
		
		password = request.getParameter("pass").toString();
	//	seat = request.getParameter("seat").toString();
		name = request.getParameter("name").toString();
		
		if(Checkbooking.checkseats(password, name)) {
			
			Cookie passcookie = new Cookie("pass",password);
			passcookie.setMaxAge(30*60);
			response.addCookie(passcookie);
		
			
		//	out.println("seats booked !");
		//	out.println("seat no is "+seat);
			
			RequestDispatcher rs = request.getRequestDispatcher("Confirmation.jsp");
			
			rs.forward(request, response);
		}
		
		else
		{
			out.println("Incorrect password or seat no. ");
			 
	/*		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	*/		
	//		RequestDispatcher rs = request.getRequestDispatcher("Page1-2.html");
		
	//		rs.forward(request, response);
		}
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
