

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
 * Servlet implementation class Page3servlet
 */
@WebServlet("/Page3servlet")
public class Page3servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page3servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		String seat ;
		seat = request.getParameter("a").toString();
		
		
		if(seat !=null)
		{
		Cookie seatcookie = new Cookie("a",seat);
		seatcookie.setMaxAge(30*60);
		response.addCookie(seatcookie);
	
		db_page3 db = new db_page3();
		
		String msg =db.checkbox(seat);
		response.getWriter().append(msg);
		
		
		response.sendRedirect("Page4.html");
		
		
		}
		
		else 
		{
			RequestDispatcher rs = request.getRequestDispatcher("Page3.html");
			
			PrintWriter out = response.getWriter();
			
			out.println("please select a seat");
			
			rs.include(request, response);
			
		}
		
	//	db_page3 db = new db_page3();
		
	/*	while(true)
		{
			RequestDispatcher rs = request.getRequestDispatcher("Page4.html");
			
			rs.forward(request, response);
			
			String msg =db.checkbox(seat);
			
			response.getWriter().append(msg);
			
	
			
		}
	*/
	//	String msg =db.checkbox(seat);
		
	//	response.getWriter().append(msg);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
