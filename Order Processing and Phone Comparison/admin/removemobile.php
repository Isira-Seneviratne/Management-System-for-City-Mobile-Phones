<?php 
include_once 'db.php';



$id=(int)$_GET["id"];

$sql4="DELETE FROM devices WHERE id=$id";

mysqli_query($conn,$sql4);

  header('location:mobiledetails.php');


?>