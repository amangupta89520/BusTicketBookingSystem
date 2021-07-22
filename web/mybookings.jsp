<%-- 
    Document   : mybookings
    Created on : 28 Sep, 2020, 9:35:34 AM
    Author     : amang
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    </head>
    <body>
    <div class="intro py-3 bg-white text-center">
        <div class="container">
            <div class="row d-flex justify-content-between align-items-center">
                <h2 class="text-danger display-1 my-4">Your Bookings</h2>
                <form action="home.jsp">
                   <input type="hidden" value=<%= request.getParameter("email") %> name="email">
                   <input type="submit" value="Home" class="btn btn-danger"> 
                </form>
                
            </div>
        </div>
    </div>
        <div class="row">
     <%
                String email = request.getParameter("email");
  
                
                try{
                    //Register the driver class
                    Class.forName("com.mysql.jdbc.Driver");
            
                    //creating connection
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/result","root","");
            
                    
                    
                    //fetching data from database
                    PreparedStatement st = (PreparedStatement) con.prepareStatement("select * from bookings.list where email = ?");
                    st.setString(1, email);
                    ResultSet rs = st.executeQuery();
                    while(rs.next()){
                     %>
                            
                             <div class="bookings py-3 mx-4">
                                <div class="container">
                                   <div class="card" style="width: 18rem;">
                    <!--                <img src="..." class="card-img-top" alt="...">-->
                                    <div class="card-body">
                                      <!--<h5 class="card-title">Card title</h5>-->
                                      <p class="card-text"><b>Travels:</b> <%= rs.getString(7)%></p><br>
                                      <p class="card-text"><b>email:</b> <%= rs.getString(1)%></p><br>
                                      <p class="card-text"><b>From:</b> <%= rs.getString(2)%></p><br>
                                      <p class="card-text"><b>To:</b> <%= rs.getString(3)%></p><br>
                                      <p class="card-text"><b>Date:</b> <%= rs.getString(4)%></p><br>
                                      <p class="card-text"><b>Time:</b> <%= rs.getString(8)%></p><br>
                                      <p class="card-text"><b>Amount:</b> <%= rs.getString(5)%></p><br>
                                      <p class="card-text"><b>Seat no:</b> <%= rs.getString(6)%></p><br>
                                      <p class="card-text"><b>Bus no:</b> <%= rs.getString(9)%></p>
                                      
                                      
                                      <!--<a href="deletebooking.java" class="btn btn-primary">cancel</a>-->
                                      <form action="#" method="POST">
                                          
                                            <input type="hidden" value=<%= request.getParameter("place1") %> name="place1">
                                            <input type="hidden" value=<%= request.getParameter("place2") %> name="place2">
                                            <input type="hidden" value=<%= request.getParameter("email") %> name="email">
                                            <input type="hidden" value=<%= request.getParameter("dateandtime") %> name="dateandtime">
                                            <input type="hidden" value=<%= request.getParameter("total1") %> name="total">
                                            <input type="hidden" value=<%= request.getParameter("seats") %> name="seats">
                                            <input type="hidden" value=<%= request.getParameter("travelsname") %> name="travelsname">
                                            <input type="hidden" value=<%= request.getParameter("time") %> name="time">
                                            <input type="hidden" value=<%= request.getParameter("busno") %> name="busno">
                                            <input type="submit" value="cancel" class="btn btn-primary">
                                      </form>
                                    </div>
                                  </div>
                                </div>
                            </div>
                     <%
                         }

                        
                        //closing connection
//                        rs.close();
                        st.close();
                        con.close();
            
                        }catch(Exception e){
                            System.out.println(e);
                        } 
                     %>

            </div>
    </body>
</html>
