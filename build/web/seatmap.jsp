
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Bus Ticket Reservation Widget Flat Responsive Widget Template :: w3layouts</title>
<!-- for-mobile-apps -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Bus Ticket Reservation Widget Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!-- //for-mobile-apps -->
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="css/jquery.seat-charts.css">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery-1.11.0.min.js"></script>
<script src="js/jquery.seat-charts.js"></script>
</head>
<body>
<div class="content">
	<h1>Gupta Travels</h1>
	<div class="main">
		<h2>Book Your Seat Now?</h2>
		<div class="wrapper">
			<div id="seat-map">
				<div class="front-indicator"><h3>Front</h3></div>
			</div>
			<div class="booking-details">
						<div id="legend"></div>
						<h3> Selected Seats (<span id="counter">0</span>):</h3>
						<ul id="selected-seats" class="scrollbar scrollbar1"></ul>
						
						Total: <b>Rs <span id="total">0</span></b>
                                                <form action="checkout.jsp">
                                                <input type="hidden" value=<%= request.getParameter("place1") %> name="place1">
                                                <input type="hidden" value=<%= request.getParameter("place2") %> name="place2">
                                                <input type="hidden" value=<%= request.getParameter("email") %> name="email">
                                                <input type="hidden" value=<%= request.getParameter("dateandtime") %> name="dateandtime">
                                                <input type="hidden" value=<%= request.getParameter("travelsname") %> name="travelsname">
                                                <input type="hidden" value=<%= request.getParameter("time") %> name="time">
                                                <input type="hidden" value=<%= request.getParameter("busno") %> name="busno">
                                                <input type="hidden" value="" id="hiddentotal" name="total1">
                                                <input type="hidden" value="" id="hiddenseats" name="seats">
                                                
                                                <button class="checkout-button">Pay Now</button>
                                                </form>
			</div>
			<div class="clear"></div>
		</div>
		<script>
				var firstSeatLabel = 1;
                                let total2 = 0;
                                let seats = [];
                                
			
				$(document).ready(function() {
					var $cart = $('#selected-seats'),
						$counter = $('#counter'),
						$total = $('#total'),
						sc = $('#seat-map').seatCharts({
						map: [
							'ff_ff',
							'ff_ff',
							'ee_ee',
							'ee_ee',
							'ee___',
							'ee_ee',
							'ee_ee',
							'ee_ee',
							'eeeee',
						],
						seats: {
							f: {
								price   : 500,
								classes : 'first-class', //your custom CSS class
								category: 'First Class'
							},
							e: {
								price   : 300,
								classes : 'economy-class', //your custom CSS class
								category: 'Economy Class'
							}					
						
						},
						naming : {
							top : false,
							getLabel : function (character, row, column) {
								return firstSeatLabel++;
							},
						},
						legend : {
							node : $('#legend'),
							items : [
								[ 'f', 'available',   'First Class' ],
								[ 'e', 'available',   'Economy Class'],
								[ 'f', 'unavailable', 'Already Booked']
							]					
						},
						click: function () {
							if (this.status() == 'available') {
								//let's create a new <li> which we'll add to the cart items
								$('<li>'+this.data().category+' : Seat no '+this.settings.label+': <b>Rs '+this.data().price+'</b> <a href="#" class="cancel-cart-item">[cancel]</a></li>')
									.attr('id', 'cart-item-'+this.settings.id)
									.data('seatId', this.settings.id)
									.appendTo($cart);
								
								/*
								 * Lets update the counter and total
								 *
								 * .find function will not find the current seat, because it will change its stauts only after return
								 * 'selected'. This is why we have to add 1 to the length and the current seat price to the total.
								 */
								$counter.text(sc.find('selected').length+1);
								$total.text(recalculateTotal(sc)+this.data().price);
                                                                total2 = total.textContent;
                                                                console.log(total2);
                                                                document.getElementById('hiddentotal').value = total2;
                                                                seats.push(this.settings.label);
                                                                console.log(seats);
                                                                document.getElementById('hiddenseats').value = seats;
								
								return 'selected';
							} else if (this.status() == 'selected') {
								//update the counter
								$counter.text(sc.find('selected').length-1);
								//and total
								$total.text(recalculateTotal(sc)-this.data().price);
                                                                total2 = total.textContent;
                                                                console.log(total2);
                                                                document.getElementById('hiddentotal').value = total2;
                                                                seats.pop(this.settings.lablel);
                                                                console.log(seats);
                                                                document.getElementById('hiddenseats').value = seats;
                                                                
								//remove the item from our cart
								$('#cart-item-'+this.settings.id).remove();
							
								//seat has been vacated
								return 'available';
							} else if (this.status() == 'unavailable') {
								//seat has been already booked
								return 'unavailable';
							} else {
								return this.style();
							}
						}
					});

					//this will handle "[cancel]" link clicks
					$('#selected-seats').on('click', '.cancel-cart-item', function () {
						//let's just trigger Click event on the appropriate seat, so we don't have to repeat the logic here
						sc.get($(this).parents('li:first').data('seatId')).click();
					});

					//let's pretend some seats have already been booked
					sc.get(['1_2', '4_1', '7_1', '7_2']).status('unavailable');
                                        
			});
                        
           

			function recalculateTotal(sc) {
				var total = 0;
                                
				//basically find every selected seat and sum its price
				sc.find('selected').each(function () {
					total += this.data().price;
                                        
                                        
                                 });
                                
                                return total;
                                
                                
			}
                        
                        
                        
		</script>
	</div>
	<p class="copy_rights">&copy; 2016 Bus Ticket Reservation Widget. All Rights Reserved by Gupta Travels.</p>
</div>
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
</body>
</html>
