<?php session_start();  ?>

<?php require_once('connection.php'); ?>

<?php
//check for form submission
if (isset($_POST['submit'])) {

	$errors = array();

// check if the username & password has been entered.
if (!isset($_POST['email']) || strlen(trim($_POST['email']))<1 ) {
		$errors[] = 'Username is invalid or empty';
	}	

if (!isset($_POST['password']) || strlen(trim($_POST['password']))<1 ) {
		$errors[] = 'Password is invalid or empty';
	}	

// check if there are any errors in the form
	if (empty($errors)) {
		// save username & password into variables.
		$email = mysqli_real_escape_string($connection,$_POST['email']);
		$password = mysqli_real_escape_string($connection,$_POST['password']);
		$hashedPassword = sha1($password);
		

	// prepare database query
		$query ="SELECT * FROM user 
		WHERE email = '{$email}' AND hashedPassword ='{$hashedPassword}' 
		LIMIT 1";

	$result = mysqli_query($connection,$query);	

	if ($result) 
	{
		//query successfull
		if(mysqli_num_rows($result) ==1) 
		{
			//valid user found
			$user = mysqli_fetch_assoc($result);
			$_SESSION['user_id'] = $user['id'];
			$_SESSION['firstName'] = $user['firstName'];

			
			//last login date and time
			$query2 = "UPDATE user SET lastLogin = NOW() WHERE id = {$_SESSION['user_id']} LIMIT 1";

			$resultLogin = mysqli_query($connection,$query2);
			
			
			
			header('location:shop.php');
		} 
		else 
		{// query successfull but username & password invalid
			$errors [] = 'Invalid username & password';
		}
	}
	else
	{$errors = 'Database error!';}

	}

}

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
<link href="css/main.css" rel="stylesheet" type="text/css" />
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
		<div class="col-sm-4 logo"> <a href="index.php"><img src="images/logo.png" alt=""></a> </div>
		<div class="col-sm-4 header-left">		
			
					

					
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
<!--//header-->
  
<div class="login_account">
	<form action="login.php" method="post">
		<fieldset>
			<legend><h1>LOG IN</h1></legend>

		<?php
		if (isset($errors) && !empty($errors)) {
			echo '<p class="error">Invalid username & password</p>';
		}


		?>
		<!--<p class="error">Invalid username & password</p> -->

		<p>
		<label>User Name</label>
		<input type="text" name="email" placeholder="Enter email id">		
		</p>
		<p>
		<label>Password</label>
		<input type="password" name="password" placeholder="password">
		</p>
		<p>
		<button type="submit" name="submit">Login </button>
		</p>
		<label>Not Registered? <a href="registration.php">Register</label>
		</fieldset>
		</form>             
			  
</div>
	
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
<?php mysqli_close($connection); ?>