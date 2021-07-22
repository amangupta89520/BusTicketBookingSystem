package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class seatmap_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Bus Ticket Reservation Widget Flat Responsive Widget Template :: w3layouts</title>\n");
      out.write("<!-- for-mobile-apps -->\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /> \n");
      out.write("<meta name=\"keywords\" content=\"Bus Ticket Reservation Widget Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.seat-charts.css\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.seat-charts.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"content\">\n");
      out.write("\t<h1>Gupta Travels</h1>\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<h2>Book Your Seat Now?</h2>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<div id=\"seat-map\">\n");
      out.write("\t\t\t\t<div class=\"front-indicator\"><h3>Front</h3></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"booking-details\">\n");
      out.write("\t\t\t\t\t\t<div id=\"legend\"></div>\n");
      out.write("\t\t\t\t\t\t<h3> Selected Seats (<span id=\"counter\">0</span>):</h3>\n");
      out.write("\t\t\t\t\t\t<ul id=\"selected-seats\" class=\"scrollbar scrollbar1\"></ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tTotal: <b>Rs <span id=\"total\">0</span></b>\n");
      out.write("                                                <form action=\"checkout.jsp\">\n");
      out.write("                                                <input type=\"hidden\" value=");
      out.print( request.getParameter("place1") );
      out.write(" name=\"place1\">\n");
      out.write("\n");
      out.write("                                                <input type=\"hidden\" value=\"\" id=\"hiddentotal\" name=\"total1\">\n");
      out.write("                                                <button class=\"checkout-button\">Pay Now</button>\n");
      out.write("                                                </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t\tvar firstSeatLabel = 1;\n");
      out.write("                                let total2 = 0;\n");
      out.write("                                \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\tvar $cart = $('#selected-seats'),\n");
      out.write("\t\t\t\t\t\t$counter = $('#counter'),\n");
      out.write("\t\t\t\t\t\t$total = $('#total'),\n");
      out.write("\t\t\t\t\t\tsc = $('#seat-map').seatCharts({\n");
      out.write("\t\t\t\t\t\tmap: [\n");
      out.write("\t\t\t\t\t\t\t'ff_ff',\n");
      out.write("\t\t\t\t\t\t\t'ff_ff',\n");
      out.write("\t\t\t\t\t\t\t'ee_ee',\n");
      out.write("\t\t\t\t\t\t\t'ee_ee',\n");
      out.write("\t\t\t\t\t\t\t'ee___',\n");
      out.write("\t\t\t\t\t\t\t'ee_ee',\n");
      out.write("\t\t\t\t\t\t\t'ee_ee',\n");
      out.write("\t\t\t\t\t\t\t'ee_ee',\n");
      out.write("\t\t\t\t\t\t\t'eeeee',\n");
      out.write("\t\t\t\t\t\t],\n");
      out.write("\t\t\t\t\t\tseats: {\n");
      out.write("\t\t\t\t\t\t\tf: {\n");
      out.write("\t\t\t\t\t\t\t\tprice   : 500,\n");
      out.write("\t\t\t\t\t\t\t\tclasses : 'first-class', //your custom CSS class\n");
      out.write("\t\t\t\t\t\t\t\tcategory: 'First Class'\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\te: {\n");
      out.write("\t\t\t\t\t\t\t\tprice   : 300,\n");
      out.write("\t\t\t\t\t\t\t\tclasses : 'economy-class', //your custom CSS class\n");
      out.write("\t\t\t\t\t\t\t\tcategory: 'Economy Class'\n");
      out.write("\t\t\t\t\t\t\t}\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tnaming : {\n");
      out.write("\t\t\t\t\t\t\ttop : false,\n");
      out.write("\t\t\t\t\t\t\tgetLabel : function (character, row, column) {\n");
      out.write("\t\t\t\t\t\t\t\treturn firstSeatLabel++;\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tlegend : {\n");
      out.write("\t\t\t\t\t\t\tnode : $('#legend'),\n");
      out.write("\t\t\t\t\t\t\titems : [\n");
      out.write("\t\t\t\t\t\t\t\t[ 'f', 'available',   'First Class' ],\n");
      out.write("\t\t\t\t\t\t\t\t[ 'e', 'available',   'Economy Class'],\n");
      out.write("\t\t\t\t\t\t\t\t[ 'f', 'unavailable', 'Already Booked']\n");
      out.write("\t\t\t\t\t\t\t]\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tclick: function () {\n");
      out.write("\t\t\t\t\t\t\tif (this.status() == 'available') {\n");
      out.write("\t\t\t\t\t\t\t\t//let's create a new <li> which we'll add to the cart items\n");
      out.write("\t\t\t\t\t\t\t\t$('<li>'+this.data().category+' : Seat no '+this.settings.label+': <b>Rs '+this.data().price+'</b> <a href=\"#\" class=\"cancel-cart-item\">[cancel]</a></li>')\n");
      out.write("\t\t\t\t\t\t\t\t\t.attr('id', 'cart-item-'+this.settings.id)\n");
      out.write("\t\t\t\t\t\t\t\t\t.data('seatId', this.settings.id)\n");
      out.write("\t\t\t\t\t\t\t\t\t.appendTo($cart);\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t/*\n");
      out.write("\t\t\t\t\t\t\t\t * Lets update the counter and total\n");
      out.write("\t\t\t\t\t\t\t\t *\n");
      out.write("\t\t\t\t\t\t\t\t * .find function will not find the current seat, because it will change its stauts only after return\n");
      out.write("\t\t\t\t\t\t\t\t * 'selected'. This is why we have to add 1 to the length and the current seat price to the total.\n");
      out.write("\t\t\t\t\t\t\t\t */\n");
      out.write("\t\t\t\t\t\t\t\t$counter.text(sc.find('selected').length+1);\n");
      out.write("\t\t\t\t\t\t\t\t$total.text(recalculateTotal(sc)+this.data().price);\n");
      out.write("                                                                total2 = total.textContent;\n");
      out.write("                                                                console.log(total2);\n");
      out.write("                                                                document.getElementById('hiddentotal').value = total2;\n");
      out.write("                                                                console.log(cart);\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\treturn 'selected';\n");
      out.write("\t\t\t\t\t\t\t} else if (this.status() == 'selected') {\n");
      out.write("\t\t\t\t\t\t\t\t//update the counter\n");
      out.write("\t\t\t\t\t\t\t\t$counter.text(sc.find('selected').length-1);\n");
      out.write("\t\t\t\t\t\t\t\t//and total\n");
      out.write("\t\t\t\t\t\t\t\t$total.text(recalculateTotal(sc)-this.data().price);\n");
      out.write("                                                                total2 = total.textContent;\n");
      out.write("                                                                console.log(total2);\n");
      out.write("                                                                document.getElementById('hiddentotal').value = total2;\n");
      out.write("                                                                console.log(cart);\n");
      out.write("\t\t\t\t\t\t\t\t//remove the item from our cart\n");
      out.write("\t\t\t\t\t\t\t\t$('#cart-item-'+this.settings.id).remove();\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t//seat has been vacated\n");
      out.write("\t\t\t\t\t\t\t\treturn 'available';\n");
      out.write("\t\t\t\t\t\t\t} else if (this.status() == 'unavailable') {\n");
      out.write("\t\t\t\t\t\t\t\t//seat has been already booked\n");
      out.write("\t\t\t\t\t\t\t\treturn 'unavailable';\n");
      out.write("\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\treturn this.style();\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t//this will handle \"[cancel]\" link clicks\n");
      out.write("\t\t\t\t\t$('#selected-seats').on('click', '.cancel-cart-item', function () {\n");
      out.write("\t\t\t\t\t\t//let's just trigger Click event on the appropriate seat, so we don't have to repeat the logic here\n");
      out.write("\t\t\t\t\t\tsc.get($(this).parents('li:first').data('seatId')).click();\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t//let's pretend some seats have already been booked\n");
      out.write("\t\t\t\t\tsc.get(['1_2', '4_1', '7_1', '7_2']).status('unavailable');\n");
      out.write("                                        \n");
      out.write("\t\t\t});\n");
      out.write("                        \n");
      out.write("           \n");
      out.write("\n");
      out.write("\t\t\tfunction recalculateTotal(sc) {\n");
      out.write("\t\t\t\tvar total = 0;\n");
      out.write("                                \n");
      out.write("\t\t\t\t//basically find every selected seat and sum its price\n");
      out.write("\t\t\t\tsc.find('selected').each(function () {\n");
      out.write("\t\t\t\t\ttotal += this.data().price;\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                 });\n");
      out.write("                                \n");
      out.write("                                return total;\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\t\t\t}\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("\t\t</script>\n");
      out.write("\t</div>\n");
      out.write("\t<p class=\"copy_rights\">&copy; 2016 Bus Ticket Reservation Widget. All Rights Reserved by Gupta Travels.</p>\n");
      out.write("</div>\n");
      out.write("<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("<script src=\"js/scripts.js\"></script>\n");
      out.write("</body>\n");
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
