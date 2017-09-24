<?php require_once('connection.php');  ?>
<?php 

/*
INSERT INTO table_name (
	column1, column2, ...)
VALUES (
value1, value2,...
)
*/
$firstName = 'Chaminda';
$lastName = 'Perera';
$email = 'chaminda@gmail.com';
$password = 'hello';

$hashedPassword = sha1($password);
$isDeleted = 0;

//check hashed password
//echo $hashedPassword;
 
$query = "INSERT INTO user (firstName,lastName,email,hashedPassword,isDeleted) VALUES ('{$firstName}','{$lastName}','{$email}','{$hashedPassword}','{$isDeleted}')";



$result	=	mysqli_query($connection,$query);

if ($result) {
	echo "1 record is added";
}
else {
	echo "database error!";
}



 ?>


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Insert Query</title>
</head>
<body>
	
</body>
</html>