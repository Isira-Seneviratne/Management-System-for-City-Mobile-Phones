 <?php
 	include ("db.php");
   $id = $_POST['id'];
    
 	$sql="SELECT * FROM devices WHERE id=$id";
 	$result2=mysqli_query($conn,$sql);
     $row=mysqli_fetch_array($result2);
     
     $mob_brand=$row['mob_brand'];
     $mob_name=$row['mob_name'];
     $memory=$row['memory'];
     $os_version=$row['os_version'];
   	 $sound=$row['sound'];
     $camera=$row['camera'];
     $warrenty=$row['warrenty'];
     $device_condition=$row['device_condition'];
     $price=$row['price'];
     $dimension=$row['dimension'];
   	 $display=$row['display'];
     $battery=$row['battery'];
     $network=$row['network'];


    $data_ = array("status"=>"Successfull","mob_brand"=>$mob_brand,"mob_name"=>$mob_name,"memory"=>$memory,"os_version"=>$os_version,"sound"=>$sound,"camera"=>$camera,"price"=>$price,"warrenty"=>$warrenty,"display"=>$display,"dimension"=>$dimension,"device_condition"=>$device_condition, "battery"=>$battery, "network"=>$network,"warrenty"=>$warrenty);
    echo json_encode($data_);

 ?> 

<?php

// php code to search data in mysql database and set it in input text
/*
if(isset($_POST['search']))
{
    // id to search
    $id = $_POST['id'];
    
    // connect to mysql
    $connect = mysqli_connect("localhost", "root", "","citymobile");
    
    // mysql search query
    $query = "SELECT `mob_brand`, `mob_name`, `sound` FROM `devices` WHERE `id` = $id ";
    
    $result = mysqli_query($connect, $query);
    
    // if id exist 
    // show data in inputs
    if(mysqli_num_rows($result) > 0)
    {
      while ($row = mysqli_fetch_array($result))
      {
        $mob_name = $row['mob_name'];
        $mob_brand = $row['mob_brand'];
        $sound = $row['sound'];
      }  
    }
    
    // if the id not exist
    // show a message and clear inputs
    else {
        echo "Undifined ID";
            $mob_name = "";
            $mob_brand = "";
            $sound = "";
    }
    
    
    mysqli_free_result($result);
    mysqli_close($connect);
    
}

// in the first time inputs are empty
else{
    $mob_name = "";
    $mob_brand = "";
    $sound = "";
}

*/
?>
