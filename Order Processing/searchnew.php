<?php
	$con = mysql_connect('localhost','root','');
	$db = mysql_select_db('ManagementSystem');
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Fashion Mania Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!---->



</head>
<body>
<!--header-->
<div class="header">
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
					<a href="index.html"><img src="images/logo.png" alt=""></a>	
				</div>
		
			<div class="col-sm-4 header-left">		
					<p class="log"><a href="account.html"  >Login</a>
	<span>or</span><a  href="registration.html">Signup</a></p>
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
					  <li class=" grid"><a  href="index.html">HOME</a></li>	
				      <li><a  href="about_us.html">ABOUT US</a>
				      	
					</li>
				    <li class="grid"><a  href="shop.html">	SHOP</a>
					  
			    </li>
				<li><a  href="feedback.html">FEEDBACK</a></li>				
				<li><a class="color6" href="devices.html">COMPARISONS</a></li>
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

<div class="container"><!----->
<br>
<style>

.btn{
	background-color: #C0C0C0;
	 color: white;
    padding: 11px;
    font-size: 14px;
    border: none;
    cursor: pointer;
	align:left;
}
.dropbtn {
    background-color: #C0C0C0;
    color: white;
    padding: 10px;
    font-size: 16px;
    border: none;
    cursor: pointer;
	align:left;
}

.dropdown {
    position: relative;
	
}

.dropdown-content {
    display: none;
    position: ;
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

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}

.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}
</style>
<div class="dropdown">
  <button class="dropbtn">All Brands</button>
  <div class="dropdown-content">
    <a href="#">Apple</a>
    <a href="#">Samsung</a>
    <a href="#">Sony</a>
	<a href="#">HTC</a>
	<a href="#">Nokia</a>
	<a href="#">E-tel</a>
	<a href="#">Oppo</a>
	<a href="#">LG</a>
  </div>
</div>
<br>
<br>
<br>
<br>
<br>


<div>
<button type="button" class="btn " >Advance Search</button>
</div>
</nav>


<section>
  <img class="mySlides" src="p.jpg"
  style="width:70%">
  <img class="mySlides" src="sm.jpg"
  style="width:70%">
  <img class="mySlides" src="p.jpg"
  style="width:70%">

 	

<style>
* {
  box-sizing: border-box;
}

#myInput {
 
  background-position: 20px 50px;
  background-repeat: no-repeat;
  width: 100%;
  font-size: 16px;
  padding: 8px 12px 8px 20px;
   border: 1px solid #ddd;
  margin-bottom: 0px;
}

#block_container {
  display: flex;
  justify-content: center;
}



</style>





<br>
<div id="block_container" align:"left">

<div class="container" style="background-color:white;color:blacck;padding:20px" id="block1">
  
<h3>Compare with</h3>
<form action="search.php" method="GET">

<input type="text" name="q" id="myInput"  placeholder="Search devices.." title="Type in a name">
<br><br>

  
  <button type="button" class="btn1 ">Search</button>
</form>
 <?php
 	if(!isset($q)){
 		echo '';
 	} else {
 	$query = mysql_query("SELECT * FROM Devices where name LIKE %$q%");
 	$num_rows = mysql_num_rows($query);
 	?>
 	<p><strong><?php echo $num_rows;
 	?></strong> results for '<?php echo $q; ?>'</p>
 	<?php
 	while($row = mysql_fetch_array($query)){
 		$id = $row['deviceID'];
 		$name = $row['deviceName'];

 		echo '<a href="' . $id . '.php">'.$name . '</a><br/>';

 		}
 	}
 ?>
</div>



<div class="container" style="background-color:white;color:blacck;padding:20px" id="block2">
<h3>Compare with</h3>
<form action="search.php" method="get">

<input type="text" id="myInput"  placeholder="Search devices.." title="Type in a name">
<br><br>
<button type="button" class="btn1 " >Search</button>
</form>
 <?php
 	if(!isset($q)){
 		echo '';
 	} else {
 	$query = mysql_query("SELECT * FROM Devices where name LIKE %$q%");
 	$num_rows = mysql_num_rows($query);
 	?>
 	<p><strong><?php echo $num_rows;
 	?></strong> results for '<?php echo $q; ?>'</p>
 	<?php
 	while($row = mysql_fetch_array($query)){
 		$id = $row['deviceID'];
 		$name = $row['deviceName'];

 		echo '<a href="' . $id . '.php">'.$name . '</a><br/>';

 		}
 	}
 ?>

</div>

<script>
// Automatic Slideshow - change image every 3 seconds
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}
    x[myIndex-1].style.display = "block";
    setTimeout(carousel, 3000);
}
</script>
</div>
</section>

<article>
<style>
	table {
    
    border-spacing: 0;
    width: 100%;
    border: 1px solid #ddd;
}

th, td {
    border: none;
    text-align: left;
    padding: 20px;
}

tr:nth-child(even){background-color: #C0C0C0}
</style>
  <table>
    <tr>
      <th>Specification</th>
      <th>Device1</th>
	<th>Device2</th>
     
    </tr>
    <tr>
      <td>Network</td>
      <td> </td>
      <td> </td>
    </tr>
    <tr>
      <td>Camera</td>
      <td> </td>
      <td> </td>
    </tr>
    <tr>
      <td>Display</td>
      <td> </td>
      <td> </td>
    </tr>
 <tr>
      <td>Body</td>
      <td> </td>
      <td> </td>
    </tr>
 <tr>
      <td>Launch</td>
      <td> </td>
      <td> </td>
    </tr>
 <tr>
      <td>Sound</td>
      <td> </td>
      <td> </td>
    </tr>
 <tr>
      <td>Memory</td>
      <td> </td>
      <td> </td>
    </tr>
 <tr>
      <td>Platforms</td>
      <td> </td>
      <td> </td>
    </tr>
  </table>




</article>

</div>
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







	</div>
	</div>
<!--footer-->
<div class="footer"></div>
<!-- slide -->
<script src="js/jquery.min.js"></script>
<script src="js/imagezoom.js"></script>
<!-- start menu -->
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