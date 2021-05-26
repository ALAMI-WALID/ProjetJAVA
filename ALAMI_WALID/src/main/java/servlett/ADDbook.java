package servlett;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.CredentialsDAO;

/**
 * Servlet implementation class ADDbook
 */
@WebServlet("/ADDbook")
public class ADDbook extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ADDbook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String categorie = request.getParameter("category");
		String author = request.getParameter("fname");
		int id=Integer.parseInt(request.getParameter("id"));
		String date=request.getParameter("date");
        
	      
		if (!name.isEmpty() && !categorie.isEmpty() && !author.isEmpty() && !date.isEmpty()) {
			CredentialsDAO.AddBook(id,name,author,categorie,date);
			response.sendRedirect("Addbook.jsp?res=suc");
		}
		
	}

}
