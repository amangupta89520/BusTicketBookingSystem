package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class buses_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("body { \n");
      out.write("  margin: 0;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #fefefe;\n");
      out.write("  padding: 10px 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a {\n");
      out.write("  float: left;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 12px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 18px; \n");
      out.write("  line-height: 25px;\n");
      out.write("  border-radius: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a.logo {\n");
      out.write("  font-size: 25px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  position: relative;\n");
      out.write("  left: 45%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a.active {\n");
      out.write("  background-color: dodgerblue;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-right {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 500px) {\n");
      out.write("  .header a {\n");
      out.write("    float: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .header-right {\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <a href=\"#default\" class=\"logo\">Gupta Travels</a>\n");
      out.write("            <div class=\"header-right\">\n");
      out.write("              <a class=\"active\" href=\"#home\">Home</a>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("        <table class=\"table\">\n");
      out.write("<!--            <tr>\n");
      out.write("                <td colspan=\"6\"><center>DATA</center></td>\n");
      out.write("            </tr>-->\n");
      out.write("            <thead>\n");
      out.write("              <tr>\n");
      out.write("                <th scope=\"col\">Bus no</th>\n");
      out.write("                <th scope=\"col\">Travels</th>\n");
      out.write("                <th scope=\"col\">From</th>\n");
      out.write("                <th scope=\"col\">To</th>\n");
      out.write("                <th scope=\"col\">Time</th>\n");
      out.write("                <th scope=\"col\">Date</th>\n");
      out.write("                <th scope=\"col\">Book Now</th>\n");
      out.write("              </tr>\n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            ");

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
                     
      out.write("\n");
      out.write("                     <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\" id=\"index\"></th>\n");
      out.write("                           <td>");
      out.print( rs.getString(6));
      out.write("&nbsp;</td>\n");
      out.write("                           <td>");
      out.print( rs.getString(1));
      out.write("&nbsp;</td>\n");
      out.write("                           <td>");
      out.print( rs.getString(2));
      out.write("&nbsp;</td>\n");
      out.write("                           <td>");
      out.print( rs.getString(3));
      out.write("&nbsp;</td>\n");
      out.write("                           <td>");
      out.print( rs.getString(4));
      out.write("&nbsp;</td>\n");
      out.write("                           <td>");
      out.print( rs.getString(5));
      out.write("&nbsp;</td>\n");
      out.write("                           <td>\n");
      out.write("                               <form action=\"seatmap.jsp\">\n");
      out.write("                                    <input type=\"hidden\" value=");
      out.print( request.getParameter("place1") );
      out.write(" name=\"place1\">\n");
      out.write("                                    <input type=\"hidden\" value=");
      out.print( request.getParameter("place2") );
      out.write(" name=\"place2\">\n");
      out.write("                                    <input type=\"hidden\" value=");
      out.print( request.getParameter("email") );
      out.write(" name=\"email\">\n");
      out.write("                                    <input type=\"hidden\" value=");
      out.print( request.getParameter("dateandtime") );
      out.write(" name=\"dateandtime\">\n");
      out.write("                                    <input type=\"hidden\" value=");
      out.print( rs.getString(1) );
      out.write(" name=\"travelsname\">\n");
      out.write("                                    <input type=\"hidden\" value=");
      out.print( rs.getString(4) );
      out.write(" name=\"time\">\n");
      out.write("                                   <input type=\"submit\" value=\"Book\" class=\"btn btn-primary\">\n");
      out.write("                               </form>\n");
      out.write("                           </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                     </tbody>\n");
      out.write("                     ");

                         }

                        
                        //closing connection
//                        rs.close();
                        st.close();
                        con.close();
            
                        }catch(Exception e){
                            System.out.println(e);
                        } 
                     
      out.write("            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
