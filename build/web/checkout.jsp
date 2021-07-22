<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial;
  font-size: 17px;
  padding: 8px;
}

* {
  box-sizing: border-box;
}

.row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0 -16px;
}

.col-25 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
}

.col-50 {
  -ms-flex: 50%; /* IE10 */
  flex: 50%;
}

.col-75 {
  -ms-flex: 75%; /* IE10 */
  flex: 75%;
}

.col-25,
.col-50,
.col-75 {
  padding: 0 16px;
}

.container {
  background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}

input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}

label {
  margin-bottom: 10px;
  display: block;
}

.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 24px;
}

.btn {
  background-color: #4CAF50;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}

.btn:hover {
  background-color: #45a049;
}

a {
  color: #2196F3;
}

hr {
  border: 1px solid lightgrey;
}

span.price {
  float: right;
  color: grey;
}

/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
@media (max-width: 800px) {
  .row {
    flex-direction: column-reverse;
  }
  .col-25 {
    margin-bottom: 20px;
  }
}
</style>
</head>
<body>
    <%
//           String total = request.getParameter("total1");
//           out.println(total);
//           String seats = request.getParameter("seats");
//             out.println(seats);
//           String email = request.getParameter("email");
//            out.println(email);
//           String place1 = request.getParameter("place1");
//            out.println(place1);
//           String place2 = request.getParameter("place2");
//            out.println(place2);
//           String dateandtime = request.getParameter("dateandtime");
//           out.println(dateandtime);
           String time = request.getParameter("time");
//           out.println(time);
           String travelsname = request.getParameter("travelsname");
//           out.println(travelsname);
           int timeout = 20;
           HttpSession sessionObj = request.getSession(true);
 
 
            /***** Setting The Updated Session Time Out *****/
            sessionObj.setMaxInactiveInterval(timeout);
 
            /***** Once The Time Out Is Reached. This Line Will Automatically Refresh The Page *****/
            response.setHeader("Refresh", timeout + "; URL=timeout.jsp");
            
//            String total = request.getParameter("total");
//            out.print(total);
    %>

<div class="row">
  <div class="col-75">
    <div class="container">
        <form action="addbooking" method="POST">
      
        <div class="row">


          <div class="col-50">
            <h3>Payment</h3>
            <label for="fname">Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
            <label for="cname">Name on Card</label>
            <input type="text" id="cname" name="cardname" placeholder="John More Doe">
            <label for="ccnum">Credit card number</label>
            <input type="text" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444">
            <label for="expmonth">Exp Month</label>
            <input type="text" id="expmonth" name="expmonth" placeholder="September">
            <div class="row">
              <div class="col-50">
                <label for="expyear">Exp Year</label>
                <input type="text" id="expyear" name="expyear" placeholder="2018">
              </div>
              <div class="col-50">
                <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" placeholder="352">
              </div>
            </div>
          </div>
          
        </div>
        <p>Total <span class="price" style="color:black"><b>Rs <%= request.getParameter("total1") %></b></span></p>
        <input type="hidden" value=<%= request.getParameter("place1") %> name="place1">
        <input type="hidden" value=<%= request.getParameter("place2") %> name="place2">
        <input type="hidden" value=<%= request.getParameter("email") %> name="email">
        <input type="hidden" value=<%= request.getParameter("dateandtime") %> name="dateandtime">
        <input type="hidden" value=<%= request.getParameter("total1") %> name="total">
        <input type="hidden" value=<%= request.getParameter("seats") %> name="seats">
        <input type="hidden" value=<%= request.getParameter("travelsname") %> name="travelsname">
        <input type="hidden" value=<%= request.getParameter("time") %> name="time">
        <input type="hidden" value=<%= request.getParameter("busno") %> name="busno">

        <input type="submit" value="Pay" class="btn">
      </form>
    </div>
  </div>

</div>

</body>
</html>
