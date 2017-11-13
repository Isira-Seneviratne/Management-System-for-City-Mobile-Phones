<?php session_start(); ?>
<?php require_once('connection.php'); ?>

<!DOCTYPE html>
<html>
<head>
<title>City mobiles</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Fashion Mania Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- start menu -->
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="js/responsiveslides.min.js"></script>
   <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>
</head>
<body>
<!--header-->
<header>

<?php

if (!isset($_SESSION['firstName']))
	{echo '<a href="login.php">Login</a>'; 
	echo '<br>';}
	else
	{echo 'Welcome '.$_SESSION['firstName'];
 	echo '<br>';
}

if (!isset($_SESSION['firstName']))
{echo '<a href="registration.php">Register </a>';}
	else
{echo '<a href="logout.php">Log out </a>';}

	
	
?>



</header>


<div class="header">
	<div class="header-top">
		<div class="container">
		<div class="col-sm-4 world">
					<ul >
						<li>
						<select class="in-drop">
							  <option>English </option>
							</select></li>
						<li><select class="in-drop1">
							  <option>LKR</option>
							  
							</select>
						</li>
					</ul>
				</div>
		<div class="col-sm-4 logo"> <a href="index.php"><img src="images/logo.png" alt=""></a> </div>
		<div class="col-sm-4 header-left">		
								<!--<div class="cart box_1">
						<a href="checkout.html">
						<h3> <div class="total">
							<span class="simpleCart_total"></span></div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>-->
					<div class="clearfix"> </div>
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="col-sm-2 number">
					<span><i class="glyphicon glyphicon-phone"></i>+94 770135662</span>
				</div>
		 <div class="col-sm-8 h_menu4">
				<ul class="memenu skyblue">
					  <li class=" grid"><a  href="index.php">HOME</a></li>	
				      <li><a  href="about_us.html">ABOUT US</a>
				      	
					</li>
				    <li class="grid"><a  href="shop.php">	SHOP</a>
					  
			    </li>
				<li><a  href="feedback.html">FEEDBACK</a></li>				
				<li><a class="color6" href="search.php">COMPARISONS</a></li>
				
			  </ul> 
			</div>
				
		<div class="clearfix"> </div>
			<!---pop-up-box---->
					  <script type="text/javascript" src="js/modernizr.custom.min.js"></script>    
					<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
					<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
					<!---//pop-up-box---->
				<div id="small-dialog" class="mfp-hide">
				<div class="search-top">
						<div class="login">
							<input type="submit" value="">
							<input type="text" value="Type something..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">		
						</div>
						<p>	Shopping</p>
					</div>				
				</div>
				 <script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
				</script>			
	<!---->		
		</div>
	</div>
</div>
<!--banner-->
<div class="banner">
	<div class="col-sm-3 banner-mat">
		<img class="img-responsive"	src="images/ba1.jpg" alt="">
	</div>
	<div class="col-sm-6 matter-banner">
	 	<div class="slider">
	    	<div class="callbacks_container">
	      		<ul class="rslides" id="slider">
	        		<li>
	          			<img src="images/1.jpg" alt="">
	       			 </li>
			 		 <li>
	          			<img src="images/2.jpg" alt="">   
	       			 </li>
					 <li>
	          			<img src="images/1.jpg" alt="">
	        		</li>	
	      		</ul>
	 	 	</div>
		</div>
	</div>
	<div class="col-sm-3 banner-mat">
		<img class="img-responsive" src="images/ba.jpg" alt="">
	</div>
	<div class="clearfix"> </div>
</div>
<!--//banner-->
<!--content-->
<div class="content">
	<div class="container">
		<div class="content-top">
			<h1>Upcoming mobiles</h1>
			<div class="content-top1">
			  <div class="col-md-3 col-md2">
				  <div class="col-md1 simpleCart_shelfItem">
						<a href="buy1.php">
							<img class="img-responsive" src="images/pi22.jpg" alt="" />
						</a>
						<h3>iPhone 6s </h3>
						
						<div class="price">
						  <h5 class="item_price">LKR 90,000</h5>
								<a href="buy1.php
								" class="item_add">Add To Cart</a>
								<div class="clearfix"> </div>
					  </div>
						
			  </div>
			  </div>
                <div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
					  <a href="buy9.php">
							<img class="img-responsive" src="images/lg-v20.jpg" alt="" />
					  </a>
						<h3>LG-v20</h3>
						<div class="price">
						  <h5 class="item_price">LKR 79,900</h5>
					 	  <a href="buy9.php
								" class="item_add">Add To Cart</a>
						  <div class="clearfix"> </div>
						</div>
						
					</div>
				</div>
                <div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
					  <a href="buy8.php">
							<img class="img-responsive" src="images/oppo_f3.jpg" alt="" />
					  </a>
						<h3>Oppo f3 </h3>
						<div class="price">
						  <h5 class="item_price">LKR 35,900</h5>
					 	  <a href="buy8.php
								" class="item_add">Add To Cart</a>
						  <div class="clearfix"> </div>
						</div>
						
					</div>
				</div>
                <div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="buy.php">
							<img class="img-responsive" src="images/pi4.png" alt="" />
						</a>
						<h3>Samsung Galaxy J2</h3>
						<div class="price">
						  <h5 class="item_price">LKR 20,000</h5>
						 	<a href="buy.php
								" class="item_add">Add To Cart</a>
						  <div class="clearfix"> </div>
						</div>
						
					</div>
				</div>
              <div class="clearfix"> </div>
			</div>	
			<div class="content-top1">
			  <div class="clearfix"> </div>
			</div>	
		</div>
	</div>
</div>
<!--//content-->
<!--footer-->
<div class="footer">
<!--
	<div class="container">
		<div class="footer-top">
			<div class="col-md-8 top-footer">
				<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d83998.91163207516!2d2.3470599!3d48.85885894999999!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47e66e1f06e2b70f%3A0x40b82c3688c9460!2sParis%2C+France!5e0!3m2!1sen!2sin!4v1436340519910" allowfullscreen=""></iframe>
			</div>
			<div class="col-md-4 top-footer1">
				<h2>Newsletter</h2>
					<form>
						<input type="text" value="" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='';}">
						<input type="submit" value="SUBSCRIBE">
					</form>
			</div>
			<div class="clearfix"> </div>	
		</div>	
	</div>-->
	<div class="footer-bottom">
		<div class="container">
				<div class="col-sm-3 footer-bottom-cate">
					<h6>TOP BRANDS</h6>
					<ul>
						<li><a href="#">SONY</a></li>
						<li><a href="#">SAMSUNG</a></li>
						<li><a href="#">APPLE</a></li>
						<li><a href="#">HUAWEI</a></li>
						<li><a href="#">LG</a></li>
						
					</ul>
				</div>
				<div class="col-sm-3 footer-bottom-cate cate-bottom">
				  <h6>ADDRESS</h6>
					<ul>
						<li>No. 3/5, Gampola, Kadugannawa.</li>
						<li class="phone">PH : 081-58585855</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
				<p class="footer-class"> © 2017 City Mobile. All Rights Reserved | Design by <a href="#" target="_blank">Sanka</a> </p>
			</div>
	</div>
</div>

<!--//footer-->
</body>
</html>
