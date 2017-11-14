
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
						<span><a  href="account.html"  ><br>SignOut</a></p></span></br>
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

<?php
				function test_input($data) {
			    $data = trim($data);
			    $data = stripslashes($data);
			    $data = htmlspecialchars($data);
			    return $data;
  				}
						   $mob_brandErr = $mob_nameErr = $memoryErr = $os_versionErr = $displayErr = $dimensionErr = $cameraErr = $device_conditionErr = $networkErr = $soundErr =
						   $warrentyErr = $batteryErr = $priceErr =  "";
						   $mob_brand = $mob_name = $memory = $os_version = $display = $dimension = $camera = $device_condition = $network = $sound = $warrenty = $battery = $price = "";


						  	// if ($fnameErr == "" and  $lnameErr == "" and $addressErr == "" and $telnumberErr== "" and  $mobnumberErr== "" and $emailErr== "" ) {
						  if ($_SERVER["REQUEST_METHOD"] == "POST") {


           		if (empty($_POST["mob_brand"])) {
      			$mob_brandErr = "Mobile Brand is required";
      			} else {
              	$mob_brand = test_input($_POST["mob_brand"]);
              	}
              	if (empty($_POST["mob_name"])) {
      			$mob_nameErr = "Mobile Name is required";
      			} else {
              	$mob_name = test_input($_POST["mob_name"]);
              	}
              	if (empty($_POST["memory"])) {
      			$memoryErr = "Memory Size is required";
      			} else {
              	$memory = test_input($_POST["memory"]);
              	}
              	if (empty($_POST["os_version"])) {
     			$os_versionErr = "OS Version is required";
     			} else {
             	$os_version = test_input($_POST["os_version"]);
             	}
      	        if (empty($_POST["display"])) {
     			$displayErr = "Display Size is required";
     			} else {
	            $display = test_input($_POST["display"]);
	       		}
	            if (empty($_POST["dimension"])) {
	      		$dimensionErr = "Dimension is required";
	      		} else {
	            $dimension = test_input($_POST["dimension"]);
	        	}
	            if (empty($_POST["camera"])) {
	      		$cameraErr = "Camera Size is required";
	      		} else {
	            $camera = test_input($_POST["camera"]);
	        	}
	            if (empty($_POST["device_condition"])) {
	      		$device_conditionErr = "Device Condition is required";
	      		} else {
	            $device_condition = test_input($_POST["device_condition"]);
	        	}
	            if (empty($_POST["network"])) {
	      		$networkErr = "Network Type is required";
	      		} else {
	            $network = test_input($_POST["network"]);
	        	}
	            if (empty($_POST["sound"])) {
	      		$soundErr = "Sound Detail is required";
	      		} else {
	            $sound = test_input($_POST["sound"]);
	        	}
	            if (empty($_POST["warrenty"])) {
	      		$warrentyErr = "Warrenty type is required";
	      		} else {
	            $warrenty = test_input($_POST["warrenty"]);
	        	}
	            if (empty($_POST["battery"])) {
	      		$batteryErr = "Battery Duration is required";
	      		} else {
	            $battery = test_input($_POST["battery"]);
	        	}
	            if (empty($_POST["price"])) {
	      		$priceErr = "Price is required";
	      		} else {
	            $price = test_input($_POST["price"]);
	        	}

	            if ($mob_brandErr == "" and  $mob_nameErr == "" and $memoryErr == "" and $os_versionErr== "" and  $displayErr== "" and $dimensionErr== "" and $cameraErr == "" and  $device_conditionErr == "" and $networkErr == "" and $soundErr== "" and  $warrentyErr== "" and $batteryErr== "" and $priceErr== "") {
	            
             
             $sql = "Insert INTO devices(mob_brand,mob_name,memory,os_version,display,dimension,camera,device_condition,network,sound,warrenty,battery,price) VALUES('$mob_brand','$mob_name','$memory','$os_version','$display','$dimension','$camera','$device_condition','$network','$sound','$warrenty','$battery','$price')";
                        $result = mysqli_query($conn, $sql);
                        if ($result) {
                            echo "Successfully Created";
                            header("Location:./addmobile.php");
                       } else
                            echo "error" . mysqli_error($conn);
                        }
      
      					
    }

  

		
		?>		 
		
<!--//header-->
<section class="content" style="padding-top: 8%;padding-left: 8%">
    <div class="row">
      <div class="col-sm-11" style="background-color: #F0F3F4;padding: 5%;padding-bottom: 3%;border-radius: 10px;">


       

       <div class="row text-center">         
        <h1>Add Moblie</h1>
      </div>
      <br>
      <form class="form-horizontal" role="form" method="POST" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" enctype="multipart/form-data">
        <div class="col-md-12">
          <label for="brand" class="col-md-3" style="padding-left:12%;padding-top:15px;">
            Mobile Brand:
          </label>
          <div class="col-md-7">
            <input type="text" name="mob_brand" class="form-control"  placeholder="Enter Mobile Brand Name" style="border-radius:7px" > 
             <span class="error"><?php echo $mob_brandErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-user fa-2x"></i>
          </div>
        </div>        
        <div class="col-md-12">
          <label for="mobname" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Mobile Name:
          </label>
          <div class="col-md-7">
            <input type="text" name="mob_name" class="form-control"  placeholder="Enter Mobile Name"  style="border-radius:7px">
             <span class="error"><?php echo $mob_nameErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-user fa-2x"></i>
          </div>
        </div>

         <div class="col-md-12">
          <label for="memory" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Memory:
          </label>
          <div class="col-md-7">
            <input type="text" name="memory" class="form-control"  placeholder="Enter Memory Size"  style="border-radius:7px">
             <span class="error"><?php echo $memoryErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-user fa-2x"></i>
          </div>
        </div>
        
        <div class="col-md-12">
          <label for="osversion" class="col-md-3" style="padding-left:12%;padding-top:15px">
            OS Version :
          </label>
          <div class="col-md-7">
            <input type="text" name="os_version" class="form-control"  placeholder="Enter OS Version" style="border-radius:7px">
             <span class="error"><?php echo $os_versionErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-home fa-2x"></i>
          </div>
        </div>
        <div class="col-md-12">
          <label for="displaysize" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Display Size:
          </label>
          <div class="col-md-7">
            <input type="text" name="display" class="form-control"  placeholder="Enter Display Size " style="border-radius:7px">
             <span class="error"><?php echo $displayErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-volume-control-phone fa-2x"></i>
          </div>          
        </div>
        <div class="col-md-12">
          <label for="dimension" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Dimension:
          </label>
          <div class="col-md-7">
            <input type="text" name="dimension" class="form-control" placeholder="Enter Dimension" style="border-radius:7px">
             <span class="error"><?php echo $dimensionErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-mobile fa-3x"></i>
          </div>
        </div>
        
        <div class="col-md-12">
          <label for="camera" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Camera:
          </label>
          <div class="col-md-7">
            <input type="text" name="camera" class="form-control" placeholder="Enter Camera Pixel" style="border-radius:7px">
             <span class="error"><?php echo $cameraErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-mobile fa-3x"></i>
          </div>
        </div>
        
        <div class="col-md-12">
          <label for="device_condition" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Device Condition:
          </label>
          <div class="col-md-7">
            <input type="text" name="device_condition" class="form-control" placeholder="Enter Device Condition" style="border-radius:7px">
             <span class="error"><?php echo $device_conditionErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-mobile fa-3x"></i>
          </div>
        </div>

        <div class="col-md-12">
          <label for="Network" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Network:
          </label>
          <div class="col-md-7">
            <input type="text" name="network" class="form-control" placeholder="Enter Network Type" style="border-radius:7px">
             <span class="error"><?php echo $networkErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-mobile fa-3x"></i>
          </div>
        </div>

        <div class="col-md-12">
          <label for="sound" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Sound:
          </label>
          <div class="col-md-7">
            <input type="text" name="sound" class="form-control" placeholder="Enter Sound Condition" style="border-radius:7px">
             <span class="error"><?php echo $soundErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-mobile fa-3x"></i>
          </div>
        </div>

        <div class="col-md-12">
          <label for="warrenty" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Warrenty:
          </label>
          <div class="col-md-7">
            <input type="text" name="warrenty" class="form-control" placeholder="Enter Warrenty Period" style="border-radius:7px">
             <span class="error"><?php echo $warrentyErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-mobile fa-3x"></i>
          </div>
        </div>

        <div class="col-md-12">
          <label for="Battery" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Battery:
          </label>
          <div class="col-md-7">
            <input type="text" name="battery" class="form-control" placeholder="Enter Battery Period " style="border-radius:7px">
             <span class="error"><?php echo $batteryErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-mobile fa-3x"></i>
          </div>
        </div>

        <div class="col-md-12">
          <label for="warrenty" class="col-md-3" style="padding-left:12%;padding-top:15px">
            Price:
          </label>
          <div class="col-md-7">
            <input type="text" name="price" class="form-control" placeholder="Enter Price" style="border-radius:7px">
             <span class="error"><?php echo $priceErr;?></span> 
          </div>
          <div class="col-md-2">
            <i class="fa fa-mobile fa-3x"></i>
          </div>
        </div>

          
        <div class="col-md-12">         
          <div class="row text-center" style="padding-top: 2%">
           <button type="submit" class="btn btn-primary">Submit <i class="fa fa-user-plus"></i></button>
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
				<p class="footer-class">© 2017 City Mobile. All Rights Reserved | Design by <a href="#" target="_blank">Sanka</a></p>
			</div>
	</div>
</div>

<!--//footer-->
</body>
</html>