<?php

$servername="localhost";
$username="root";
$password="abcd1234";
$dbname="dbcitymobile";
$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 
?> 
