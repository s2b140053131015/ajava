import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S2 extends HttpServlet{
		public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
			try{
				Date d=new Date();
				response.setContentType("text/html");
				PrintWriter pw=response.getWriter();
				pw.println("<h3>"+d+"</h3>");
				
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
			
		}
}