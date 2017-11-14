
<?php
include 'db.php';
?> 
<!DOCTYPE html>
<html>
<head>
<title>City mobile</title>
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
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
		<div class="col-sm-4 world">
					<!-- <ul >
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
					</ul> -->
				</div>
				<div class="col-sm-4 logo">
					<a href="index.html"><img src="images/logo.png" alt=""></a>	
				</div>
		
			<div class="col-sm-4 header-left">		
					<!-- <p class="log"><a href="account.html"  >Login</a> -->
						<!-- <span><a  href="account.html"  ><br>SignOut</a></p></span></br> -->
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


		<!---------------------------------------------------my code----------------------------------------------->
<!--//header-->


<style>
#datatable-responsive {
  border-collapse: collapse;
  width: 100%;
  border: 1px solid#C0C0C0;
  font-size: 16px;


}

#datatable-responsive th, #datatable-responsive td {
  text-align: left;
  padding: 3px;
}

#datatable-responsive tr {
  border-bottom: 1px solid #ddd;
}

#datatable-responsive tr.header, #datatable-responsive  tr:hover {
  background-color: #D7DBDD;
}
td{
  color:#626466  ;
    }
	th{
  color:#2E86C1  ;
    }

  tr{background-color:#D7DBDD  }
</style>
    <script>
function openWin() {
    window.open("http://localhost/web/admin/addmobile.php");
}
</script>

<section class="content" style="padding-top: 7%;padding-left: 2%">
   
<div class="col-md-3">         
          <div class="row text-center" style="padding-top: 2%">
	  <a href="addmobile.php" > Back</a>
  
 </div>
        </div> 
         
	<div class="col-md-5">
     <div class="row text-center" style="padding-top: 2%">
        <h1>Mobile Details</h1>
        </div>
        </div>
        <br>
        <br>
        <br>
        <br>

      </div>
     
  
 </div>
      <div class="col-sm-12" style="background-color:#f1f1f1;padding: 3%;padding-bottom: 3%;border-radius: 10px;">
          <div class="card-box table-responsive">
          <div class="card-box table-responsive">


      

      <table id="datatable-responsive"
                 class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0"
                 width="100%">
                 <thead>
                     <tr>
                         <th>Mobile</th>
                         <th>OS Version</th>
                         <th>Display Size</th>
                         <th>Dimension</th>
                         <th>Camera</th>
                         <th>Device Condition</th>
                         <th>Network</th>
                         <th>Sound</th>
                         <th>Warrenty</th>
                         <th>Battery</th>
                         <th>Price</th>
                         <th>Edit/Remove</th>
                         
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
                                        <td>"."<a href=edit_mobile.php?id=".$id.">"."Edit </a> / <a href=removemobile.php?id=".$id.">"."Remove</a></td>
                                            </tr>";   
                                            }
                                            ?>       
                </tbody>
            </table>

      


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