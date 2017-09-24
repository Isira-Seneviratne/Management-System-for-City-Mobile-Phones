<?php session_start(); ?>
<?php require_once('connection.php'); ?>

<!DOCTYPE html>
<html>
<head>
<title>Fashion Mania A Ecommerce Category Flat Bootstarp Resposive Website Template | Products :: w3layouts</title>
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

	<div class="header-top">
		<div class="container">
		<div class="col-sm-4 world">
					<ul >
						<li>
						<select class="in-drop">
							  <option>English</option>
							  <option>Japanese</option>
							  <option>French</option>
							</select></li>
						<li><select class="in-drop1">
							  <option>LKR</option>
							  
							</select>
						</li>
					</ul>
				</div>
				<div class="col-sm-4 logo">
					<a href="index.php"><img src="images/logo.png" alt=""></a>	
				</div>
		
			<div class="col-sm-4 header-left">		
					<p class="log">&nbsp;</p>
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
<!--content-->
<div class="products">
	<div class="container">
		<h1>Products</h1>
        <div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="buy.php">
							<img class="img-responsive" src="images/pi4.png" alt="" />
						</a>
						<h3>samsung galxy J2</h3>
						<div class="price">
						  <h5 class="item_price">LKR  20000</h5>
						 	<a href="buy.php
								" class="item_add">Add To Cart</a>
						  <div class="clearfix"> </div>
						</div>
						
					</div>
				</div>
                	<div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="buy1.php">
							<img class="img-responsive" src="images/pi2.jpg" alt="" />
						</a>
						<h3>Iphone 6s </h3>
						
						<div class="price">
						  <h5 class="item_price">LKR 82000</h5>
								<a href="buy1.php
								" class="item_add">Add To Cart</a>
								<div class="clearfix"> </div>
					  </div>
						
			  </div>
				</div>
                <div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="buy2.php">
						<img class="img-responsive" src="images/si1.jpg" alt="" /></a>
						<h3>Samsung galaxy s8</h3>
						<div class="price">
						  <h3 class="item_price">LKR 146 900</h3><a href="buy2.php" class="item_add">Add To Cart</a>								
								<div class="clearfix"> </div>
						</div>
						
					</div>
				</div>
               <div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
					  <a href="buy3.php">
							<img class="img-responsive" src="images/huawei.jpg" alt="" />
						</a>
						<h3>huawei honor p10</h3>
						<div class="price">
						  <h5 class="item_price">LKR 59 999</h5> 
					 	  <a href="buy3.php
								" class="item_add">Add To Cart</a>
						  <div class="clearfix"> </div>
						</div>
						
					</div>
				</div>
                 <div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
					  <a href="buy4.php">
							<img class="img-responsive" src="images/nokia.jpg" alt="" />
						</a>
						<h3>Nokia 8</h3>
						<div class="price">
						  <h5 class="item_price">LKR  24 900</h5>
					 	  <a href="buy4.php
								" class="item_add">Add To Cart</a>
						  <div class="clearfix"> </div>
						</div>
						
					</div>
				</div>
                <div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
					  <a href="buy5.php">
							<img class="img-responsive" src="images/Sony_Xperia.jpg" alt="" />
						</a>
						<h3>Sony xperia xa1</h3>
						<div class="price">
						  <h5 class="item_price">LKR  27 489</h5>
					 	  <a href="buy5.php
								" class="item_add">Add To Cart</a>
						  <div class="clearfix"> </div>
						</div>
						
					</div>
				</div>
                <div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
					  <a href="buy6.php">
							<img class="img-responsive" src="images/htc_d.jpg" alt="" />
						</a>
						<h3>HTC desire 825</h3>
						<div class="price">
						  <h5 class="item_price">LKR  52 900</h5>
					 	  <a href="buy6.php
								" class="item_add">Add To Cart</a>
						  <div class="clearfix"> </div>
						</div>
						
					</div>
				</div>
                <div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
					  <a href="buy7.php">
							<img class="img-responsive" src="images/micro_l.jpg" alt="" />
						</a>
						<h3>Microsoft lumia</h3>
						<div class="price">
						  <h5 class="item_price">LKR  45 900</h5>
					 	  <a href="buy7.php
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
						<h3>oppo f3 </h3>
						<div class="price">
						  <h5 class="item_price">LKR  36 000</h5>
					 	  <a href="buy8.php
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
						  <h5 class="item_price">LKR  79 900</h5>
					 	  <a href="buy9.php
								" class="item_add">Add To Cart</a>
						  <div class="clearfix"> </div>
						</div>
						
					</div>
				</div>
                <p><br>
                </p>
      <div class="col-md-9">
			<div class="content-top1">
			  <div class="clearfix"> </div>
			</div>	
			<div class="content-top1">
			  <div class="clearfix"> </div>
			</div>	
			<div class="content-top1">
			  <div class="clearfix"> </div>
			</div>	
		</div>
		<div class="clearfix"> </div>
	</div>
</div>
<!--//content-->
<!--footer-->
<div class="footer">
	<div class="container">
		<div class="footer-top">
			<div class="col-md-8 top-footer"></div>
			<div class="clearfix"> </div>	
		</div>	
	</div>
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
	<div class="footer-bottom">
		<div class="container">
		  <div class="col-md-3 footer-bottom-cate cate-bottom">
		    <h6>ADDRESS</h6>
					<ul>
						<li>No. 3/5, Gampola, Kadugannawa.</li>
						<li class="phone">PH : 081-58585855</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
				<p class="footer-class"> © 2015 Fashion Mania. All Rights Reserved | Design by <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
			</div>
	</div>
</div>

<!--//footer-->
</body>
</html>