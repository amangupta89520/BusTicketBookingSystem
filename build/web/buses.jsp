<%-- 
    Document   : retrieve
    Created on : 27 Sep, 2020, 12:27:14 PM
    Author     : amang
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #fefefe;
  padding: 10px 5px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
  position: relative;
  left: 45%;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>
    </head>
    <body>
        <div class="header">
            <a href="#default" class="logo">Gupta Travels</a>
            <div class="header-right">
              <!--<a class="active" href="#home">Home</a>-->
                <form action="home.jsp">
                   <input type="hidden" value=<%= request.getParameter("email") %> name="email">
                   <input type="submit" value="Home" class="btn btn-danger"> 
                </form>
            </div>
         </div>
        <table class="table">
<!--            <tr>
                <td colspan="6"><center>DATA</center></td>
            </tr>-->
            <thead>
              <tr>
                <th scope="col">Bus no</th>
                <th scope="col">Travels</th>
                <th scope="col">From</th>
                <th scope="col">To</th>
                <th scope="col">Time</th>
                <th scope="col">Date</th>
                <th scope="col">Book Now</th>
              </tr>
            </thead>
            
            <%
                 String place1 = request.getParameter("place1");
//                  out.println(place1);
                 String place2 = request.getParameter("place2");
//                 out.println(place2);
                 String dateandtime = request.getParameter("dateandtime");
//                 out.println(dateandtime);
//                out.println(dateandtime.compareTo("2020-10-2"));
                  String email = request.getParameter("email");
                
                try{
                    //Register the driver class
                    Class.forName("com.mysql.jdbc.Driver");
            
                    //creating connection
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/result","root","");
            
                    
                    
                    //fetching data from database
                    PreparedStatement st = (PreparedStatement) con.prepareStatement("select * from buses.list WHERE place1=? AND place2=? AND date=?");
                    st.setString(1, place1);
                    st.setString(2, place2);
                    st.setString(3, dateandtime);
                    ResultSet rs = st.executeQuery();
                    while(rs.next()){
//                        int i = 0;
                     %>
                     <tbody>
                        <tr>
                            <!--<th scope="row" id="index"></th>-->
                           <td><%= rs.getString(6)%>&nbsp;</td>
                           <td><%= rs.getString(1)%>&nbsp;</td>
                           <td><%= rs.getString(2)%>&nbsp;</td>
                           <td><%= rs.getString(3)%>&nbsp;</td>
                           <td><%= rs.getString(4)%>&nbsp;</td>
                           <td><%= rs.getString(5)%>&nbsp;</td>
                           <td>
                               <form action="seatmap.jsp">
                                    <input type="hidden" value=<%= request.getParameter("place1") %> name="place1">
                                    <input type="hidden" value=<%= request.getParameter("place2") %> name="place2">
                                    <input type="hidden" value=<%= request.getParameter("email") %> name="email">
                                    <input type="hidden" value=<%= request.getParameter("dateandtime") %> name="dateandtime">
                                    <input type="hidden" value=<%= rs.getString(1) %> name="travelsname">
                                    <input type="hidden" value=<%= rs.getString(4) %> name="time">
                                    <input type="hidden" value=<%= rs.getString(6) %> name="busno">
                                   <input type="submit" value="Book" class="btn btn-primary">
                               </form>
                           </td>

                        </tr>
                     </tbody>
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
            
        </table>

    </body>
</html>
