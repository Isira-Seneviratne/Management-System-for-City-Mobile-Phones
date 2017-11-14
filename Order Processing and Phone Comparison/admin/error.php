<?php session_start();
  if (!isset($_SESSION['username']))
 {header('location:index.php');}
 include 'connectToDb.php';
 $message=$_GET['msg'];
      $link=$_GET['lnk'];
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>CRC SRILANKA Admin Area </title>
<style type="text/css">
<!--
#Layer1 {
	position:absolute;
	width:205px;
	height:77px;
	z-index:1;
	left: 5px;
	top: 128px;
}
.style1 {
	font-family: Arial, Helvetica, sans-serif;
	color: #FFFFFF;
}
#Layer2 {
	position:absolute;
	width:2486px;
	height:115px;
	z-index:2;
}
#Layer3 {
	position:absolute;
	width:985px;
	height:115px;
	z-index:2;
	background-color: #003300;
	left: 3px;
	top: 8px;
}
.style2 {color: #0033FF}
#Layer4 {
	position:absolute;
	width:200px;
	height:89px;
	z-index:3;
	left: 6px;
	top: 224px;
}
#Layer5 {
	position:absolute;
	width:200px;
	height:91px;
	z-index:4;
	left: 5px;
	top: 320px;
}
#Layer6 {
	position:absolute;
	width:312px;
	height:61px;
	z-index:5;
	left: 380px;
	top: 147px;
	background-color: #003300;
}
.style3 {color: #FFFFFF}
#Layer7 {
	position:absolute;
	width:356px;
	height:26px;
	z-index:6;
	left: 362px;
	top: 222px;
}
#Layer8 {
	position:absolute;
	width:200px;
	height:21px;
	z-index:7;
	left: 441px;
	top: 276px;
}
.style4 {
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
}
.style5 {color: #003333}
.style6 {color: #003300}
#Layer9 {
	position:absolute;
	left:5px;
	top:420px;
	width:195px;
	height:100px;
	z-index:8;
}
-->
</style>
</head>

<body>
<div id="Layer1">
  <table width="200" height="87" border="1" cellpadding="0" cellspacing="0" bordercolor="#003300">
    <tr>
      <th bordercolor="#FFFFFF" bgcolor="#003300" scope="col"><span class="style1">Admin Profile </span></th>
    </tr>
    <tr>
      <td><div align="center" class="style2">
        <div align="left"><a href="changepassword.php" class="style5">Change Password </a></div>
      </div></td>
    </tr>
    <tr>
      <td><div align="center" class="style2">
        <div align="left"><a href="logout.php" class="style6">Logout</a></div>
      </div></td>
    </tr>
  </table>
</div>
<div id="Layer3">
  <div align="center">
    <h1 class="style1">CRC SRI LANKA  Admin Area </h1>
  </div>
</div>
<div id="Layer9"> 
  <table width="200" height="87" border="1" cellpadding="0" cellspacing="0" bordercolor="#003300">
    <tr>
      <th bordercolor="#FFFFFF" bgcolor="#003300" scope="col"><span class="style1">Manage Files </span></th>
    </tr>
    <tr>
      <td background="addfiles.php"><div align="center" class="style2">
        <div align="left" class="style3"><a href="addfiles.php">Add Files </a> </div>
      </div></td>
    </tr>
    <tr>
      <td><div align="center" class="style2">
        <div align="left" class="style3"><a href="removefiles.php?page=1">Remove Files </a> </div>
      </div></td>
    </tr>
</table></div>
<p>&nbsp; </p>
<div id="Layer4">
  <table width="200" height="87" border="1" cellpadding="0" cellspacing="0" bordercolor="#003300">
    <tr>
      <th bordercolor="#FFFFFF" bgcolor="#003300" scope="col"><span class="style1">Manage News </span></th>
    </tr>
    <tr>
      <td><div align="center" class="style2">
        <div align="left" class="style6"><a href="addnews.php" class="style6">Add News </a><a href="addnews.php"></a></div>
      </div></td>
    </tr>
    <tr>
      <td><a href="editnews.php?page=1" class="style6">Edit News </a></td>
    </tr>
  </table>
</div>
<div id="Layer5">
  <table width="200" height="87" border="1" cellpadding="0" cellspacing="0" bordercolor="#003300">
    <tr>
      <th bordercolor="#FFFFFF" bgcolor="#003300" scope="col"><span class="style1">Manage Video </span></th>
    </tr>
    <tr>
      <td><div align="center" class="style2">
        <div align="left" class="style6"><a href="addvideo.php">Add Video</a> </div>
      </div></td>
    </tr>
    <tr>
      <td><div align="center" class="style2">
        <div align="left" class="style6"><a href="removevideo.php">Remove Vedio</a> </div>
      </div></td>
    </tr>
  </table>
</div>
<div id="Layer6">
  <div align="center" class="style3">
    <h2>ERROR</h2>
  </div>
</div>
<div id="Layer7">
  <div align="center">
    <h4><font face="Verdana, Arial, Helvetica, sans-serif"color="#FF0000"><?php echo $message;?></font></h4>
  </div>
</div>
<div id="Layer8">
  <div align="center" class="style4"><a href="<?php echo $link;?>" class="style6">Back</a></div>
</div>
</body>
</html>
