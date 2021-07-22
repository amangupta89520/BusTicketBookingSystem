<!--<!DOCTYPE html>

To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">

        
        
        
            
        

    </head>
    <body>
        <header>
            <nav class="main-nav">
                <ul>
                    <li><span>Hello!</span></li>
                    <li><a href="">About us</a></li>
                    <li><a href="">My Account</a></li>
                    <li><a href="">My Bookings</a></li>
                </ul>
            </nav>
            
        </header>
        
        <main>

            
                <img src="images/banner2.jpg" alt="bus2">
                <div class="homeWelcome">
                    <h2>Welcome to <br><span>Gupta Travels</span></h2>
                    <a href="index3.html">Book Now</a>
                </div>
             <div class="from">
                <label>From:</label>
                <select name="place1" id="place1">
                    <option value="p1">Udaipur</option>
                    <option value="p2">Ahemadabad</option>
                    <option value="p3">Rajkot</option>
                    <option value="p4">jaipur</option>
                    <option value="p5">jodhpur</option>
                    <option value="p6">Bhilwara</option>
                    <option value="p7">Ajmer</option>
                </select>
                <label>To</label>
                <select name="place2" id="place2">
                    <option value="p1">Udaipur</option>
                    <option value="p2">Ahemadabad</option>
                    <option value="p3">Rajkot</option>
                    <option value="p4">jaipur</option>
                    <option value="p5">jodhpur</option>
                    <option value="p6">Bhilwara</option>
                    <option value="p7">Ajmer</option>
                </select>                 
            </div>
        </main>
        
        <section class="contactSection">
            <h2>Contact Us!</h2>
            <form action="">
                <input type="email" placeholder="Type email & hit enter" required>
            </form>
        </section>
        
        <section class="footer">
            <nav class="footer-nav">
                <ul>
                    <li><span>Follow us on</span></li>
                    <li><a href="#" class="fa fa-facebook"></a> </li>
                    <li><a href="#" class="fa fa-twitter"></a> </li>
                    <li><a href="#" class="fa fa-instagram"></a> </li>
                </ul>
            </nav>
        </section>
        
    </body>
</html>-->




<!DOCTYPE html>
<html>
<title>Home</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", Arial, Helvetica, sans-serif}
.dropbtn {
  background-color: #eee;
  color: crimson;
  padding: 9px;
  font-size: 16px;
  border: none;
  cursor: pointer;
  position: relative;
  
}

.dropdown {
  position: absolute;
  display: inline-block;
  right: 0px;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #CCD1D1}

.dropdown:hover .dropdown-content {
  display: block;
  position: absolute;
}

.dropdown:hover .dropbtn {
  background-color: #CCD1D1;
}
</style>

<body class="w3-light-grey" onunload="javascript:history.go(1)">

<script>
    if(window.history)
    {
        window.history.forward(1);
    }

</script>

<!-- Navigation Bar -->
<div class="w3-bar w3-white w3-large">
  <a href="#" class="w3-bar-item w3-button w3-red w3-mobile"><i class="fa fa-bus w3-margin-right"></i>Gupta Travels</a>
  <a href="#about" class="w3-bar-item w3-button w3-mobile">About</a>
  <a href="#contact" class="w3-bar-item w3-button w3-mobile">Contact</a>
  <!--<a href="Loading1.jsp" class="w3-bar-item w3-button w3-right w3-light-grey w3-mobile">Logout</a>-->
  <div class="dropdown">
  <button class="dropbtn"><%= request.getParameter("email") %></button>
  <div class="dropdown-content">
      <!--<a href="mybookingsredirect.jsp" id="mybookings">My Bookings</a>-->
      <%
          String email = request.getParameter("email");
          out.print("<a href='mybookings.jsp?email="+ email  +"'>My bookings</a>");
       %>
      
  <a href="Loading1.jsp">Logout</a>
  </div>
</div>
</div>
<!-- Header -->
<header class="w3-display-container w3-content" style="max-width:2000px;">
    <img class="w3-image" src="images/banner1.jpg" alt="The Hotel" style="min-width:1000px; object-fit: fill; position: relative;" width="2000" height="800">
  <div class="w3-display-left w3-padding w3-col l6 m8">
    <div class="w3-container w3-red">
      <h2><i class="fa fa-bus w3-margin-right"></i>Book Now</h2>
    </div>
    <div class="w3-container w3-white w3-padding-16">
      <form action="buses.jsp" target="_blank">
        <div class="w3-row-padding" style="margin:0 -16px;">
          <div class="w3-half w3-margin-bottom">
            <label><i class="fa fa-calendar-o"></i> From</label>
            		<br>
                 <select name="place1" class="w3-input w3-border">
                    <option value="udaipur" name="place1">Udaipur</option>
                    <option value="ahmedabad" name="place1">Ahmedabad</option>
                    <option value="rajkot" name="place1">Rajkot</option>
                    <option value="jaipur" name="place1">jaipur</option>
                    <option value="jodhpur" name="place1">jodhpur</option>
                    <option value="bhilwara" name="place1">Bhilwara</option>
                    <option value="ajmer" name="place1">Ajmer</option>
                </select>
          </div>
          <div class="w3-half">
            <label><i class="fa fa-calendar-o"></i> To</label>
            		<br>
                 <select name="place2" class="w3-input w3-border">
                    
                    <option value="delhi" name="place2">Delhi</option>
                    <option value="mumbai" name="place2">Mumbai</option>
                    <option value="shimla" name="place2">Shimla</option>
                    <option value="kanpur" name="place2">Kanpur</option>
                    <option value="jaisalmer" name="place2">Jaisalmer</option>
                    <option value="bikaner" name="place2">Bikaner</option>
                    <option value="jamnagar" name="place2">Jamnagar</option>
                    
                </select>
          </div>
        </div>
         <label for="birthdaytime">date and time:</label>
          <input type="date" id="birthdaytime" name="dateandtime">
          <input type="hidden" value=<%= request.getParameter("email") %> name="email">
        <button class="w3-button w3-dark-grey" type="submit"><i class="fa fa-search w3-margin-right"></i>Search</button>
      </form>
    </div>
  </div>
</header>

<!-- Page content -->

  <br><br>
  <div class="w3-row-padding" id="about">
    <div class="w3-col l4 12">
      <h3>About</h3>
      <h6>Our Travels is one of a kind. It is truely amazing. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</h6>
    <p>We accept: <i class="fa fa-credit-card w3-large"></i> <i class="fa fa-cc-mastercard w3-large"></i> <i class="fa fa-cc-amex w3-large"></i> <i class="fa fa-cc-cc-visa w3-large"></i><i class="fa fa-cc-paypal w3-large"></i></p>
    </div>
    <div class="w3-col l8 12">
      <!-- Image of location/map -->
      <img src="images/map1.2.jpg" class="w3-image " style="width:100%;">
    </div>
  </div>
  
  <div class="w3-row-padding w3-large w3-center" style="margin:32px 0">
    <div class="w3-third"><i class="fa fa-map-marker w3-text-red"></i> 20, sector-14, Udaipur, Rajasthan, India</div>
    <div class="w3-third"><i class="fa fa-phone w3-text-red"></i> Phone: +91 8696634147</div>
    <div class="w3-third"><i class="fa fa-envelope w3-text-red"></i> Email: amangupta89520@gmail.com</div>
  </div>


  <div class="w3-container w3-padding-32 w3-black w3-opacity w3-card w3-hover-opacity-off" style="margin:32px 0;">
    <h2>Get the best offers first!</h2>
    <p>Join our newsletter.</p>
    <label>E-mail</label>
    <input class="w3-input w3-border" type="text" placeholder="Your Email address">
    <button type="button" class="w3-button w3-red w3-margin-top">Subscribe</button>
  </div>

  <div class="w3-container" id="contact">
    <h2>Contact</h2>
    <p>If you have any questions, do not hesitate to ask them.</p>
    <i class="fa fa-map-marker w3-text-red" style="width:30px"></i> India, IN<br>
    <i class="fa fa-phone w3-text-red" style="width:30px"></i> Phone: +91 8696634147<br>
    <i class="fa fa-envelope w3-text-red" style="width:30px"> </i> Email: amangupta89520@gmail.com<br>
    <form action="/action_page.php" target="_blank">
      <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Name" required name="Name"></p>
      <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Email" required name="Email"></p>
      <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Message" required name="Message"></p>
      <p><button class="w3-button w3-black w3-padding-large" type="submit">SEND MESSAGE</button></p>
    </form>
  </div>

<!-- End page content -->
</div>

<!-- Footer -->
<footer class="w3-padding-32 w3-black w3-center w3-margin-top">
  <h5>Find Us On</h5>
  <div class="w3-xlarge w3-padding-16">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
  </div>
  
</footer>

<!-- Add Google Maps -->
<script>
function myMap() {
  myCenter=new google.maps.LatLng(41.878114, -87.629798);
  var mapOptions= {
    center:myCenter,
    zoom:12, scrollwheel: false, draggable: false,
    mapTypeId:google.maps.MapTypeId.ROADMAP
  };
  var map=new google.maps.Map(document.getElementById("googleMap"),mapOptions);

  var marker = new google.maps.Marker({
    position: myCenter,
  });
  marker.setMap(map);
}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBu-916DdpKAjTmJNIgngS6HL_kDIKU0aU&callback=myMap"></script>
<!--
To use this code on your website, get a free API key from Google.
Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp
-->

</body>
</html>

