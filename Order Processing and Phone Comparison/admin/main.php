<?php session_start();
if (!isset($_SESSION['username']))
 {header('location:index.php');}
 require_once('connection.php');
?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>main page</title>
</head>
<body>
<header>Welcome <?php echo $_SESSION['username']; ?> <a href="logout.php">Log out </a></header>
	

	<table align="center" cellpadding="10" width="50%">
	<tr><td align="center"><h2>USER LIST</h2></td><td align="center"><h2>ORDER LIST</h2></td><td align="center"><h2>ADD MOBILE</h2></td></tr>
	<tr><td align="center"><a href="display.php"><img src="css/users.png" alt="users" height="200px" width="200px"></a> </td><td align="center"><img src="css/orders.png" alt="users" height="200px" width="250px"></a> </td><td><a href="addmobile.php"><img src="css/mobiles.png" alt="users" height="200px" width="200px"></a> </td></tr>
	<tr><td align="center"><input type="button" value="Show users" onclick="window.open('display.php','popUpWindow','height=500,width=700,left=100,top=100,resizable=yes,scrollbars=yes,toolbar=yes,menubar=no,location=no,directories=no, status=yes');"></td>
		<td align="center"><input type="button" value="Show orders" onclick="window.open('orderList.php','popUpWindow','height=500,width=800,left=100,top=100,resizable=yes,scrollbars=yes,toolbar=yes,menubar=no,location=no,directories=no, status=yes');"></td>
		<td align="center"><input type="button" value="Add mobiles" onclick="window.open('addmobile.php','popUpWindow','height=500,width=800,left=100,top=100,resizable=yes,scrollbars=yes,toolbar=yes,menubar=no,location=no,directories=no, status=yes');"></td></tr>



	</table>
</body>
</html>