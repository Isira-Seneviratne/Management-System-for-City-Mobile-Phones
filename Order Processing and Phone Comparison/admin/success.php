<?php session_start();
  if (!isset($_SESSION['username']))
 {header('location:index.php');}
 include 'connectToDb.php';
 $message=$_GET['msg'];
 $link=$_GET['lnk'];?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>ARROW CAB Admin Area</title>
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
	left: 6px;
	top: 6px;
}
.style2 {color: #0033FF}
#Layer4 {
	position:absolute;
	width:200px;
	height:89px;
	z-index:3;
	left: 4px;
	top: 221px;
}
#Layer5 {
	position:absolute;
	width:200px;
	height:91px;
	z-index:4;
	left: 6px;
	top: 319px;
}
#Layer6 {
	position:absolute;
	width:348px;
	height:63px;
	z-index:5;
	left: 344px;
	top: 153px;
	background-color: #003300;
}
.style3 {color: #FFFFFF}
#Layer7 {
	position:absolute;
	width:411px;
	height:56px;
	z-index:6;
	left: 311px;
	top: 230px;
	overflow: hidden;
}
.style5 {color: #003300}
#Layer8 {
	position:absolute;
	width:70px;
	height:33px;
	z-index:7;
	left: 489px;
	top: 79px;
}
.style6 {font-size: x-large}
#Layer9 {
	position:absolute;
	left:5px;
	top:414px;
	width:197px;
	height:100px;
	z-index:7;
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
        <div align="left"><a href="logout.php" class="style5">Logout</a></div>
      </div></td>
    </tr>
  </table>
</div>
<div id="Layer3">
  <div align="center">
    <h1 class="style1">ARROW CAB Admin Area </h1>
  </div>
</div>
<p>&nbsp; </p>
<div id="Layer4">
  <table width="200" height="87" border="1" cellpadding="0" cellspacing="0" bordercolor="#003300">
    <tr>
      <th bordercolor="#FFFFFF" bgcolor="#003300" scope="col"><span class="style1">Manage Categories </span></th>
    </tr>
    <tr>
      <td><div align="center" class="style2">
        <div align="left" class="style5"><a href="addnews.php" class="style5">Add News </a><a href="addnews.php"></a></div>
      </div></td>
    </tr>
    <tr>
      <td><a href="editnews.php?page=1" class="style5">Edit News </a></td>
    </tr>
    <tr>
    </tr>
    <tr>
      <td><div align="center" class="style2">
        
          <div class="style6" id="Layer8"><a href="<?php echo $link ?>">Back</a></div>
        
    </div></td>
    </tr>
  </table>
</div>

s
<div id="Layer6">
  <div align="center" class="style3">
    <h2>Success</h2>
  </div>
</div>
<div id="Layer7">
 <h4>
 <div align="center"><font face="Verdana, Arial, Helvetica, sans-serif"color="#FF0000"><?php echo $message;?></font></div>
</div>
<h2>&nbsp;</h2>
</body>
</html>
