import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletConfig;
public class S21 extends HttpServlet {
	public void init(ServletConfig c){
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
		response.setContentType("text/html");
		Connection c=null;
		Statement s=null;
		try{
			PrintWriter pw=response.getWriter();
			String name=request.getParameter("name");
			int id=Integer.parseInt(request.getParameter("id"));
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/s2b140053131015","postgres","6110");
			s=c.createStatement();
			pw.println("<h2>Enroll No:140053131015</h1>");
			String query="insert into Employee values("+id+",'"+name+"');";
			int i=s.executeUpdate(query);
			if(i!=0){
				pw.println("<h2>record has been inserted</h2>");
			}
			else{
				pw.println("<h2>sorry! Failure</h2>");
			}
		}
		catch(IOException i){
			System.out.println("IOException");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	public void destroy(){
	}
}