package userData;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class Login extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("username");  
    String p=request.getParameter("userpass");  
    ReadXMLFile login = new ReadXMLFile();
    boolean success = login.ValidateLogin(n, p);
        
    if(login.ValidateLogin(n, p) == true){  
        RequestDispatcher rd=request.getRequestDispatcher("CookApp");
        rd.forward(request,response);
    }  
    else{  
        out.print("Sorry username or password error");
        RequestDispatcher rd=request.getRequestDispatcher("redirect.jsp");
        rd.include(request,response);
    }
    
    out.close();  
    }  
}