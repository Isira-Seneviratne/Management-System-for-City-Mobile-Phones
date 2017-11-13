<?php
	include "db.php"
?>

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
<?php
	if (!isset($_SESSION['firstName']))
	{
		echo '<a href="login.php">Login</a>'; 
		echo '<br>';
	}
	else
	{
		echo 'Welcome '.$_SESSION['firstName'];
		echo '<br>';
	}

	if (!isset($_SESSION['firstName']))
	{
		echo '<a href="registration.php">Register </a>';
	}
	else
	{
		echo '<a href="logout.php">Log out </a>';
	}
?>
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



<!---------------------------------------------------my code---------------------------------------------------->
		
<!--//header-->

<section class="content-top" style="padding-top: 7%;padding-left: 3%">

<div class="row text-center">  

       <h1>Search Mobiles</h1>
      </div>
      <br>
      <br>
<br>
      <br>

  <div class="col-md-12">         
          <div class="row text-center" style="padding-top: 2%">
       <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for mobiles.." title="Type in a name">       <button onclick="sortTable()" id="btn" class="btn btn-primary">Price:lowest first</button> <!-- <button onclick="sortTable(1)">Price:Highest first</button> -->
</div>
</div>

    <div class="row">
      <div class="col-sm-12" style="background-color: #F0F3F4;padding: 5%;padding-bottom: 3%;border-radius: 10px;">

          <div class="card-box table-responsive">
          <div class="card-box table-responsive">


       

      <br>
      <style>
* {
  box-sizing: border-box;
}

#myInput {
  /*background-image: url('/i.jpg');*/
  background-position: 10px 10px;
  background-repeat: no-repeat;
  width: 40%;
  font-size: 16px;
  padding: 6px 10px 6px 20px;
  border: 1px solid #ddd;
  margin-bottom: 12px;
}

#btn {
  /*background-image: url('/i.jpg');*/
  background-position: 10px 8px;
  background-repeat: no-repeat;
  width: 15%;
  font-size: 13px;
  padding:6px 10px 6px 20px;
  border: 1px solid #C0C0C0;
  margin-bottom:3px;
}

#datatable-responsive {
  border-collapse: collapse;
  width: 100%;
  border: 1px solid#C0C0C0;
  font-size: 17px;
}

#datatable-responsive th, #datatable-responsive td {
  text-align: left;
  padding: 3px;
}

#datatable-responsive tr {
  border-bottom: 1px solid #ddd;
}

#datatable-responsive tr.header, {
  background-color: #D7DBDD;
}
td{
  color:#626466  ;
    }

  tr{background-color:#D7DBDD  }
</style>
      <table id="datatable-responsive"
                 class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0"
                 width="100%">
                 <thead>
                     <tr>
                         <th>Mobile</th>
                         <th>OS Version</th>
                         <th>Display Size
                         (inches)</th>
                         <th>Dimension
                         (mm)</th>
                         <th>Camera
                         (MP)</th>
                         <th>Device Condition</th>
                         <th>Network</th>
                         <th>Sound</th>
                         <th>Warrenty
                         (years)</th>
                         <th>Battery</th>
                         <th>Price
                         (Rs)</th>
                     </tr>
                 </thead>
                 <tbody>
                      <?php
                           $id="";
                           $sql1 = "SELECT * FROM devices";
                           $result = mysqli_query($conn, $sql1);
                           while ($row = mysqli_fetch_array($result)) {
                                $id=$row['id'];
                                echo "<tr>
                                <td>{$row['mob_brand']} {$row['mob_name']} {$row['memory']}</td>
                                <td>{$row['os_version']}</td>
                                <td>{$row['display']}</td>
                                <td>{$row['dimension']}</td>
                                <td>{$row['camera']}</td>
                                <td>{$row['device_condition']}</td>
                                <td>{$row['network']}</td>
                                <td>{$row['sound']}</td>
                                <td>{$row['warrenty']}</td>
                                <td>{$row['battery']}</td>
                                <td>{$row['price']}</td>
                                </tr>";   
							}
						?>       
                </tbody>
            </table>
            <script>
	function myFunction() {
  var input, filter, table, tr, td, i;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("datatable-responsive");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
</script>

    <script>
function sortTable() {
  var table, rows, switching, i, x, y, shouldSwitch;
  table = document.getElementById("datatable-responsive");
  switching = true;
  /*Make a loop that will continue until
  no switching has been done:*/
  while (switching) {
    //start by saying: no switching is done:
    switching = false;
    rows = table.getElementsByTagName("TR");
    /*Loop through all table rows (except the
    first, which contains table headers):*/
    for (i = 1; i < (rows.length - 1); i++) {
      //start by saying there should be no switching:
      shouldSwitch = false;
      /*Get the two elements you want to compare,
      one from current row and one from the next:*/
      x = rows[i].getElementsByTagName("TD")[10];
      y = rows[i + 1].getElementsByTagName("TD")[10];
      //check if the two rows should switch place:
      if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
        //if so, mark as a switch and break the loop:
        shouldSwitch= true;
        break;
      }
    }
    if (shouldSwitch) {
      /*If a switch has been marked, make the switch
      and mark that a switch has been done:*/
      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
      switching = true;
    }
  }
}
</script>
       </div>
 </div>
   </div>
 </div>
</section>
			    <!-- <div class="col-md-6 login-left">
			  	 <h4>NEW CUSTOMERS</h4>
				 <p>By creating an account with our store, you will be able to move through the checkout process faster, store multiple shipping addresses, view and track your orders in your account and more.</p>
				 <a class="acount-btn" href="register.html">Create an Account</a>
			   </div>
			   <div class="clearfix"> </div>
			 </div>
	</div>
</div> -->

<!--footer-->
<div class="footer">
	<div class="container">
		<div class="footer-top">
		  <div class="clearfix"> </div>	
		</div>	
	</div>
	<div class="footer-bottom">
		<div class="container">
		  <div class="col-md-3 footer-bottom-cate">
		    <h6>Top Brands</h6>
					<ul>
						<li><a href="#">SONY</a></li>
						<li><a href="#">SAMSUNG</a></li>
						<li><a href="#">APPLE</a></li>
						<li><a href="#">HUAWEI</a></li>
						<li><a href="#">LG</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-bottom-cate cate-bottom">
					<h6>Our Address</h6>
					<ul>
					  <li>No. 3/5, Gampola, Kadugannawa.</li>
                      <li class="phone">PH : 081-58585855</li>
                      <li class="phone"></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
				<p class="footer-class">© 2017 City Mobile. All Rights Reserved | Design by <a href="#" target="_blank">Pesh</a></p>
			</div>
	</div>
</div>

<!--//footer-->
</body>
</html>
