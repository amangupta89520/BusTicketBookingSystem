
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
    <body style="">
        <script src="https://unpkg.com/@lottiefiles/lottie-player@latest/dist/lottie-player.js"></script>


        <lottie-player src="https://assets8.lottiefiles.com/datafiles/OivQWebdu3tdxIt/data.json"  background="#f44336!important"  speed="0.5"  style="width: 100%; height: 100%; position: fixed; left: 0; top:0;"  loop autoplay></lottie-player>
        <h2 style="text-align: center; color: white; padding: 0px; position: absolute; left: 37%; top: 10%; ">Congrats your seats have been booked.</h2>
        <form action="mybookings.jsp" style="position: absolute; left:44%; bottom: 20%;" method="POST">
            
            <!--<input type="hidden" value=<%= request.getParameter("email") %> name="email" >-->
        <input type="hidden" value=<%= request.getParameter("place1") %> name="place1">
        <input type="hidden" value=<%= request.getParameter("place2") %> name="place2">
        <input type="hidden" value=<%= request.getParameter("email") %> name="email">
        <input type="hidden" value=<%= request.getParameter("dateandtime") %> name="dateandtime">
        <input type="hidden" value=<%= request.getParameter("total1") %> name="total">
        <input type="hidden" value=<%= request.getParameter("seats") %> name="seats">
        <input type="hidden" value=<%= request.getParameter("travelsname") %> name="travelsname">
        <input type="hidden" value=<%= request.getParameter("time") %> name="time">
        <input type="hidden" value=<%= request.getParameter("busno") %> name="busno">
        <input type="submit" value="view your bookings" class="btn btn-outline-dark btn-lg" style="text">
        </form>
           
    </body>
</html>
