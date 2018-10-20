

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    //read the request parameter
	    String name=request.getParameter("name");
	    //get the writer
	    PrintWriter writer=response.getWriter();
	    
	    //set the MIME type
	    response.setContentType("text/html");
	    
	    // create a model and set it to the scope of request
	    request.setAttribute("message","Hello "+name +" From JAVA Enterprise");
	    RequestDispatcher dispatcher=request.getRequestDispatcher("jsps/hello.jsp");
	    dispatcher.forward(request, response);
	}

}
