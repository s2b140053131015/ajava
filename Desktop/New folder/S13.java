import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S13 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
		try{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String name=request.getParameter("username");
			String pass=request.getParameter("pass");
			if(pass.equals("Admin")){
				response.sendRedirect("Welcome");
			}
			else{
				response.sendRedirect("P13.html");
				
			}
		}
		catch(IOException e){
				System.out.println(e.getMessage());
		}
		
	}
}