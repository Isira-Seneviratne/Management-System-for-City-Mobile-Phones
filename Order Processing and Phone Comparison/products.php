<?php session_start(); ?>
<?php require_once('connection.php'); ?>
<?php 
//checking if user logged in
if (!isset($_SESSION['user_id'])) {
	header('Location:login.php');
}
?>

<?php 
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
		
				$query = "INSERT INTO products (productId,product,price,quantity,discount,total,user) VALUES ({$id},'{$product}',{$price},{$quantity},{$discount},{$total},'{$user}')";

				$result = mysqli_query($connection, $query);

				if ($result) {
					//query successfull... redirect to login..
				echo 'data inserted to database';
				}
				else
					{echo 'data not enter';}



				}
				







}
 ?>




<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>products</title>
</head>
<body>
	<header>Welcome <?php echo $_SESSION['firstName']; ?> <a href="logout.php">Log out </a></header>

<h1>PRODUCTS PAGE</h1>
<?php 
if (!empty($error)) {
	echo '<b>required field(s) are empty!</b><br>';

	foreach ($error as $display) {
		echo $display.'<br>';
	}
}
 ?>

<form action="products.php" method="post">
<table>
<tr><td>PRODUCT ID</td><td><input type="text" name="id"></td></tr>
<tr><td>PRODUCT NAME</td><td><input type="text" name="product"></td></tr>	
<tr><td>PRODUCT PRICE</td><td><input type="text" name="price"></td></tr>
<tr><td>QUANTITY</td><td><input type="text" name="quantity"></td></tr>
<tr><td>DISCOUNT</td><td><input type="text" name="discount"></td></tr>
<tr><td>TOTAL</td><td><input type="text" name="total"></td></tr>
<input type="submit" name="submit" value="BUY">


</table>




</form>
	
</body>
</html>
<?php mysqli_close($connection); ?>