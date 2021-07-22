package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paymentdone_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"\">\n");
      out.write("        <script src=\"https://unpkg.com/@lottiefiles/lottie-player@latest/dist/lottie-player.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <lottie-player src=\"https://assets8.lottiefiles.com/datafiles/OivQWebdu3tdxIt/data.json\"  background=\"#f44336!important\"  speed=\"0.5\"  style=\"width: 100%; height: 100%; position: fixed; left: 0; top:0;\"  loop autoplay></lottie-player>\n");
      out.write("        <h2 style=\"text-align: center; color: white; padding: 0px; position: absolute; left: 37%; top: 10%; \">Congrats your seats have been booked.</h2>\n");
      out.write("        <form action=\"mybookings.jsp\" style=\"position: absolute; left:37%; bottom: 20%;\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            <!--<input type=\"hidden\" value=");
      out.print( request.getParameter("email") );
      out.write(" name=\"email\" >-->\n");
      out.write("        <input type=\"hidden\" value=");
      out.print( request.getParameter("place1") );
      out.write(" name=\"place1\">\n");
      out.write("        <input type=\"hidden\" value=");
      out.print( request.getParameter("place2") );
      out.write(" name=\"place2\">\n");
      out.write("        <input type=\"hidden\" value=");
      out.print( request.getParameter("email") );
      out.write(" name=\"email\">\n");
      out.write("        <input type=\"hidden\" value=");
      out.print( request.getParameter("dateandtime") );
      out.write(" name=\"dateandtime\">\n");
      out.write("        <input type=\"hidden\" value=");
      out.print( request.getParameter("total1") );
      out.write(" name=\"total\">\n");
      out.write("        <input type=\"hidden\" value=");
      out.print( request.getParameter("seats") );
      out.write(" name=\"seats\">\n");
      out.write("            <input type=\"submit\" value=\"view your bookings\" class=\"btn btn-secondary\">\n");
      out.write("        </form>\n");
      out.write("           \n");
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
