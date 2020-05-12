package tuan1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/regisServlet")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		String email = request.getParameter("email");
		String facebook = request.getParameter("facebook");
		String shortbio = request.getParameter("shortBio");
		String html="<br>" + "<html>"
				+ "<head>" + "<title>Result Page</title>"
				+ "</head>" + "<body>"
				+ "Name: "+ fname + " " + lname +"<br>"
				+ "Userame: "+ uname +"<br>"
				+ "Passwork: "+ pass +"<br>"
				+ "Email: "+ email +"<br> Facebook URL: "+ facebook +"<br>"
				+ "Short Bio: "+ shortbio +"<br>"
				+ "</body>" + "</html>";
		out.println(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
