<?php

$connection = mysqli_connect('localhost','root','abcd1234','dbcitymobile');


//checking the connection
if (mysqli_connect_errno()) {
die('Error! Database not connected'. mysqli_connect_error());
}
//else
//{echo "connection succussfully.";
//}


?>
