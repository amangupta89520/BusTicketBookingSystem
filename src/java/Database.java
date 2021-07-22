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

public class Database extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String age = req.getParameter("age");
        String phone = req.getParameter("phone");
        String name = req.getParameter("name");
        PrintWriter out = resp.getWriter();
        String verifyEmail = "";
        resp.setContentType("text/html");
        try{
        //Register the driver class
            Class.forName("com.mysql.jdbc.Driver");
            
            //creating connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc1","root","");
            
            //creating statement
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("select email from passengers.list where email=?");
            
            //Executing queries
            pst.setString(1, email);
              
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                verifyEmail = rs.getString("email");
            }

            //closing connection
            pst.close();
            rs.close();
            con.close();
            
        }catch(Exception e){
            System.out.println(e);
        }    
        
        
        if(email.equals(verifyEmail)){ 
            out.print("<h1>Sorry!! Email already exists<h1>");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.include(req, resp);
            
        }else{
            try{
            //Register the driver class
                Class.forName("com.mysql.jdbc.Driver");

                //creating connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc1","root","");

                //creating statement
                PreparedStatement pst = (PreparedStatement) con.prepareStatement("insert into passengers.list" + " values(?,?,?,?,?)");

                //Executing queries
                pst.setString(1, name);
                pst.setString(2, email);
                pst.setString(3, password);
                pst.setInt(4, Integer.parseInt(age));
                pst.setString(5, phone);
                pst.executeUpdate();

                //closing connection
                pst.close();
                con.close();

            }catch(Exception e){
                System.out.println(e);
            }  
            RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
            rd.forward(req, resp);
        }
    }
    
}
