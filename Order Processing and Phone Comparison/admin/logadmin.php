<?php
session_start();
$username=  trim($_POST['username']);
$password=  trim($_POST['password']);

require_once('connection.php');
$sql1="select * from adminuser";
$result = mysqli_query($connection,$sql1);
$settime =time();

while($row = mysqli_fetch_array($result))
{
	if($row['username']==$username && $row['password']==$password)
	{ $_SESSION["username"]=$username;
	  $_SESSION["passwors"]=$password;
	header('location:main.php');
	  
      
    }
	else
	{
	  //$_SESSION["username"]="invalid";
	  header('location:index.php');
	  
	}
	
}


?>
