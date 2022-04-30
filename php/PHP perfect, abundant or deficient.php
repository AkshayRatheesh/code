<html>
<head>
<title>Number</title>
</head>
<body>
<form action="" method="post">
Enter the number:<input type="number" name="num"><br>
<input type="submit" value="submit" value="submit">
</form>
</body>
</html>
<?php
$num=$_POST["num"];
$sum=0;
if(is_numeric($num)){
for($i=1;$i<$num;$i++){
$temp=$i;
if($num%$temp==0)
$sum=$sum+$i;
}
if($sum==$num)
echo "<b>".$num." is a perfect number"."</b>";
else if($sum<$num)
echo "<b>".$num." is a deficient number"."</b>";
else
 echo "<b>".$num." is an abundant number"."</b>";
}
?>