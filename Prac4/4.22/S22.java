import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletConfig;
public class S22 extends HttpServlet {
	public void init(ServletConfig c){
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
		response.setContentType("text/html");
		Connection c=null;
		PreparedStatement s=null;
		ResultSet rs=null;
		try{
			PrintWriter pw=response.getWriter();
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/s2b140053131015","postgres","6110");
			String query="select * from Employee;";
			s=c.prepareStatement(query);
			pw.println("<h1>Info Of Employee</h1>");
			pw.println("<h2>Enroll No:140053131015</h2>");
			rs=s.executeQuery();
			while(rs.next()){
				pw.println("<br/><br/><h3>id:"+rs.getString("id")+"</h3>");
				pw.println("<h3>name:"+rs.getString("name")+"</h3>");
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