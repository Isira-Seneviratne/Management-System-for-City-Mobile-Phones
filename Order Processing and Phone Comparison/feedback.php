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

$name = $_POST['user'];
$rating = $_POST['radio'];
$rating_1 = $_POST['radio_1'];

$sql = "INSERT INTO rating (name, rating ,rating_1)
VALUES ('$name', '$rating', '$rating_1')";

if ($conn->query($sql) === TRUE) {
   // echo "Rating is successfull";
   header('location:index.html');
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>