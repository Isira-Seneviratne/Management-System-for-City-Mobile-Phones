<?php session_start(); ?>
<?php require_once('connection.php'); ?>
<?php 
//checking if user logged in
if (!isset($_SESSION['user_id'])) {
	header('Location:login.php');
}
?>

<?php 
$result ="";
$error = array();
	if (isset($_POST['submit'])) {
		if (empty($_POST['id'])) {
			$error[] = 'product id invalid';
			
		}

		if (empty($_POST['product'])) {
			$error[] = 'product name invalid';
		}
	
		if (empty($_POST['price'])) {
			$error[] = 'price id invalid';
		}

		if (empty($_POST['quantity'])) {
			$error[] = 'quantity id invalid';
		}

		if (empty($_POST['discount'])) {
			$error[] = 'discount id invalid';
		}

		if (empty($_POST['total'])) {
			$error[] = 'total id invalid';
		}

				if (!empty($error)) {
					echo 'Database errors';
				}
				else {
				
				$id = mysqli_real_escape_string($connection, $_POST['id']);
				$product = mysqli_real_escape_string($connection, $_POST['product']);
				$price = mysqli_real_escape_string($connection, $_POST['price']);
				$quantity = mysqli_real_escape_string($connection, $_POST['quantity']);
				$discount = mysqli_real_escape_string($connection, $_POST['discount']);
				$total = mysqli_real_escape_string($connection, $_POST['total']);
				$user = $_SESSION['firstName'];
		
				$query = "INSERT INTO products (productId,product,price,quantity,discount,total,user) VALUES ('{$id}','{$product}','{$price}','{$quantity}','{$discount}','{$total}','{$user}')";

				$result = mysqli_query($connection, $query);

				//if ($result) {
					//query successfull... redirect to login..
				//echo '<p class="order_confirmed"> YOUR ORDER HAS BEEN //CONFIRMED </p>';
				//}
				//else
				//	{echo 'data not enter';}



				}
				







}
 ?>
<!DOCTYPE html>
<html>
<head>
<title>Fashion Mania A Ecommerce Category Flat Bootstarp Resposive Website Template | Single :: w3layouts</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; <li></li>charset=utf-8" />
<meta name="keywords" content="Fashion Mania Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!---->

<script>
document.getElementById("tb1").style.display='none';
function net(){
	var x1 = document.getElementById('82000').value;
	var x = parseInt(x1);
	var y = document.getElementById('qty').value;
	var tot = x*y;
	var nett = tot*(90/100);
	var s = document.getElementById('txtTotal').value = nett;
}

function bill(){
	var a1 = document.getElementById("s1001").value;
	var a2 = document.getElementById("t1").value;
	var b1 = document.getElementById("s1002").value;
	var b2 = document.getElementById("t2").value;
	var c1 = document.getElementById("txtPrice").value;
	var c2 = document.getElementById("t3").value;
	var d1 = document.getElementById("qty").value;
	var d2 = document.getElementById("t4").value;
	var e1 = document.getElementById("disc").value;
	var e2 = document.getElementById("t5").value;
	var f1 = document.getElementById("txtTotal").value;
	var f2 = document.getElementById("t6").value;
	
	a2.innerHTML = a1;
	b2.innerHTML = b1;
	c2.innerHTML = c1;
	d2.innerHTML = d1;
	e2.innerHTML = e1;
	f2.innerHTML = f1;
	
	z.style.display="block";
	
}

</script>

</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">


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
<!---->
<div class="single">

<div class="container">
<div class="col-md-9">
	<div class="col-md-5 grid">		
		<div class="flexslider">
			  <ul class="slides">
			    <li data-thumb="images/si.jpg">
			        <div class="thumb-image"> <img src="images/iphone.jpg" class="img-responsive"> </div>
			    </li>
			    <li data-thumb="images/si1.jpg">
			         <div class="thumb-image"> <img src="images/3rd.jpg" class="img-responsive"> </div>
			    </li>
			    <li data-thumb="images/si2.jpg">
			       <div class="thumb-image"> <img src="images/si2.jpg" class="img-responsive"> </div>
			    </li> 
			  </ul>
		</div>
	</div>	
	
	<?php 
if (!empty($error)) {
	echo '<b>required field(s) are empty!</b><br>';

	foreach ($error as $display) {
		echo $display.'<br>';
	}
}
 ?>
	
<div class="col-md-7 single-top-in">
						<div class="single-para simpleCart_shelfItem">
						<?php
							if ($result) {
					//query successfull... redirect to login..
				echo '<p class="order_confirmed"> YOUR ORDER HAS BEEN CONFIRMED </p>';
				}
				//else
					//{echo 'data not enter';}
							
							?>
						
						
							<h1>SAMSUNG J2</h1>
							<div id="details">Samsung Galaxy J2 is a Smart Phone powered by Android 5.1 Lollipop and 5MP Auto Focus Camera.</div>
					</br>		
							<form action ="buy.php" method="post" name="input" class="buy"> 
							<table width="50%" border="1" cellspacing="0" cellpadding="0">
								  <tbody class="buy"> <tr>
								      <td width="40%">ITEM ID
							          <input type="text" name="id" readonly value="10011"></td>
								      <td width="60%">ITEM NAME
							            <input type="text" name="product" readonly id="s1001" value="Iphone 6s"></td>
							        </tr>
								    <tr>
								      <td width="40%">PRICE (LKR) :</td>
								      <td width="60%"><input type="text" name="price" readonly id="82000" value="82000"></td>
							        </tr>
								    <tr>
								      <td>QTY :</td>
								      <td>
								      	<select name="quantity" size="1" id="qty" onChange="net();">
    <option selected="selected"> </option>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
        <option value="10">10</option>
        
    </select>
								      </td>
							        </tr>
								    <tr>
								      <td>DISCOUNT </td>
								      <td><input type="text" name="discount" readonly value="10%"></td>
							        </tr>
								    <tr>
								      <td>NET TOTAL</td>
								      <td><input type="text" name="total" readonly  id="txtTotal"></td>
							        </tr>
								    <tr >
								      <td>&nbsp;</td>
								      <td><input type="submit" name="submit" value="BUY NOW" class="cart item_add"></td>
							        </tr>
							      </tbody><br>
							      
						  </table></form>
							
								<a href="#" class="cart item_add" onClick="bill();">PRINT BILL</a>
						</div>
                        
                        <br><br>
                       <!-- <div id="tb1">
                        <table>
                        	<tr>
                            	<td>Item ID :</td>
                                <td id="t1"></td>
                            </tr>
                            <tr>
                            	<td>Date :</td>
                                <td id="t2"></td>
                            </tr>
                            <tr>
                            	<td>Price :</td>
                                <td id="t3"></td>
                            </tr>
                            <tr>
                            	<td>Qty :</td>
                                <td id="t4"></td>
                            </tr>
                            <tr>
                            	<td>Discount :</td>
                                <td id="t5"></td>
                            </tr>
                            <tr>
                            	<td>Net Total :</td>
                                <td id="t6"></td>
                            </tr>
                        </table></div>-->
					</div>
 
 
 
			<div class="clearfix"> </div>
			<div class="content-top1">
			  <div class="clearfix"> </div>
			</div>		
</div>
<!----->
<div class="col-md-3 product-bottom">
			<!--categories-->
				
				<!--initiate accordion-->
						<script type="text/javascript">
							$(function() {
							    var menu_ul = $('.menu-drop > li > ul'),
							           menu_a  = $('.menu-drop > li > a');
							    menu_ul.hide();
							    menu_a.click(function(e) {
							        e.preventDefault();
							        if(!$(this).hasClass('active')) {
							            menu_a.removeClass('active');
							            menu_ul.filter(':visible').slideUp('normal');
							            $(this).addClass('active').next().stop(true,true).slideDown('normal');
							        } else {
							            $(this).removeClass('active');
							            $(this).next().stop(true,true).slideUp('normal');
							        }
							    });
							
							});
						</script>
<!--//menu-->
<!--seller--><!--//seller-->
<!--tag--></div>
		<div class="clearfix"> </div>
	</div>
	</div>
<!--footer-->
<div class="footer"></div>
<!-- slide -->
<script src="js/jquery.min.js"></script>
<script src="js/imagezoom.js"></script>
<!-- start menu -->
<link href="css/main.css" rel="stylesheet" type="text/css" />
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="js/simpleCart.min.js"> </script>
<!--initiate accordion-->
						<script type="text/javascript">
							$(function() {
							    var menu_ul = $('.menu-drop > li > ul'),
							           menu_a  = $('.menu-drop > li > a');
							    menu_ul.hide();
							    menu_a.click(function(e) {
							        e.preventDefault();
							        if(!$(this).hasClass('active')) {
							            menu_a.removeClass('active');
							            menu_ul.filter(':visible').slideUp('normal');
							            $(this).addClass('active').next().stop(true,true).slideDown('normal');
							        } else {
							            $(this).removeClass('active');
							            $(this).next().stop(true,true).slideUp('normal');
							        }
							    });
							
							});
						</script>
						<!-- FlexSlider -->
  <script defer src="js/jquery.flexslider.js"></script>
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

<script>
// Can also be used with $(document).ready()
$(window).load(function() {
  $('.flexslider').flexslider({
    animation: "slide",
    controlNav: "thumbnails"
  });
});
</script>
<!---pop-up-box---->
					<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
					<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
					<!---//pop-up-box---->
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
</body>
</html>
<?php mysqli_close($connection); ?>