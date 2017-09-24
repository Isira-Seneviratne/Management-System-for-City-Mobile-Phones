<?php

$connection = mysqli_connect('localhost','root','','citymobile');


//checking the connection
if (mysqli_connect_errno()) {
die('Error! Database not connected'. mysqli_connect_error());
}
//else
//{echo "connection succussfully.";
//}


?>