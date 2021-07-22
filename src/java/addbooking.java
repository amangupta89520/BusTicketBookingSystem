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

public class addbooking extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           PrintWriter out = resp.getWriter();
            String total = req.getParameter("total");
//           out.println(total);
           String seats = req.getParameter("seats");
//             out.println(seats);
           String email = req.getParameter("email");
//            out.println(email);
           String place1 = req.getParameter("place1");
//            out.println(place1);
           String place2 = req.getParameter("place2");
//            out.println(place2);
           String dateandtime = req.getParameter("dateandtime");
//           out.println(dateandtime);
           String time = req.getParameter("time");
           out.println(time);
           String travelsname = req.getParameter("travelsname");
           out.println(travelsname);
           String busno = req.getParameter("busno");
           out.println(busno);

            try{
            //Register the driver class
                Class.forName("com.mysql.jdbc.Driver");

                //creating connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/jdbc1","root","");

                //creating statement
                PreparedStatement pst = (PreparedStatement) con.prepareStatement("insert into bookings.list" + " values(?,?,?,?,?,?,?,?,?)");

                //Executing queries
                pst.setString(1, email);
                pst.setString(2, place1);
                pst.setString(3, place2);
                pst.setString(4, dateandtime);
                pst.setString(5, total);
                pst.setString(6, seats);
                pst.setString(7, travelsname);
                pst.setString(8, time);
                pst.setString(9, busno);
                pst.executeUpdate();

                //closing connection
                pst.close();
                con.close();

            }catch(Exception e){
                System.out.println(e);
            }  
            RequestDispatcher rd = req.getRequestDispatcher("paymentdone.jsp");
            rd.forward(req, resp);
        }
    }
    

