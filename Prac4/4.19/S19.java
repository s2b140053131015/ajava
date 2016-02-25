import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class S19 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
		try{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<h3>Enroll no:140053131015</h3>");
			Connection con=null;
			Statement stmt=null;
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/s2b140053131015","postgres","6110");
			stmt=con.createStatement();
			int i=stmt.executeUpdate("insert into Employee values(001,'Katy');");
			if(i!=0){
				pw.println("<h3>Record Inserted</h3>");
				
			}
			else{
				pw.println("<h3>Insertion Failed</h3>");
			}
			
		}
		catch(Exception e){
				System.out.println(e.getMessage());
		}
		
	}
}