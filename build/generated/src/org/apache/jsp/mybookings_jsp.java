package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class mybookings_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"intro py-3 bg-white text-center\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h2 class=\"text-danger display-1 my-4\">Your Bookings</h2>\n");
      out.write("                <form>\n");
      out.write("                   <input type=\"submit\" value=\"Home\" class=\"btn btn-primary\"> \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <h2 class=\"text-danger display-1 my-4\">Your Bookings</h2>\n");
      out.write("            <input type=\"submit\" value=\"Home\" class=\"btn btn-primary\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("     ");

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
                     
      out.write("\n");
      out.write("                            \n");
      out.write("                             <div class=\"bookings py-3 mx-4\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                   <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                    <!--                <img src=\"...\" class=\"card-img-top\" alt=\"...\">-->\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                      <!--<h5 class=\"card-title\">Card title</h5>-->\n");
      out.write("                                      <p class=\"card-text\"><b>email:</b> ");
      out.print( rs.getString(1));
      out.write("</p><br>\n");
      out.write("                                      <p class=\"card-text\"><b>From:</b> ");
      out.print( rs.getString(2));
      out.write("</p><br>\n");
      out.write("                                      <p class=\"card-text\"><b>To:</b> ");
      out.print( rs.getString(3));
      out.write("</p><br>\n");
      out.write("                                      <p class=\"card-text\"><b>Date and Time:</b> ");
      out.print( rs.getString(4));
      out.write("</p><br>\n");
      out.write("                                      <p class=\"card-text\"><b>Amount:</b> ");
      out.print( rs.getString(5));
      out.write("</p><br>\n");
      out.write("                                      <p class=\"card-text\"><b>Seat no:</b> ");
      out.print( rs.getString(6));
      out.write("</p><br>\n");
      out.write("                                      <!--<a href=\"deletebooking.java\" class=\"btn btn-primary\">cancel</a>-->\n");
      out.write("                                      <form action=\"#\" method=\"POST\">\n");
      out.write("                                          \n");
      out.write("                                            <input type=\"hidden\" value=");
      out.print( request.getParameter("place1") );
      out.write(" name=\"place1\">\n");
      out.write("                                            <input type=\"hidden\" value=");
      out.print( request.getParameter("place2") );
      out.write(" name=\"place2\">\n");
      out.write("                                            <input type=\"hidden\" value=");
      out.print( request.getParameter("email") );
      out.write(" name=\"email\">\n");
      out.write("                                            <input type=\"hidden\" value=");
      out.print( request.getParameter("dateandtime") );
      out.write(" name=\"dateandtime\">\n");
      out.write("                                            <input type=\"hidden\" value=");
      out.print( request.getParameter("total1") );
      out.write(" name=\"total\">\n");
      out.write("                                            <input type=\"hidden\" value=");
      out.print( request.getParameter("seats") );
      out.write(" name=\"seats\">\n");
      out.write("                                            <input type=\"submit\" value=\"cancel\" class=\"btn btn-primary\">\n");
      out.write("                                      </form>\n");
      out.write("                                    </div>\n");
      out.write("                                  </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                     ");

                         }

                        
                        //closing connection
//                        rs.close();
                        st.close();
                        con.close();
            
                        }catch(Exception e){
                            System.out.println(e);
                        } 
                     
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
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
