<?php
include 'db.php';

?> 
<!DOCTYPE html>
<html>
<head>
<title>City Mobile</title>
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
					<p><?php

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

	
	
?></p>

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
		 <div class="col-sm-9 h_menu4">
				<ul class="memenu skyblue">
					  <li class=" grid"><a  href="index.php">HOME</a></li>	
				      <li><a  href="about_us.html">ABOUT US</a>
				      	
					</li>
				    <li class="grid"><a  href="shop.html">	SHOP</a>
					  
			    </li>
				<li><a  href="feedback.html">FEEDBACK</a></li>				
				<li><a class="color6" href="search.php">COMPARISONS</a></li>
				<li><a class="color6" href="advance_search.php">SEARCH</a></li>
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




<br>

<!--<nav>
<style>

nav {
    float:left;
    max-width:0px;
    margin: 0;
    padding: 7em;
}

nav ul {
    list-style-type: none;
    padding: 9px;
}
   
nav ul a {
    text-decoration: none;
}

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
    font-size: 14px;
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
    min-width: 100px;
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

<!--<div class="dropdown">
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
<br>
<br>
<br>
<br>
<br> 



<div>
<a href="advance.html">Advanced Search</a>
</div>
</nav>-->

<div class="container">

<style>
section {
    margin-left:300px;
    border-left: 0px solid gray;
    padding: 0em;
    overflow: hidden;
	text-align: left;
}
</style>

<div class="content-top">
<section>
 <div class="col-md-7">
 <h1>Comparison</h1>
      </div>

  <img class="mySlides" src="si.jpg"
  style="width:50%">
  <img class="mySlides" src="si1.jpg"
  style="width:50%">
  <img class="mySlides" src="si2.jpg"
  style="width:50%">
  <img class="mySlides" src="si.jpg"
  style="width:50%">
  <img class="mySlides" src="si1.jpg"
  style="width:50%">
  <img class="mySlides" src="si2.jpg"
  style="width:50%">
  <img class="mySlides" src="si1.jpg"
  style="width:50%">


 	

<style>
* {
  box-sizing: border-box;
}

#id1{
 
 /* background-position: 20px 50px;*/
/*  background-repeat: no-repeat;
  width: 100%;*/
  font-size: 18px;
 /* padding: 10px 8px 3px 20px;
   border: 1px solid #ddd;
  margin-bottom: 0px;*/
}

#search {
 
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

#id2{
	font-size: 18px;
}


</style>





<br>

<!--<div id="block_container" align:"left">

<div class="container" style="background-color:white;color:blacck;padding:20px" id="block1">
<h3>Compare with</h3>
<br>
<br>

<form >
<input type="text" id="myInput"  placeholder="Search devices.." title="Type in a name">
<br><br>


</form>
 
</div>
 


<!--<div class="container" style="background-color:white;color:blacck;padding:20px" id="block2">
<h3>Compare with</h3>
<br>
<br>

<form >
<input type="text" id="myInput"  placeholder="Search devices.." title="Type in a name">
<br><br>


</form>
 
</div>-->

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
        <!-------------------------------------------Table---------------------------------------------------- -->
<article>
<style>
	table {
    
    border-spacing: 2;
    width: 100%;
    border: 1px solid #ddd;
}

th, td {
    border: none;
    text-align: left;
    padding: 13px;
}
td{
	color:#626466      ;
		}
tr:nth-child(even){background-color:#D7DBDD  }



</style>


  <table>

 



   	 <tr>
      <th><h2>Specification</h2></th>
      <th><h2>Compare with</h2><br><!-- <input type="text" name ="id" id="id"  placeholder="Search devices.." title="Type in a name"></th>
     	 <?php
                $sql="SELECT * FROM devices";
                $result2=mysqli_query($conn,$sql);
                while($row=mysqli_fetch_array($result2)){
                
                   // echo $row ='mob_brand';
                   // echo $row ='mob_name';
               }
                
              ?>
              --> <select class="form-control" name="id" id="id1" onchange="changeValue();">
             	 <option value=0>Select Device</option>
              <?php
                $sql="SELECT * FROM devices";
                $result2=mysqli_query($conn,$sql);
                while($row=mysqli_fetch_array($result2)){
                ?>
                  <option value=<?php echo $row['id']?>> <?php echo $row['mob_brand']?> <?php echo $row['mob_name']?> <?php echo $row['memory']?></option>
                <?php
                }
              ?>
            </select>
      
</th>


	<th><h2>Compare with</h2><br><select class="form-control" name="id" id="id2" onchange="changeValue1();">
	 <option value=0>Select Device</option>
              <?php
                $sql="SELECT * FROM devices";
                $result2=mysqli_query($conn,$sql);
                while($row=mysqli_fetch_array($result2)){
                ?>
                  <option value=<?php echo $row['id']?>><?php echo $row['mob_brand']?> <?php echo $row['mob_name']?> <?php echo $row['memory']?></option>
                <?php
                }
              ?>
            </select>

            </th>
 </tr>
   

    <tr>
   
      <td>OS_version</td>
   
      <td><p id='os_version'</p>
      </td>
   
      <td> <p id= 'os_version1'  </p> </td>
   
    </tr>
     <tr>
    
      <td>Memory(GB)</td>
    
      <td> <p id= 'memory' </p>   </td>
    
      <td> <p id= 'memory1' </p>  </td>
    
    </tr>
     <tr>
      
      <td>Display(inches)</td>
      
      <td><p id= 'display' </p> </td>
      
      <td> <p id= 'display1' /></td>
    
     </tr>
     <tr>
     
      <td>Dimension(mm)</td>
     
      <td> <p id= 'dimension'   </p></td>
     
      <td> <p id= 'dimension1'   /> </td>
    
     </tr>
     <tr>
     
      <td>Camera(MP)</td>
     
      <td> <p id= 'camera'  </p></td>
     
      <td> <p id= 'camera1'  /></td>
    
    </tr>
    <tr>
    
      <td>Device_condition</td>
    
      <td> <p id= 'device_condition' </p></td>
    
      <td><p id= 'device_condition1' /> </td>
    
    </tr>
    <tr>
   
      <td>Network</td>
   
      <td><p id= 'network' /> </td>
   
      <td><p id= 'network1' /> </td>
   
    </tr>
    <tr>
    
      <td>Sound</td>
    
      <td> <p id= 'sound' /></td>
    
      <td><p id= 'sound1'  /> </td>
    
    </tr>
    <tr>
   
      <td>Warranty(years)</td>
   
      <td><p id= 'warrenty' /> </td>
   
      <td> <p id= 'warrenty1'  /></td>
   
    </tr>
    <tr>
  
      <td>Battery</td>
  
      <td> <p id= 'battery' /></td>
  
      <td> <p id= 'battery1'/> </td>
  
    </tr>
    <tr>
 
      <td>Price(Rs)</td>
 
      <td> <p id= 'price' /></td>
 
      <td> <p id= 'price1' /></td>
 
   </tr>

  </table>




</article>

</div>
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
				<p class="footer-class"> © 2017 City Mobile. All Rights Reserved | Design by <a href="#" target="_blank">Pesh</a> </p>
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


  <script type="text/javascript">

	function changeValue(){
    	var id=document.getElementById('id1').value;
    	console.log(id1);
    	 $.ajax({
            type: "POST",
            url: 'http://localhost/web/search1.php',
            data: {id:id},
            success: function(data)
            {   
              document.getElementById('os_version').innerHTML = JSON.parse(data).os_version;
              document.getElementById('sound').innerHTML = JSON.parse(data).sound;
              document.getElementById('camera').innerHTML = JSON.parse(data).camera;
               document.getElementById('memory').innerHTML = JSON.parse(data).memory;
              document.getElementById('warrenty').innerHTML = JSON.parse(data).warrenty;
              document.getElementById('price').innerHTML = JSON.parse(data).price;
                document.getElementById('device_condition').innerHTML = JSON.parse(data).device_condition;
               document.getElementById('dimension').innerHTML = JSON.parse(data).dimension;
              document.getElementById('display').innerHTML = JSON.parse(data).display;
              document.getElementById('network').innerHTML = JSON.parse(data).network;
              document.getElementById('battery').innerHTML = JSON.parse(data).battery;
            }
        });  

		}
	</script>


	<script type="text/javascript">

	function changeValue1(){
    	var id=document.getElementById('id2').value;
    	console.log(id2);
    	 $.ajax({
            type: "POST",
            url: 'http://localhost/web/search1.php',
            data: {id:id},
            success: function(data)
            {   
              document.getElementById('os_version1').innerHTML = JSON.parse(data).os_version;
              document.getElementById('sound1').innerHTML = JSON.parse(data).sound;
              document.getElementById('camera1').innerHTML = JSON.parse(data).camera;
               document.getElementById('memory1').innerHTML = JSON.parse(data).memory;
              document.getElementById('warrenty1').innerHTML = JSON.parse(data).warrenty;
              document.getElementById('price1').innerHTML = JSON.parse(data).price;
                document.getElementById('device_condition1').innerHTML = JSON.parse(data).device_condition;
               document.getElementById('dimension1').innerHTML = JSON.parse(data).dimension;
              document.getElementById('display1').innerHTML = JSON.parse(data).display;
              document.getElementById('network1').innerHTML = JSON.parse(data).network;
              document.getElementById('battery1').innerHTML = JSON.parse(data).battery;
            }
        });  

		}
	</script>
</body>
</html>