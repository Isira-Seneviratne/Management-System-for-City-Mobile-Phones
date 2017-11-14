<?php require_once('connection.php'); ?>



<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>DISPLAY USERS</title>
</head>
<body>
	
<?php 

$query = "SELECT * FROM orders";
$result = mysqli_query($connection, $query);

if (mysqli_num_rows($result)>0) {
	echo '<table border="2" align="center"><tr bgcolor="yellow"><th colspan="9"><h1>ORDERS LIST</h1></th></tr>';
	echo '<tr><th>ID</th><th>PRODUCT ID</th><th>PRODUCT NAME</th><th>PRICE</th><th>QUANTITY</th><th>DISCOUNT</th><th>TOTAL</th><th>USER</th><th>DATE & TIME</th></tr>';
	// output of data
	while ($row = mysqli_fetch_array($result)) {
		echo "<tr><td>".$row['id']."</td>"; 
		echo "<td>".$row['productId']."</td>";
		echo "<td>".$row['product']."</td>";
		echo "<td>".$row['price']."</td>";
		echo "<td>".$row['quantity']."</td>";
		echo "<td>".$row['discount']."</td>";
		echo "<td>".$row['total']."</td>";
		echo "<td>".$row['user']."</td>";
		echo "<td>".$row['buyDate']."</td>";

		echo "</tr>";
	}
	echo "</table>";
}
else
		{echo 'No records found';}




 ?>

</body>
</html>