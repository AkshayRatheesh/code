<html>
<body>
    <form action="" method="POST">
        <H1>
        Enter the string :</h1>
        <input type="text" name="str" />
        <input type="submit" />
    </form>
</html>
<?php
if ($_POST) {
    $string = $_POST["str"];
    $len = strlen($string);
    for ($i = ($len - 1); $i >= 0; $i--) {
        echo $string[$i];
    }
}
?>