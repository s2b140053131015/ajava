import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S8 extends HttpServlet{
		public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
			try{
				response.setContentType("text/html");
				PrintWriter pw=response.getWriter();
				Random r=new Random();
				int x=r.nextInt(6)+1;
				pw.println("<h1>Value of Dice="+x+"</h1>");
				
				}catch(IOException e){
					System.out.println(e.getMessage());
				}
			
		}
		
	
}