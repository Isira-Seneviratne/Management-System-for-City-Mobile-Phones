<?php session_start();
if (!isset($_SESSION['username']))
 {header('location:index.php');}
 require_once('connection.php');
?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>DISPLAY USERS</title>
</head>
<body>

	
<?php 

$query = "SELECT * FROM user";
$result = mysqli_query($connection, $query);

if (mysqli_num_rows($result)>0) {
	echo '<table border="2" align="center"><tr bgcolor="yellow"><th colspan="5"><h1>USERS LIST</h1></th></tr>';
	echo '<tr><th>ID</th><th>FIRST NAME</th><th>LAST NAME</th><th>EMAIL</th><th>LAST LOGIN</th></tr>';
	// output of data
	while ($row = mysqli_fetch_array($result)) {
		echo "<tr><td>".$row['id']."</td>"; 
		echo "<td>".$row['firstName']."</td>";
		echo "<td>".$row['lastName']."</td>";
		echo "<td>".$row['email']."</td>";
		echo "<td>".$row['lastLogin']."</td>";

		echo "</tr>";
	}
	echo '</table>';
}
else
		{echo 'No records found';}




 ?>

</body>
</html>