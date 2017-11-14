<?php session_start();
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Admin Area</title>
<style type="text/css">
<!--
#Layer1 {
	position:absolute;
	width:441px;
	height:39px;
	z-index:1;
	left: 308px;
	top: 53px;
	background-color: #3366FF;
}
#Layer2 {
	position:absolute;
	width:163px;
	height:30px;
	z-index:2;
	left: 457px;
	top: 134px;
}
.style2 {
	color: #003300;
	font-weight: bold;
	font-size: 18px;
	font-family: Arial, Helvetica, sans-serif;
}
#Layer3 {
	position:absolute;
	width:294px;
	height:197px;
	z-index:3;
	left: 378px;
	top: 176px;
}
.style7 {color: #FFFFFF; font-weight: bold; font-family: Arial, Helvetica, sans-serif; }
#Layer4 {
	position:absolute;
	width:56px;
	height:23px;
	z-index:4;
	left: 503px;
	top: 397px;
}
#Layer5 {
	position:absolute;
	width:200px;
	height:22px;
	z-index:5;
	left: 437px;
	top: 101px;
}
.style8 {color: #FF0000}
#Layer6 {
	position:absolute;
	width:931px;
	height:80px;
	z-index:6;
	left: 38px;
	top: 2px;
	background-color: #003300;
}
.style11 {font-family: Arial, Helvetica, sans-serif}
.style12 {color: #FFFFFF}
.style1 {	font-family: Arial, Helvetica, sans-serif;
	color: #FFFFFF;
}
-->
</style>
</head>

<body>

<form action="logadmin.php" method="post" name="form1">
  <div class="style2" id="Layer2">Please Login </div>
<div id="Layer3">
  <table width="297" height="197" border="1" cellpadding="1" bordercolor="#003300">
    <tr>
      <td width="84" bgcolor="#003300"><div align="center" class="style7">User Name </div></td>
      <td width="197"><label>
        <div align="center">
          <input name="username" type="text" id="username" />
          </div>
      </label></td>
    </tr>
    <tr>
      <td bgcolor="#003300"><div align="center" class="style7">Password</div></td>
      <td><label>
        <div align="center">
          <input name="password" type="password" id="password" />
          </div>
      </label></td>
    </tr>
  </table>
</div>
<div id="Layer4">

    <label>
    <input type="submit" name="Submit" value="Submit" />
    </label>

</div>
</form>
<blockquote>
  <p>&nbsp;</p>
   <?php if (isset($_SESSION['username'])){
 if($_SESSION['username']=="invalid"){?>
  <div class="style8" id="Layer5">Invalid username and password </div>
  <?php }}?>
  
  <div class="style11" id="Layer6">
    <h1 align="center" class="style12"><span class="style1">CITY MOBILE</span> - Admin Area </h1>
  </div>
 
</blockquote>
</body>
</html>
