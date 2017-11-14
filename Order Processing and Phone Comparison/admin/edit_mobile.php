<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
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





		<!------------------------------------------------------my code------------------------------------------------>

<?php
				function test_input($data) {
			    $data = trim($data);
			    $data = stripslashes($data);
			    $data = htmlspecialchars($data);
			    return $data;
  				}

          $id =(int)$_GET["id"];
						   

               $priceErr =  "";
						   $price = "";

               $sql3 = "SELECT * from devices where id=$id";

            $result = mysqli_query($conn, $sql3);


            $row = mysqli_fetch_array($result);
            $price = $row['price'];
           


						  	// if ($fnameErr == "" and  $lnameErr == "" and $addressErr == "" and $telnumberErr== "" and  $mobnumberErr== "" and $emailErr== "" ) {
						  if ($_SERVER["REQUEST_METHOD"] == "POST") {


	            if (empty($_POST["price"])) {
	      		$priceErr = "Price is required";
	      		} else {
	            $price = test_input($_POST["price"]);
	        	}

            $id=test_input($_POST["id"]);

	            if ( $priceErr== "") {
	           
             
              $sql = "UPDATE devices SET price ='$price' where id = '$id'";
                $result = mysqli_query($conn, $sql);
                if ($result) {
                  echo "Successfully Created";
                  header('Location:mobiledetails.php');
                } else
                echo "error" . mysqli_error($conn);

    
    
    }
      					
    }

  

		
		?>		 
		
<!--//header-->
 
<section class="content" style="padding-top: 8%;padding-left: 8%">
    <div class="row">  
    <div class="row text-center">         
    <h1>Edit Mobile</h1>
      </div>
      <br>
      <br>
      <br>
      <div class="col-sm-11" style="background-color:#D7DBDD;padding: 5%;padding-bottom: 3%;border-radius: 10px;">


       

      <form class="form-horizontal" role="form" method="POST" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" enctype="multipart/form-data">
        

        <div class="col-md-12">
          <label for="price" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Price:
          </label>
          <div class="col-md-7">
            <input type="text" name="price" class="form-control" placeholder="Enter Price" style="border-radius:7px">
             <span class="error"><?php echo $priceErr;?></span> 
          </div>
         </div>

         <input type="hidden" name="id" class="form-control" value="<?php echo htmlspecialchars($id);?>" hidden="hidden">
        <div class="row">
            <div class="col-md-2">
            </div>

          
        <div class="col-md-12">         
          <div class="row text-center" style="padding-top: 2%">
           <button type="submit" class="btn btn-primary">Edit <i class="fa fa-user-plus"></i></button>
          </div>
        </div>   

      </form>



      
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