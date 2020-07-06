

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Page4servlet
 */
@WebServlet("/Page4servlet")
public class Page4servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Page4servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name , password ;
		int  age;
		String getseat = null;
		
		name = request.getParameter("name").toString();
		password = request.getParameter("pass").toString();
		age = Integer.parseInt(request.getParameter("age")); 
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null)
		{
			for(Cookie cookie : cookies)
			{
				if(cookie.getName().equals("a")) getseat= cookie.getValue();
					
			}
		}
		if(getseat==null)response.sendRedirect("Page3.html");
		
		//	seat = request.getParameter("seat").toString();
		

		Db_registration db = new Db_registration();
		
		String msg = db.Storevalues(name, age, password, getseat);
		response.getWriter().append(msg);
	//	while(true)
	//	{
	//		RequestDispatcher rs = request.getRequestDispatcher("Page3.html");
	//	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
