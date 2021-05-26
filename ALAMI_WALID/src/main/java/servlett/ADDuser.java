package servlett;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entities.User;
import dao.CredentialsDAO;
/**
 * Servlet implementation class ADDuser
 */
@WebServlet("/ADDuser")
public class ADDuser extends HttpServlet {
	User u;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ADDuser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("log");
		int ide =Integer.parseInt(request.getParameter("ide"));
		String name = request.getParameter("name");
		String password1 = request.getParameter("pass1");
		String password2 = request.getParameter("pass2");
		int age =Integer.parseInt(request.getParameter("age")); 
		
		//u =null;
      	if(password1.equals(password2))
		{
			CredentialsDAO.AddEutdaint(ide,login,name, age, login, password2);

		 
			HttpSession ss = request.getSession(false);
		  
			User u = (User)ss.getAttribute("student");
			
			response.sendRedirect("login.jsp");
		    } 
		
		 else 
			{response.sendRedirect("Adduser.jsp?res=err");}


    }

}
