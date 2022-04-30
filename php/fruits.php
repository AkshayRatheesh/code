<html>
<head><title>Fruits Type</title>
<body>
<form action="">
<h3> Types of Fruits, Select one </h3>
<select name=select>
<option value="Apple"> Apple</option>
<option value="Pear">Pear</option>
<option value="Tomato">Tomato</option>
<option value="Peach"> Peach</option>
<option value="Cherry"> Cherry </option>
<option value="Bean">Bean</option>
<option value="Pea">Pea</option>
<option value="Coconut"> Coconut</option>
</select>
<input type=submit name=submit value="Submit Your Choice" >
</form></body>
</head></html>
<?php
echo "<h3>your favorate fruit is $_GET[select]</h3>";
?>



