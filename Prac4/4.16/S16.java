import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class S16 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
		try{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<h2>Enroll no:140053131015</h2>");
			HttpSession s=request.getSession(true);
			if(s.isNew()){
				Date d=new Date(s.getCreationTime());
				pw.println("<h3>This is new session</h3>");
				pw.println("<h3>creation Time:"+d+"</h3>");
			}
			else{
				Date d=new Date(s.getCreationTime());
				pw.println("<h3>This is old session</h3>");
				pw.println("<h3>creation Time:"+d+"</h3>");
		
				Date d1=new Date(s.getLastAccessedTime());
				pw.println("<h3>Last Access Time:"+d1+"</h3>");
			}
		}
		catch(IOException e){
				System.out.println(e.getMessage());
		}
		
	}
}