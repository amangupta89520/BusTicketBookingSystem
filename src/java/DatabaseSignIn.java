import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DatabaseSignIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String verifyPass = "";
        
        PrintWriter out = resp.getWriter();
        
    try{
        //Register the driver class
            Class.forName("com.mysql.jdbc.Driver");
            
            //creating connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc1","root","");
            
            //creating statement
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("select password from passengers.list where password=?");
            
            //Executing queries
             pst.setString(1, password);
              
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                verifyPass = rs.getString("password");
            }

            //closing connection
            con.close();
            
        }catch(Exception e){
            System.out.println(e);
        }    
        
        
        if(password.equals(verifyPass)){ 
            RequestDispatcher rd = req.getRequestDispatcher("/home.jsp");
            rd.forward(req, resp);
//               HttpSession session = req.getSession();
//                session.setAttribute("email", email);
//		resp.sendRedirect("home.jsp");
            
        }else{
            out.print("<h1>Sorry!! Username or Password Error<h1>");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.include(req, resp);
        }
    }
    

}
