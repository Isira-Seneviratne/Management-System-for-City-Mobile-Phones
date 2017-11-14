<?php require_once('functions.php'); ?>
<?php require_once('connection.php'); ?>


<?php 
$result_set="";
$errors =array();

$firstName = "";
$lastName = "";
$email = "";
$password ="";



if (isset($_POST['submit'])) {

$firstName = $_POST['firstName'];
$lastName = $_POST['lastName'];
$email = $_POST['email'];

		if (empty(trim($_POST['firstName']))) {
			$errors[] = 'First Name is invalid';
		}
			if (!preg_match("/^[a-zA-Z ]*$/",$firstName))
            {
            $errors[] = "Use only letters for First Name"; 
            }
	
		if (empty(trim($_POST['lastName']))) {
			$errors[] = 'Last Name is invalid';
		}
	
			if (!preg_match("/^[a-zA-Z ]*$/",$lastName))
               {
               $errors[] = "Use only letters for Last Name";
               }
	
		
		if (empty(trim($_POST['email']))) {
			$errors[] = 'Email Address is invalid';
		}
		if (empty(trim($_POST['password']))) {
			$errors[] = 'Password is invalid';
		}	
		if(preg_match("/^.*(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$/", $_POST["password"]) === 0)
				{
				$errors[] = 'Password must be at least 8 characters and 				                  must contain at least one lowercase letter,
				 one uppercase letter and one digit';
				}

		if (empty(trim($_POST['conPassword']))) {
			$errors[] = 'Confirm Password is invalid';
			
		}
	
		if (($_POST['password']) != ($_POST['conPassword'])) {
			$errors[] = 'Confirm Password is not matched';
		}



if (!is_email($_POST['email'])) {
	$errors[] = 'Invalid email format';
}
//checking if email address already exists:
$email = mysqli_real_escape_string($connection, $_POST['email']);
$query = "SELECT * FROM user WHERE email = '{$email}' LIMIT 1";

$result = mysqli_query($connection, $query);

if ($result) {
	if (mysqli_num_rows($result) == 1) {
	$errors[] = 'Email address already exists';
	}

	else {

		if (empty($errors)) {

		//No errors found.... saving a new record..
		

		$firstName = mysqli_real_escape_string($connection, $_POST['firstName']);
		$lastName = mysqli_real_escape_string($connection, $_POST['lastName']);
		$password = mysqli_real_escape_string($connection, $_POST['conPassword']);

		$hashedPassword = sha1($password);


		$query1 = "INSERT INTO user (firstName,lastName,email,hashedPassword) VALUES ('{$firstName}','{$lastName}','{$email}','{$hashedPassword}')";

		$result_set = mysqli_query($connection, $query1);
		}

		if ($result_set) {
			//query successfull... redirect to login..
			header('location: login.php?register=yes');
		}
		//else
		//	{echo 'Database error!';}
		

}

}
//else {echo 'Database error';}



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
		
	<form action="registration.php" method="post">
	<fieldset>
	<legend><h3></h3></legend>
		<legend><h3>REGISTRATION FORM</h3></legend>
<?php 
if (!empty($errors)) {
	echo '<div class="error">';
	echo '<b>Field(s) are empty or invalid</b>'. '<br>';
	foreach ($errors as $error) {
		echo $error. '<br>';
	}
	echo '</div>';
}
?>

		<p>
		<label>	FIRST NAME </label>
		<input type="text" name="firstName" <?php echo 'value="'.$firstName.'"'; ?> >
		</p>
		<p>
		<label>	LAST NAME </label>
		<input type="text" name="lastName" <?php echo 'value="'.$lastName.'"' ; ?> >
		</p>
		<p>
		<label>	E-MAIL ADDRESS </label>
		<input type="text" name="email" <?php echo 'value="'.$email.'"'; ?>>
		</p>
		<p>
		<label>	PASSWORD </label>
		<input type="password" name="password">
		</p>
		<p>
		<label>	CONFIRM PASSWORD </label>
		<input type="password" name="conPassword">
		</p>
		<p>
		<input type="submit" name="submit" value="REGISTER">
		</p>
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