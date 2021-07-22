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

public class deletebooking extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String place1 = req.getParameter("place1");
        String place2 = req.getParameter("place2");
        String dateandtime = req.getParameter("dateandtime");
        String total = req.getParameter("total");
        String seats = req.getParameter("seats");
        String verifyEmail = "";
        
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print(seats);
        out.print(email);
        out.print(place1);
        out.print(place2);
        out.print(dateandtime);
        out.print(total);
        
    try{
        //Register the driver class
            Class.forName("com.mysql.jdbc.Driver");
            
            //creating connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc1","root","");
            
            //creating statement
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("delete from bookings.list where email=? AND place1=? AND place2=? AND dateandtime=? AND seats=?");
            
            //Executing queries
             pst.setString(1, email);
             pst.setString(2, place1);
             pst.setString(3, place2);
             pst.setString(4, dateandtime);
             pst.setString(5, seats);
//             pst.setString(6, seats);
              
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                verifyEmail = rs.getString("email");
            }
            


            //closing connection
            con.close();
            
        }catch(Exception e){
            System.out.println(e);
        }    
        
        
        if(email.equals(verifyEmail)){ 
            RequestDispatcher rd = req.getRequestDispatcher("/home.jsp");
            rd.forward(req, resp);
//               HttpSession session = req.getSession();
//                session.setAttribute("email", email);
//		resp.sendRedirect("home.jsp");
            
        }else{
            out.print("<h1>Sorry!! some error in deleting the records<h1>");
            RequestDispatcher rd = req.getRequestDispatcher("/mybookings.jsp");
            rd.include(req, resp);
        }
            

    }
    

}
