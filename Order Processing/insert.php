
<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "citymobile";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$item = $_POST['txtItem'];
$date = $_POST['date'];
$price = $_POST['txtPrice'];
$quantity = $_POST['qty'];
$total = $_POST['txtTot'];

$sql = "INSERT INTO orders (item_Id,Date,price,quantity,order_Total)
VALUES ('$item', '$date','$price','$quantity','$total')";

if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>